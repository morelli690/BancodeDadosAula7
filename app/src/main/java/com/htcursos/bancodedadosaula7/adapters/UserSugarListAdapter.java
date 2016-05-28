package com.htcursos.bancodedadosaula7.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.htcursos.bancodedadosaula7.R;
import com.htcursos.bancodedadosaula7.models.User;
import com.htcursos.bancodedadosaula7.models.UserSugar;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Cesar on 07/05/2016.
 */
public class UserSugarListAdapter extends ArrayAdapter<UserSugar> {
//recebe o contexto e a lista de usuarios
    public UserSugarListAdapter(Context context, List<UserSugar> userList) {
        super(context, R.layout.item_user_list_exaula5, userList);
    }

    public class ViewHolder{
        @BindView(R.id.user_name)
        TextView name;
        @BindView(R.id.email)
        TextView email;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView == null) {
            convertView = View
                    .inflate(getContext(), R.layout.item_user_list_exaula5, null);
            holder = new ViewHolder();
            ButterKnife.bind(holder, convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        final UserSugar user = getItem(position);
        if(user != null){
            holder.name.setText(user.getName());
            holder.email.setText(user.getEmail());
        }
        return convertView;
    }
}

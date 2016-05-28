package com.htcursos.bancodedadosaula7.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.htcursos.bancodedadosaula7.R;
import com.htcursos.bancodedadosaula7.models.User;
import com.htcursos.bancodedadosaula7.models.UserExAula5;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Cesar on 07/05/2016.
 */
public class UserListAdapterExAula5 extends ArrayAdapter<UserExAula5> {
//recebe o contexto e a lista de usuarios
    public UserListAdapterExAula5(Context context, List<UserExAula5> userList) {
        super(context, R.layout.item_user_list, userList);
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
        final UserExAula5 userExAula5 = getItem(position);
        if(userExAula5 != null){
            holder.name.setText(userExAula5.getNome());
            holder.email.setText(userExAula5.getEmail());
        }
        return convertView;
    }
}

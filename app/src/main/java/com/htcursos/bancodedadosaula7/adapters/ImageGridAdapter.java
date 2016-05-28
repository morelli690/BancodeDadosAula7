package com.htcursos.bancodedadosaula7.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.htcursos.bancodedadosaula7.R;
import com.htcursos.bancodedadosaula7.models.User;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Cesar on 07/05/2016.
 */
public class ImageGridAdapter extends ArrayAdapter<Integer> {
//recebe o contexto e a lista de usuarios
    public ImageGridAdapter(Context context, Integer[] images) {
        super(context, R.layout.item_image_grid, images);
    }

    public class ViewHolder{
        @BindView(R.id.image)
        ImageView image;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView == null) {
            convertView = View
                    .inflate(getContext(), R.layout.item_image_grid, null);
            convertView.setLayoutParams(new GridView.LayoutParams(200,200));
            holder = new ViewHolder();
            ButterKnife.bind(holder, convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        final Integer image = getItem(position);
        if(image != null){

            holder.image.setImageResource(image);
        }
        return convertView;
    }
}

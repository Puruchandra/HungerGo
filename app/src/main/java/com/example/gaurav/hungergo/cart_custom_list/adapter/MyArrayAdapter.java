package com.example.gaurav.hungergo.cart_custom_list.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.gaurav.hungergo.R;
import com.example.gaurav.hungergo.cart_custom_list.pojo.Mypojo;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by gaurav on 7/4/2017.
 */

public class MyArrayAdapter extends ArrayAdapter {

    Context context;
    int resource;
    ArrayList<Mypojo> arrayList;
    LayoutInflater inflater;
    public MyArrayAdapter(Context context, int resource, ArrayList<Mypojo> arraylist) {
        super(context, resource, arraylist);

        this.context=context;
        this.resource=resource;
        this.arrayList=arraylist;
        inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=inflater.inflate(resource,null);

        CircleImageView circleImageView= (CircleImageView) view.findViewById(R.id.circleview_cart_image);
        TextView cart_item_name= (TextView) view.findViewById(R.id.textview_item_name_cart);
        TextView cart_item_price= (TextView) view.findViewById(R.id.textview_cart_price);
        TextView cart_counter_item= (TextView) view.findViewById(R.id.textView_cart_item_counter);
        Mypojo mypojo=arrayList.get(position);
        Glide.with(context).load(mypojo.getCartimage()).into(circleImageView);
        cart_item_name.setText(mypojo.getCart_item_name());
        cart_item_price.setText(mypojo.getCart_item_price());

    return  view;
    }
}

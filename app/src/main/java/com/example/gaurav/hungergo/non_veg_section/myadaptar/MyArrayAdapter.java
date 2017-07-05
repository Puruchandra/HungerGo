package com.example.gaurav.hungergo.non_veg_section.myadaptar;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.gaurav.hungergo.R;
import com.example.gaurav.hungergo.non_veg_section.pojo.ListPojo;

import java.util.ArrayList;

/**
 * Created by gaurav on 7/2/2017.
 */

public class MyArrayAdapter extends ArrayAdapter {
    private  Context context;
    private  int layoutResource;
    private ArrayList<ListPojo> pojoArraylist;
    private LayoutInflater inflator;
int cart_counter=0;
    public MyArrayAdapter(Context context, int resource, ArrayList<ListPojo> arrayList) {
        super(context, resource, arrayList);

        this.context=context;
        this.layoutResource=resource;
        this.pojoArraylist=arrayList;
        inflator= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

       View view=inflator.inflate(layoutResource,null);
        final ImageView imageView= (ImageView) view.findViewById(R.id.imageview_veglist_item);
        ImageView imageSymbol= (ImageView) view.findViewById(R.id.imageview_listitem_symbol);
        TextView veg_item_name= (TextView) view.findViewById(R.id.textview_vegsection_item_name);
        TextView veg_item_discription= (TextView) view.findViewById(R.id.textview_vegsection_itemdetail);
        TextView item_price= (TextView) view.findViewById(R.id.textview_vegsection_totalcost);
        final TextView veg_cart_counter= (TextView) view.findViewById(R.id.textview_veglistitem_cart_counter);
        LinearLayout layout= (LinearLayout) view.findViewById(R.id.list_item_full_layout);
        //final View view_back_changer=view.findViewById(R.id.view_listitem_onselect_backgrounddull);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setBackgroundColor(Color.argb(157,255,255,255));
                cart_counter++;
                veg_cart_counter.setText(cart_counter+"");
            }
        });
        ListPojo listPojo=pojoArraylist.get(position);
        //imageView.setImageResource(listPojo.getImage());
        Glide.with(context).load(listPojo.getImage()).into(imageView);
        veg_item_name.setText(listPojo.getItem_name());
        veg_item_discription.setText(listPojo.getDiscription());
        item_price.setText(listPojo.getPrice());
      Glide.with(context).load(listPojo.getSymbolImage()).into(imageSymbol);

        view.setMinimumHeight(650);
        return view;
    }
}

package com.example.android.sportup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 11/19/2017.
 */

public class CardAdapter extends ArrayAdapter<CardModel>{
    public CardAdapter(Context context, ArrayList<CardModel> card){
        super(context,0,card);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        CardModel model = getItem(position);
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.card, parent, false);
        }
            TextView type = (TextView) convertView.findViewById(R.id.type);
            TextView organizer = (TextView) convertView.findViewById(R.id.organizer);
            TextView time = (TextView) convertView.findViewById(R.id.time);
            type.setText(model.getType());
            organizer.setText(model.getOrganizer());
            time.setText(model.getTime());
        return convertView;
    }
}

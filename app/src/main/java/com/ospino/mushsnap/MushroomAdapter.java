package com.ospino.mushsnap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class MushroomAdapter extends ArrayAdapter<Mushroom> {

    public MushroomAdapter(@NonNull Context context, List<Mushroom> skinLesions) {
        super(context, 0, skinLesions);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_listview, parent, false);
        }

        Mushroom mushroom = getItem(position);

        String type = mushroom.getType();
        TextView typeTextView = (TextView) listItemView.findViewById(R.id.lesion);
        typeTextView.setText(type);

        String probability = mushroom.getProbability();
        probability = probability + "%";
        TextView probabilityTextView = (TextView) listItemView.findViewById(R.id.probability);
        probabilityTextView.setText(probability);

        return listItemView;
    }
}
package com.example.android.allahabadtourism.adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.allahabadtourism.R;
import com.example.android.allahabadtourism.abstract_type.Attraction;
import com.example.android.allahabadtourism.activities.AttractionDetail;

import java.util.ArrayList;

/**
 * Created by RajBaba on 15-08-2017.
 */
public class AttractionAdapter extends ArrayAdapter<Attraction> {
    private int mColorResourceId;

    public AttractionAdapter(Activity context, ArrayList<Attraction> attraction, int colorResourceId) {
        super(context, 0, attraction);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.attraction_list_item, parent, false);
        }
        Attraction currentAttraction = getItem(position);
        final TextView attractionNameTextView = (TextView) listItemView.findViewById(R.id.attraction_name_textView);
        attractionNameTextView.setText(currentAttraction.getGetAttractionName());
        TextView attractionShortTextView = (TextView) listItemView.findViewById(R.id.attraction_short_desc_textView);
        attractionShortTextView.setText(currentAttraction.getAttractionShortDesc());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_attraction);
        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.linear_layout_attraction);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String flag = attractionNameTextView.getText().toString();
                String[] attraction_name = getContext().getResources().getStringArray(R.array.attraction_name);
                if (flag.equalsIgnoreCase(attraction_name[0])) {
                    Intent intent = new Intent(getContext(), AttractionDetail.class);
                    intent.putExtra("keys_attraction", 0);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(attraction_name[1])) {
                    Intent intent = new Intent(getContext(), AttractionDetail.class);
                    intent.putExtra("keys_attraction", 1);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(attraction_name[2])) {
                    Intent intent = new Intent(getContext(), AttractionDetail.class);
                    intent.putExtra("keys_attraction", 2);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(attraction_name[3])) {
                    Intent intent = new Intent(getContext(), AttractionDetail.class);
                    intent.putExtra("keys_attraction", 3);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(attraction_name[4])) {
                    Intent intent = new Intent(getContext(), AttractionDetail.class);
                    intent.putExtra("keys_attraction", 4);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(attraction_name[5])) {
                    Intent intent = new Intent(getContext(), AttractionDetail.class);
                    intent.putExtra("keys_attraction", 5);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(attraction_name[6])) {
                    Intent intent = new Intent(getContext(), AttractionDetail.class);
                    intent.putExtra("keys_attraction", 6);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(attraction_name[7])) {
                    Intent intent = new Intent(getContext(), AttractionDetail.class);
                    intent.putExtra("keys_attraction", 7);
                    getContext().startActivity(intent);

                }
            }
        });
        iconView.setImageResource(currentAttraction.getImageResourceId());
        View textContainer = listItemView.findViewById(R.id.attraction_text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }

}


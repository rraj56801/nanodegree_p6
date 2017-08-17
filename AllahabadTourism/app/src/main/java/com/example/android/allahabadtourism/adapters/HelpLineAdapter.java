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
import com.example.android.allahabadtourism.abstract_type.Activities;
import com.example.android.allahabadtourism.abstract_type.HelpLine;
import com.example.android.allahabadtourism.activities.ActivityDetail;

import java.util.ArrayList;

/**
 * Created by RajBaba on 17-08-2017.
 */
public class HelpLineAdapter extends ArrayAdapter<HelpLine>{
    private int mColorResourceId;

    public HelpLineAdapter(Activity context, ArrayList<HelpLine> helpLine, int colorResourceId) {
        super(context, 0, helpLine);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.helpline_list_item, parent, false);
        }
        final HelpLine currentHelpLine = getItem(position);
        final TextView activityPositionTextView= (TextView) listItemView.findViewById(R.id.helpline_name_textView);
        activityPositionTextView.setText(currentHelpLine.getStaffPosition());
        final TextView activityMobileTextView= (TextView) listItemView.findViewById(R.id.helpline_short_desc_textView);
        activityMobileTextView.setText(currentHelpLine.getMobile());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.helpline_image);
        iconView.setImageResource(currentHelpLine.getImageResourceId());
        View textContainer = listItemView.findViewById(R.id.helpline_text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }

}


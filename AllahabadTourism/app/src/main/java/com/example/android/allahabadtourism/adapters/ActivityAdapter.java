package com.example.android.allahabadtourism.adapters;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.allahabadtourism.R;
import com.example.android.allahabadtourism.abstract_type.Activities;

import java.util.ArrayList;

/**
 * Created by RajBaba on 14-08-2017.
 */
public class ActivityAdapter extends ArrayAdapter<Activities> {
    private int mColorResourceId;

    public ActivityAdapter(Activity context, ArrayList<Activities> activity, int colorResourceId) {
        super(context, 0, activity);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Activities currentActivity= getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView activityNameTextView = (TextView) listItemView.findViewById(R.id.activity_name_textView);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        activityNameTextView.setText(currentActivity.getGetmActivityName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView activityShortTextView = (TextView) listItemView.findViewById(R.id.activity_short_desc_textView);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        activityShortTextView.setText(currentActivity.getmActivityShortDesc());
        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentActivity.hasImage()) {

            // Get the image resource ID from the current AndroidFlavor object and
            // set the image to iconView
            iconView.setImageResource(currentActivity.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        } else {
            iconView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}

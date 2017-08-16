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
import com.example.android.allahabadtourism.abstract_type.Industry;

import java.util.ArrayList;

/**
 * Created by RajBaba on 16-08-2017.
 */
public class IndustryAdapter extends ArrayAdapter<Industry> {
    private int mColorResourceId;

    public IndustryAdapter(Activity context, ArrayList<Industry> industry, int colorResourceId) {
        super(context, 0, industry);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.industry_list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Industry currentIndustry = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView industryNameTextView = (TextView) listItemView.findViewById(R.id.industry_name_textView);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        industryNameTextView.setText(currentIndustry.getIndustryName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView industryDetailTextView = (TextView) listItemView.findViewById(R.id.industry_short_desc_textView);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        industryDetailTextView.setText(currentIndustry.getIndustryDetail());
        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.industry_image);

        iconView.setImageResource(currentIndustry.getIndustryImageId());
        View textContainer = listItemView.findViewById(R.id.industry_text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}



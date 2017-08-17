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
import com.example.android.allahabadtourism.abstract_type.Industry;
import com.example.android.allahabadtourism.activities.IndustryDetail;

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
        Industry currentIndustry = getItem(position);
        final TextView industryNameTextView = (TextView) listItemView.findViewById(R.id.industry_name_textView);
        industryNameTextView.setText(currentIndustry.getIndustryName());
        TextView industryDetailTextView = (TextView) listItemView.findViewById(R.id.industry_short_desc_textView);
        industryDetailTextView.setText(currentIndustry.getIndustryDetail());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.industry_image);
        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.linear_layout_industry);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String flag = industryNameTextView.getText().toString();
                String[] short_desc = getContext().getResources().getStringArray(R.array.industry_name);
                if (flag.equalsIgnoreCase(short_desc[0])) {
                    Intent intent = new Intent(getContext(), IndustryDetail.class);
                    intent.putExtra("keys_industry", 0);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(short_desc[1])) {
                    Intent intent = new Intent(getContext(), IndustryDetail.class);
                    intent.putExtra("keys_industry", 1);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(short_desc[2])) {
                    Intent intent = new Intent(getContext(), IndustryDetail.class);
                    intent.putExtra("keys_industry", 2);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(short_desc[3])) {
                    Intent intent = new Intent(getContext(), IndustryDetail.class);
                    intent.putExtra("keys_industry", 3);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(short_desc[4])) {
                    Intent intent = new Intent(getContext(), IndustryDetail.class);
                    intent.putExtra("keys_industry", 4);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(short_desc[5])) {
                    Intent intent = new Intent(getContext(), IndustryDetail.class);
                    intent.putExtra("keys_industry", 5);
                    getContext().startActivity(intent);

                }

            }
        });
        iconView.setImageResource(currentIndustry.getIndustryImageId());
        View textContainer = listItemView.findViewById(R.id.industry_text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }

}



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
import com.example.android.allahabadtourism.activities.ActivityDetail;

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
    public View getView(final int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_item, parent, false);
        }
        final Activities currentActivity = getItem(position);
        final TextView activityNameTextView = (TextView) listItemView.findViewById(R.id.activity_name_textView);
        activityNameTextView.setText(currentActivity.getGetActivityName());
        final TextView activityShortTextView = (TextView) listItemView.findViewById(R.id.activity_short_desc_textView);
        activityShortTextView.setText(currentActivity.getActivityShortDesc());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_activity);
        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.linear_layout_activity);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String flag = activityNameTextView.getText().toString();
                String[] short_desc = getContext().getResources().getStringArray(R.array.activities_name);
                if (flag.equalsIgnoreCase(short_desc[0])) {
                    Intent intent = new Intent(getContext(), ActivityDetail.class);
                    intent.putExtra("keys_activity", 0);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(short_desc[1])) {
                    Intent intent = new Intent(getContext(), ActivityDetail.class);
                    intent.putExtra("keys_activity", 1);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(short_desc[2])) {
                    Intent intent = new Intent(getContext(), ActivityDetail.class);
                    intent.putExtra("keys_activity", 2);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(short_desc[3])) {
                    Intent intent = new Intent(getContext(), ActivityDetail.class);
                    intent.putExtra("keys_activity", 3);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(short_desc[4])) {
                    Intent intent = new Intent(getContext(), ActivityDetail.class);
                    intent.putExtra("keys_activity", 4);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(short_desc[5])) {
                    Intent intent = new Intent(getContext(), ActivityDetail.class);
                    intent.putExtra("keys_activity", 5);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(short_desc[6])) {
                    Intent intent = new Intent(getContext(), ActivityDetail.class);
                    intent.putExtra("keys_activity", 6);
                    getContext().startActivity(intent);

                }
            }
        });
        iconView.setImageResource(currentActivity.getImageResourceId());
        View textContainer = listItemView.findViewById(R.id.activity_text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }

}

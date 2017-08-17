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
import com.example.android.allahabadtourism.abstract_type.Restaurant;
import com.example.android.allahabadtourism.activities.RestaurantDetail;

import java.util.ArrayList;

/**
 * Created by RajBaba on 17-08-2017.
 */
public class RestaurantAdapter extends ArrayAdapter<Restaurant> {
    private int mColorResourceId;

    public RestaurantAdapter(Activity context, ArrayList<Restaurant> restaurant, int colorResourceId) {
        super(context, 0, restaurant);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.restaurant_list_item, parent, false);
        }
        final Restaurant currentRestaurant = getItem(position);
        final TextView restaurantNameTextView = (TextView) listItemView.findViewById(R.id.restaurant_name_textView);
        restaurantNameTextView.setText(currentRestaurant.getGetmRestaurantName());
        final TextView restaurantShortTextView = (TextView) listItemView.findViewById(R.id.restaurant_short_desc_textView);
        restaurantShortTextView.setText(currentRestaurant.getmRestaurantShortDesc());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_restaurant);
        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.linear_layout_restaurant);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String flag = restaurantNameTextView.getText().toString();
                String[] short_desc = getContext().getResources().getStringArray(R.array.restaurant_name);
                if (flag.equalsIgnoreCase(short_desc[0])) {
                    Intent intent = new Intent(getContext(), RestaurantDetail.class);
                    intent.putExtra("keys_restaurant", 0);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(short_desc[1])) {
                    Intent intent = new Intent(getContext(), RestaurantDetail.class);
                    intent.putExtra("keys_restaurant", 1);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(short_desc[2])) {
                    Intent intent = new Intent(getContext(), RestaurantDetail.class);
                    intent.putExtra("keys_restaurant", 2);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(short_desc[3])) {
                    Intent intent = new Intent(getContext(), RestaurantDetail.class);
                    intent.putExtra("keys_restaurant", 3);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(short_desc[4])) {
                    Intent intent = new Intent(getContext(), RestaurantDetail.class);
                    intent.putExtra("keys_restaurant", 4);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(short_desc[5])) {
                    Intent intent = new Intent(getContext(), RestaurantDetail.class);
                    intent.putExtra("keys_activity", 5);
                    getContext().startActivity(intent);

                }
            }
        });
        iconView.setImageResource(currentRestaurant.getImageResourceId());
        View textContainer = listItemView.findViewById(R.id.restaurant_text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }

}

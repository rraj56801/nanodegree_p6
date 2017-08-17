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
import com.example.android.allahabadtourism.abstract_type.Shopping;
import com.example.android.allahabadtourism.activities.ShoppingDetail;

import java.util.ArrayList;

/**
 * Created by RajBaba on 16-08-2017.
 */
public class ShoppingAdapter extends ArrayAdapter<Shopping> {
    private int mColorResourceId;

    public ShoppingAdapter(Activity context, ArrayList<Shopping> shopping, int colorResourceId) {
        super(context, 0, shopping);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.shopping_list_item, parent, false);
        }
        Shopping currentShopping = getItem(position);
        final TextView shoppingNameTextView = (TextView) listItemView.findViewById(R.id.shopping_name_textView);
        shoppingNameTextView.setText(currentShopping.getShoppingName());
        TextView shoppingDetailTextView = (TextView) listItemView.findViewById(R.id.shopping_short_desc_textView);
        shoppingDetailTextView.setText(currentShopping.getShoppingDetail());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_shopping);
        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.linear_layout_shopping);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String flag = shoppingNameTextView.getText().toString();
                String[] short_desc = getContext().getResources().getStringArray(R.array.shopping_name);
                if (flag.equalsIgnoreCase(short_desc[0])) {
                    Intent intent = new Intent(getContext(), ShoppingDetail.class);
                    intent.putExtra("keys_shopping", 0);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(short_desc[1])) {
                    Intent intent = new Intent(getContext(), ShoppingDetail.class);
                    intent.putExtra("keys_shopping", 1);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(short_desc[2])) {
                    Intent intent = new Intent(getContext(), ShoppingDetail.class);
                    intent.putExtra("keys_shopping", 2);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(short_desc[3])) {
                    Intent intent = new Intent(getContext(), ShoppingDetail.class);
                    intent.putExtra("keys_shopping", 3);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(short_desc[4])) {
                    Intent intent = new Intent(getContext(), ShoppingDetail.class);
                    intent.putExtra("keys_shopping", 4);
                    getContext().startActivity(intent);

                }
                if (flag.equalsIgnoreCase(short_desc[5])) {
                    Intent intent = new Intent(getContext(), ShoppingDetail.class);
                    intent.putExtra("keys_activity", 5);
                    getContext().startActivity(intent);

                }
            }
        });

        iconView.setImageResource(currentShopping.getShoppingImageId());
        View textContainer = listItemView.findViewById(R.id.shopping_text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }

}


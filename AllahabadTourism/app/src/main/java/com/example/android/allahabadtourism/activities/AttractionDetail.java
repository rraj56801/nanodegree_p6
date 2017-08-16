package com.example.android.allahabadtourism.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.allahabadtourism.R;

public class AttractionDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_detail);
        String[] name = getResources().getStringArray(R.array.attraction_name);
        String[] longDesc = getResources().getStringArray(R.array.attraction_description_long);
        int[] imageId = {R.drawable.paramotoring, R.drawable.gokarting, R.drawable.segway_tour, R.drawable.camping, R.drawable.gamin_vegas, R.drawable.ice_skating, R.drawable.trekking};
        int i = 0;
        ImageView image_list_attraction=(ImageView)findViewById(R.id.image_list_attraction);
        TextView title_text_view = (TextView) findViewById(R.id.text_attraction_title);
        TextView long_text_view = (TextView) findViewById(R.id.long_textView);
        title_text_view.setText(name[i]);
        long_text_view.setText(longDesc[i]);
        image_list_attraction.setImageResource(imageId[i]);
        image_list_attraction.setScaleType(ImageView.ScaleType.CENTER_CROP);

    }
}
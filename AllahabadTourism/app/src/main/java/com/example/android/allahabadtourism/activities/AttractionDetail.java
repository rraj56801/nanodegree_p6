package com.example.android.allahabadtourism.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
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
        final String[] where = getResources().getStringArray(R.array.attractions_where);
        int[] imageId = {R.drawable.anand_bhavan_h, R.drawable.allahabad_fort_h, R.drawable.alfred_park_h, R.drawable.allahabad_museum_h, R.drawable.fungaon_h, R.drawable.jawahar_planet_h, R.drawable.patalpuri_temple_h,R.drawable.triveni_sangam_h};
        Intent get_intent = getIntent();
        final int i = get_intent.getIntExtra("keys_attraction", 0);
        ImageView image_list_attraction = (ImageView) findViewById(R.id.image_list_attraction);
        TextView title_text_view = (TextView) findViewById(R.id.text_attraction_title);
        TextView long_text_view = (TextView) findViewById(R.id.long_textView);
        title_text_view.setText(name[i]);
        long_text_view.setText(longDesc[i]);
        image_list_attraction.setImageResource(imageId[i]);
        image_list_attraction.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Button button_map = (Button) findViewById(R.id.button_maps);
        button_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(where[i]));
                startActivity(mapIntent);

            }
        });

    }
}
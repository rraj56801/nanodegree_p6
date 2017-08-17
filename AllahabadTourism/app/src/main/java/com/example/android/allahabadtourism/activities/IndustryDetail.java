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

public class IndustryDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_industry_detail);
        String[] name = getResources().getStringArray(R.array.industry_name);
        String[] longDesc = getResources().getStringArray(R.array.industry_description_long);
        int[] imageId = {R.drawable.paramotoring, R.drawable.gokarting, R.drawable.segway_tour, R.drawable.camping, R.drawable.gamin_vegas, R.drawable.ice_skating, R.drawable.trekking};
        final String[] where = getResources().getStringArray(R.array.industry_where);
        Intent get_intent = getIntent();
        final int i = get_intent.getIntExtra("keys_industry", 0);
        ImageView image_list_attraction = (ImageView) findViewById(R.id.image_list_industry);
        TextView title_text_view = (TextView) findViewById(R.id.text_title_industry);
        TextView long_text_view = (TextView) findViewById(R.id.long_textView_industry);
        title_text_view.setText(name[i]);
        long_text_view.setText(longDesc[0]);
        image_list_attraction.setImageResource(imageId[i]);
        image_list_attraction.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Button button_map = (Button) findViewById(R.id.button_maps_industry);
        button_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(where[0]));
                startActivity(mapIntent);

            }
        });

    }
}
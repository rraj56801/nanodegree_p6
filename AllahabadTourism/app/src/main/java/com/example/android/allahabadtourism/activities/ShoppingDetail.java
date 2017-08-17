package com.example.android.allahabadtourism.activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.allahabadtourism.R;

public class ShoppingDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_detail);
        String[] name = getResources().getStringArray(R.array.shopping_name);
        String[] longDesc = getResources().getStringArray(R.array.shopping_description_long);
        int[] imageId = {R.drawable.paramotoring, R.drawable.gokarting, R.drawable.segway_tour, R.drawable.camping, R.drawable.gamin_vegas, R.drawable.ice_skating, R.drawable.trekking};
        final String[] where = getResources().getStringArray(R.array.shopping_where);
        Intent get_intent=getIntent();
        final int i = get_intent.getIntExtra("keys_shopping",0);
        ImageView image_list_shoping=(ImageView)findViewById(R.id.image_list_shopping);
        TextView title_text_view = (TextView) findViewById(R.id.text_title_shopping);
        TextView long_text_view = (TextView) findViewById(R.id.long_textView_shopping);
        title_text_view.setText(name[i]);
        long_text_view.setText(longDesc[0]);
        image_list_shoping.setImageResource(imageId[i]);
        image_list_shoping.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Button button_map = (Button) findViewById(R.id.button_maps_shopping);
        button_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(where[0]));
                startActivity(mapIntent);

            }
        });

    }

}
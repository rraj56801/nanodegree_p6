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

public class ActivityDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_detail);

        String[] name = getResources().getStringArray(R.array.activities_name);
        String[] what = getResources().getStringArray(R.array.activities_what);
        String[] when = getResources().getStringArray(R.array.activities_when);
        final String[] where = getResources().getStringArray(R.array.activities_where);
        String[] howMuch = getResources().getStringArray(R.array.activities_how_much);
        int[] imageId = {R.drawable.paramotoring, R.drawable.gokarting, R.drawable.segway_tour, R.drawable.camping, R.drawable.gamin_vegas, R.drawable.ice_skating, R.drawable.trekking};
        final int i = 0;
        Button button_map = (Button) findViewById(R.id.button_maps);
        ImageView image_list_activity = (ImageView) findViewById(R.id.image_list_activities);
        TextView what_text_view = (TextView) findViewById(R.id.textView_what);
        TextView when_text_view = (TextView) findViewById(R.id.textView_when);
        TextView howmuch_text_view = (TextView) findViewById(R.id.textView_howmuch);
        TextView title_text_view = (TextView) findViewById(R.id.text_activities_title);
        title_text_view.setText(name[i]);
        what_text_view.setText(what[i]);
        when_text_view.setText(when[i]);
        howmuch_text_view.setText(howMuch[i]);
        image_list_activity.setImageResource(imageId[i]);
        image_list_activity.setScaleType(ImageView.ScaleType.CENTER_CROP);
        button_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(where[i]));
                startActivity(mapIntent);

            }
        });

    }
}
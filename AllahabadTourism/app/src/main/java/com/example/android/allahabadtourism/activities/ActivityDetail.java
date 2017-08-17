package com.example.android.allahabadtourism.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.allahabadtourism.R;

import java.util.Locale;

public class ActivityDetail extends AppCompatActivity {
    TextToSpeech mspeak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_detail);
        final String[] name = getResources().getStringArray(R.array.activities_name);
        final String[] what = getResources().getStringArray(R.array.activities_what);
        final String[] when = getResources().getStringArray(R.array.activities_when);
        final String[] where = getResources().getStringArray(R.array.activities_where);
        final String[] howMuch = getResources().getStringArray(R.array.activities_how_much);
        int[] imageId = {R.drawable.paramotoring, R.drawable.gokarting, R.drawable.segway_tour, R.drawable.camping, R.drawable.gamin_vegas, R.drawable.ice_skating, R.drawable.trekking};
        Intent get_intent = getIntent();
        final int i = get_intent.getIntExtra("keys_activity", 0);
        Button button_map = (Button) findViewById(R.id.button_maps);
        ImageView image_list_activity = (ImageView) findViewById(R.id.image_list_activities);
        TextView title_text_view = (TextView) findViewById(R.id.text_activities_title);
        TextView what_text_view = (TextView) findViewById(R.id.textView_what);
        TextView when_text_view = (TextView) findViewById(R.id.textView_when);
        TextView howmuch_text_view = (TextView) findViewById(R.id.textView_howmuch);

        title_text_view.setText(name[i]);
        what_text_view.setText(what[i]);
        when_text_view.setText(when[i]);
        howmuch_text_view.setText(howMuch[i]);
        image_list_activity.setImageResource(imageId[i]);
        image_list_activity.setScaleType(ImageView.ScaleType.CENTER_CROP);
        button_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(where[0]));
                startActivity(mapIntent);

            }
        });


        mspeak = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    mspeak.setLanguage(Locale.ENGLISH);
                    mspeak.setPitch(0.3f);

                }

            }
        });
        Button btn_speak_what = (Button) findViewById(R.id.button_speak_what);
        btn_speak_what.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = what[i];
                mspeak.speak(toSpeak, TextToSpeech.QUEUE_ADD, null);

            }
        });
        Button btn_speak_when = (Button) findViewById(R.id.button_speak_when);
        btn_speak_when.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = when[i];
                mspeak.speak(toSpeak, TextToSpeech.QUEUE_ADD, null);

            }
        });
        Button btn_speak_howmuch = (Button) findViewById(R.id.button_speak_howmuch);
        btn_speak_howmuch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = howMuch[i];
                mspeak.speak(toSpeak, TextToSpeech.QUEUE_ADD, null);

            }
        });

    }

    public void onPause() {
        if (mspeak != null) {
            mspeak.stop();
            mspeak.shutdown();
        }
        super.onPause();
    }


}

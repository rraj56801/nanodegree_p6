package com.example.android.allahabadtourism.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.allahabadtourism.R;
import com.example.android.allahabadtourism.abstract_type.Activities;
import com.example.android.allahabadtourism.adapters.ActivityAdapter;

import java.util.ArrayList;

public class ActivityFragment extends Fragment {

    public ActivityFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fragment_activity, container, false);
        final ArrayList<Activities> activity = new ArrayList<Activities>();
        String[] name = getResources().getStringArray(R.array.activities_name);
        String[] short_desc = getResources().getStringArray(R.array.activities_short_desc);
        int[] imageId = {R.drawable.anand_bhavan, R.drawable.allahabad_fort, R.drawable.alfred_park, R.drawable.allahabad_museum, R.drawable.alfred_park, R.drawable.anand_bhavan, R.drawable.patalpuri_temple};
        for (int i = 0; i < name.length; i++) {
            activity.add(new Activities(name[i], short_desc[i],imageId[i]));

        }
        ActivityAdapter activityAdapter =
                new ActivityAdapter(getActivity(), activity, R.color.activity_color);
        ListView listView = (ListView) rootView.findViewById(R.id.activity_listView_id);
        listView.setAdapter(activityAdapter);
        return rootView;
    }
}


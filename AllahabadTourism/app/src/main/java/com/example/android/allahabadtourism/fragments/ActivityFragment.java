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
        // Inflate the layout for this fragment
        final ArrayList<Activities> activity = new ArrayList<Activities>();
        String[] name = getResources().getStringArray(R.array.activities_name);
        String[] short_desc = getResources().getStringArray(R.array.activities_short_desc);
        int[] imageId = {R.drawable.paramotoring, R.drawable.gokarting, R.drawable.segway_tour, R.drawable.camping, R.drawable.gamin_vegas, R.drawable.ice_skating, R.drawable.trekking};
        for (int i = 0; i < name.length; i++) {
            activity.add(new Activities(name[i], short_desc[i], R.drawable.image));

        }
        ActivityAdapter activityAdapter =
                new ActivityAdapter(getActivity(), activity, R.color.background);
        final ListView listView = (ListView) getActivity().findViewById(R.id.list_activities);
        listView.setAdapter(activityAdapter);
        return inflater.inflate(R.layout.fragment_fragment_activity, container, false);

    }
}


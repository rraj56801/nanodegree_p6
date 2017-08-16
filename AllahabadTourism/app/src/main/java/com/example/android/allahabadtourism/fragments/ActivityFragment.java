package com.example.android.allahabadtourism.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.allahabadtourism.R;
import com.example.android.allahabadtourism.abstract_type.Activities;
import com.example.android.allahabadtourism.activities.ActivityDetail;
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
        View rootView = inflater.inflate(R.layout.fragment_fragment_activity, container, false);

        final ArrayList<Activities> activity = new ArrayList<Activities>();
        String[] name = getResources().getStringArray(R.array.activities_name);
        String[] short_desc = getResources().getStringArray(R.array.activities_short_desc);
        int[] imageId = {R.drawable.paramotoring, R.drawable.gokarting, R.drawable.segway_tour, R.drawable.camping, R.drawable.gamin_vegas, R.drawable.ice_skating, R.drawable.trekking};
        for (int i = 0; i < name.length; i++) {
            activity.add(new Activities(name[i], short_desc[i], R.drawable.image));

        }
        ActivityAdapter activityAdapter =
                new ActivityAdapter(getActivity(), activity, R.color.background);
        ListView listView = (ListView) rootView.findViewById(R.id.activity_listView_id);
        listView.setAdapter(activityAdapter);
        Log.v("Activity Fragment","Before ListViewOnItemClick");
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Log.v("Activity Fragment","In ListViewOnItemClick");
                Intent intent = new Intent(getActivity(), ActivityDetail.class);
                getActivity().startActivity(intent);

            }
        });

        Log.v("Activity Fragment","After ListViewOnItemClick");
        return rootView;
    }

}

package com.example.android.allahabadtourism.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.allahabadtourism.R;
import com.example.android.allahabadtourism.abstract_type.Attraction;
import com.example.android.allahabadtourism.adapters.AttractionAdapter;

import java.util.ArrayList;

public class AttractionFragment extends Fragment {


    public AttractionFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fragment_attraction, container, false);
        final ArrayList<Attraction> attraction = new ArrayList<Attraction>();
        String[] name = getResources().getStringArray(R.array.activities_name);
        String[] short_desc = getResources().getStringArray(R.array.activities_short_desc);
        int[] imageId = {R.drawable.paramotoring, R.drawable.gokarting, R.drawable.segway_tour, R.drawable.camping, R.drawable.gamin_vegas, R.drawable.ice_skating, R.drawable.trekking};
        for (int i = 0; i < name.length; i++) {
            attraction.add(new Attraction(name[i], short_desc[i], R.drawable.image));

        }
        AttractionAdapter attractionAdapter =
                new AttractionAdapter(getActivity(), attraction, R.color.background);
        ListView listView = (ListView) rootView.findViewById(R.id.attraction_listView_id);
        listView.setAdapter(attractionAdapter);
        // Inflate the layout for this fragment
        return rootView;
    }
}
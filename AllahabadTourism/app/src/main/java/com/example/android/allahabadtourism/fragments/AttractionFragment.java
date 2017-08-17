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
        String[] name = getResources().getStringArray(R.array.attraction_name);
        String[] shortDesc = getResources().getStringArray(R.array.attraction_description_short);
        int[] imageId = {R.drawable.anand_bhavan, R.drawable.allahabad_fort, R.drawable.alfred_park, R.drawable.allahabad_museum, R.drawable.alfred_park, R.drawable.anand_bhavan, R.drawable.patalpuri_temple,R.drawable.patalpuri_temple};
         for (int i = 0; i < name.length; i++) {
            attraction.add(new Attraction(name[i], shortDesc[i], imageId[i]));

        }
        AttractionAdapter attractionAdapter =
                new AttractionAdapter(getActivity(), attraction, R.color.attraction_color);
        ListView listView = (ListView) rootView.findViewById(R.id.attraction_listView_id);
        listView.setAdapter(attractionAdapter);
        return rootView;
    }
}
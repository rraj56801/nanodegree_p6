package com.example.android.allahabadtourism.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.allahabadtourism.R;
import com.example.android.allahabadtourism.activities.ActivityDetail;
import com.example.android.allahabadtourism.activities.AttractionDetail;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * create an instance of this fragment.
 */
public class FragmentFood extends Fragment {

    TextView tv;

    public FragmentFood() {
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
        View rootView = inflater.inflate(R.layout.fragment_fragment_food, container, false);
        Button buttonActivity = (Button) rootView.findViewById(R.id.button_activity_id);
        buttonActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), ActivityDetail.class);
                getActivity().startActivity(intent);
            }
        });
        Button buttonAttraction= (Button) rootView.findViewById(R.id.button_attraction_id);
        buttonAttraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), AttractionDetail.class);
                getActivity().startActivity(intent);
            }
        });

        return rootView;
    }


}

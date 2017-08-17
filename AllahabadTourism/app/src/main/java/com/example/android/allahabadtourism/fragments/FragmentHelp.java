package com.example.android.allahabadtourism.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.allahabadtourism.R;
import com.example.android.allahabadtourism.abstract_type.HelpLine;
import com.example.android.allahabadtourism.adapters.HelpLineAdapter;

import java.util.ArrayList;

public class FragmentHelp extends Fragment {

    public FragmentHelp() {
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
        View rootView = inflater.inflate(R.layout.fragment_fragment_help, container, false);
        final ArrayList<HelpLine> helpline = new ArrayList<HelpLine>();
        String[] position = getResources().getStringArray(R.array.helpline_position);
        String[] mobile = getResources().getStringArray(R.array.helpline_mobile);
        for (int i = 0; i < position.length; i++) {
            helpline.add(new HelpLine(position[i], mobile[i], R.drawable.ic_person_black));

        }
        HelpLineAdapter helpLineAdapter =
                new HelpLineAdapter(getActivity(), helpline, R.color.help_color);
        ListView listView = (ListView) rootView.findViewById(R.id.help_listView_id);
        listView.setAdapter(helpLineAdapter);
        return rootView;
    }
}
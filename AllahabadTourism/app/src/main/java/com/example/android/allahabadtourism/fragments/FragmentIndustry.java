package com.example.android.allahabadtourism.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.allahabadtourism.R;
import com.example.android.allahabadtourism.abstract_type.Industry;
import com.example.android.allahabadtourism.adapters.IndustryAdapter;

import java.util.ArrayList;

public class FragmentIndustry extends Fragment {

    public FragmentIndustry() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fragment_industry, container, false);
        final ArrayList<Industry> industry = new ArrayList<Industry>();
        String[] name = getResources().getStringArray(R.array.industry_name);
        String[] short_desc = getResources().getStringArray(R.array.industry_short_desc);
        int[] imageId = {R.drawable.anand_bhavan, R.drawable.allahabad_fort, R.drawable.alfred_park, R.drawable.allahabad_museum, R.drawable.alfred_park, R.drawable.anand_bhavan};
        for (int i = 0; i < name.length; i++) {
            industry.add(new Industry(name[i], short_desc[i], imageId[i]));

        }
        IndustryAdapter industryAdapter =
                new IndustryAdapter(getActivity(), industry, R.color.background);
        ListView listView = (ListView) rootView.findViewById(R.id.industry_listView_id);
        listView.setAdapter(industryAdapter);
        return rootView;
    }

}

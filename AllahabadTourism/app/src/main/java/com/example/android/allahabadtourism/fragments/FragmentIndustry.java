package com.example.android.allahabadtourism.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.allahabadtourism.R;
import com.example.android.allahabadtourism.abstract_type.Activities;
import com.example.android.allahabadtourism.abstract_type.Industry;
import com.example.android.allahabadtourism.activities.ActivityDetail;
import com.example.android.allahabadtourism.adapters.ActivityAdapter;
import com.example.android.allahabadtourism.adapters.IndustryAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * create an instance of this fragment.
 */
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
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_fragment_industry, container, false);
        final ArrayList<Industry> industry= new ArrayList<Industry>();
        String[] name = getResources().getStringArray(R.array.activities_name);
        String[] short_desc = getResources().getStringArray(R.array.activities_short_desc);
        int[] imageId = {R.drawable.paramotoring, R.drawable.gokarting, R.drawable.segway_tour, R.drawable.camping, R.drawable.gamin_vegas, R.drawable.ice_skating, R.drawable.trekking};
        for (int i = 0; i < name.length; i++) {
            industry.add(new Industry(name[i], short_desc[i], R.drawable.download));

        }
        IndustryAdapter industryAdapter=
                new IndustryAdapter(getActivity(), industry, R.color.background);
        ListView listView = (ListView) rootView.findViewById(R.id.industry_listView_id);
        listView.setAdapter(industryAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), ActivityDetail.class);
                getActivity().startActivity(intent);

            }
        });

        return rootView;
    }

}

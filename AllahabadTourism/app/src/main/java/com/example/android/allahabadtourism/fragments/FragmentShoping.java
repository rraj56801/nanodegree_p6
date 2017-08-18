package com.example.android.allahabadtourism.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.allahabadtourism.R;
import com.example.android.allahabadtourism.abstract_type.Shopping;
import com.example.android.allahabadtourism.adapters.ShoppingAdapter;

import java.util.ArrayList;

public class FragmentShoping extends Fragment {

    public FragmentShoping() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fragment_shoping, container, false);
        final ArrayList<Shopping> shopping = new ArrayList<Shopping>();
        String[] name = getResources().getStringArray(R.array.shopping_name);
        String[] short_desc = getResources().getStringArray(R.array.shopping_short_desc);
        int[] imageId = {R.drawable.anand_bhavan, R.drawable.allahabad_fort, R.drawable.alfred_park, R.drawable.allahabad_museum, R.drawable.alfred_park, R.drawable.anand_bhavan};
        for (int i = 0; i < name.length; i++) {
            shopping.add(new Shopping(name[i], short_desc[i],imageId[i]));

        }
        ShoppingAdapter shoppingAdapter =
                new ShoppingAdapter(getActivity(), shopping, R.color.shopping_colors);
        ListView listView = (ListView) rootView.findViewById(R.id.shopping_listView_id);
        listView.setAdapter(shoppingAdapter);
         return rootView;
    }


}

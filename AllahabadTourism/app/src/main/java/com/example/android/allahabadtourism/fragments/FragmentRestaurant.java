package com.example.android.allahabadtourism.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.allahabadtourism.R;
import com.example.android.allahabadtourism.abstract_type.Restaurant;
import com.example.android.allahabadtourism.adapters.RestaurantAdapter;

import java.util.ArrayList;

public class FragmentRestaurant extends Fragment {

    public FragmentRestaurant() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fragment_restaurant, container, false);
        final ArrayList<Restaurant> restaurant = new ArrayList<Restaurant>();
        String[] name = getResources().getStringArray(R.array.restaurant_name);
        String[] short_desc = getResources().getStringArray(R.array.restaurant_short_desc);
        int[] imageId = {R.drawable.anand_bhavan, R.drawable.allahabad_fort, R.drawable.alfred_park, R.drawable.allahabad_museum, R.drawable.alfred_park, R.drawable.anand_bhavan};
        for (int i = 0; i < name.length; i++) {
            restaurant.add(new Restaurant(name[i], short_desc[i], imageId[i]));

        }
        RestaurantAdapter restaurantAdapter =
                new RestaurantAdapter(getActivity(), restaurant, R.color.restaurant_color);
        ListView listView = (ListView) rootView.findViewById(R.id.restaurant_listView_id);
        listView.setAdapter(restaurantAdapter);
        return rootView;
    }


}

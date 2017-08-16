package com.example.android.allahabadtourism.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.android.allahabadtourism.R;
import com.example.android.allahabadtourism.abstract_type.Shopping;
import com.example.android.allahabadtourism.adapters.ShoppingAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * create an instance of this fragment.
 */
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
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fragment_shoping, container, false);
        final ArrayList<Shopping> shopping = new ArrayList<Shopping>();

        final ImageView view1 = new ImageView(getActivity());
        final String[] name = getResources().getStringArray(R.array.shop_name);
        final String[] detail = getResources().getStringArray(R.array.shop_details);
        final int[] imageId = {R.drawable.paramotoring, R.drawable.gokarting, R.drawable.segway_tour, R.drawable.camping, R.drawable.gamin_vegas, R.drawable.ice_skating, R.drawable.trekking};
        for (int i = 0; i < name.length; i++) {
            shopping.add(new Shopping(name[i], detail[i], R.drawable.camping));

        }
        ShoppingAdapter shoppingAdapter =
                new ShoppingAdapter(getActivity(), shopping, R.color.background);
        ListView listView = (ListView) rootView.findViewById(R.id.shopping_listView_id);
        listView.setAdapter(shoppingAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int i = 0;

                view1.setImageResource(imageId[i]);
                view1.setMaxHeight(50);
                view1.setScaleType(ImageView.ScaleType.CENTER_CROP);
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity())
                        .setView(view1)
                        .setTitle(name[i])
                        .setMessage(detail[i]);
                AlertDialog dialog = builder.create();
                dialog.show();
                dialog.getWindow().setLayout(500, 700);
            }
        });

        return rootView;
    }
}

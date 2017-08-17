package com.example.android.allahabadtourism.abstract_type;

/**
 * Created by RajBaba on 17-08-2017.
 */
public class Restaurant {
    private String getmRestaurantName;
    private String mRestaurantShortDesc;
    private int mImageResourceId;

    /**
     * @param mRestaurantName
     * @param mRestaurantShortDesc
     * @param imageResourceId
     */

    public Restaurant(String mRestaurantName, String mRestaurantShortDesc, int imageResourceId) {
        this.getmRestaurantName = mRestaurantName;
        this.mRestaurantShortDesc = mRestaurantShortDesc;
        this.mImageResourceId = imageResourceId;
    }

    public String getGetmRestaurantName() {
        return getmRestaurantName;
    }

    public String getmRestaurantShortDesc() {
        return mRestaurantShortDesc;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}


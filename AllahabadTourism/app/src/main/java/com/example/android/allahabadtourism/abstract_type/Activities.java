package com.example.android.allahabadtourism.abstract_type;

/**
 * Created by RajBaba on 14-08-2017.
 */
public class Activities {
    private String getmActivityName;
    private String mActivityShortDesc;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * @param mActivityName
     * @param mActivityShortDesc
     * @param imageResourceId
     */

    public Activities(String mActivityName, String mActivityShortDesc, int imageResourceId) {
        this.getmActivityName = mActivityName;
        this.mActivityShortDesc = mActivityShortDesc;
        this.mImageResourceId = imageResourceId;
    }

    public String getGetmActivityName() {
        return getmActivityName;
    }

    public String getmActivityShortDesc() {
        return mActivityShortDesc;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;


    }

}

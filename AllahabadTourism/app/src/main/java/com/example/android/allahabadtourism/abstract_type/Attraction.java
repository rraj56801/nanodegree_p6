package com.example.android.allahabadtourism.abstract_type;

/**
 * Created by RajBaba on 15-08-2017.
 */
public class Attraction {

    private String getmAttractionName;
    private String mAttractionShortDesc;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * @param mAttractionName
     * @param mAttractionShortDesc
     * @param imageResourceId
     */

    public Attraction(String mAttractionName, String mAttractionShortDesc, int imageResourceId) {
        this.getmAttractionName = mAttractionName;
        this.mAttractionShortDesc = mAttractionShortDesc;
        this.mImageResourceId = imageResourceId;
    }

    public String getGetmAttractionName() {
        return getmAttractionName;
    }

    public String getmAttractionShortDesc() {
        return mAttractionShortDesc;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;


    }

}

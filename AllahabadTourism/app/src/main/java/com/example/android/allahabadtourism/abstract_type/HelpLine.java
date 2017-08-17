package com.example.android.allahabadtourism.abstract_type;

/**
 * Created by RajBaba on 17-08-2017.
 */
public class HelpLine {
    private String mStaffPosition;
    private String mMobile;
    private int mImageResourceId;

    /**
     * @param staffPosition
     * @param mobile
     * @param imageResourceId
     */

    public HelpLine(String staffPosition, String mobile, int imageResourceId) {
        this.mStaffPosition= staffPosition;
        this.mMobile = mobile;
        this.mImageResourceId = imageResourceId;
    }

    public String getStaffPosition() {
        return mStaffPosition;
    }

    public String getMobile() {
        return mMobile;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }


}


package com.example.android.allahabadtourism.abstract_type;

/**
 * Created by RajBaba on 16-08-2017.
 */
public class Industry {
    private int mImageResourceId;
    private String mName;
    private String mDetail;

    /**
     * @param name
     * @param detail
     * @param imageResourceId
     */
    public Industry(String name, String detail, int imageResourceId) {
        this.mImageResourceId = imageResourceId;
        this.mName = name;
        this.mDetail = detail;
    }

    public int getIndustryImageId() {
        return mImageResourceId;
    }

    public String getIndustryName() {
        return mName;
    }

    public String getIndustryDetail() {
        return mDetail;
    }


}


package com.example.android.allahabadtourism.abstract_type;

/**
 * Created by RajBaba on 16-08-2017.
 */
public class Shopping {
    private int mImageId;
    private String mName;
    private String mDetail;

    public Shopping(String name, String detail, int image) {
        this.mImageId = image;
        this.mName = name;
        this.mDetail = detail;
    }

    public int getShoppingImageId() {
        return mImageId;
    }

    public String getShoppingName() {
        return mName;
    }

    public String getShoppingDetail() {
        return mDetail;
    }


}


package com.example.android.allahabadtourism.abstract_type;

/**
 * Created by RajBaba on 16-08-2017.
 */
public class Shopping {
    private int mImageResourceId;
    private String mName;
    private String mDetail;

    /**
     * @param name
     * @param detail
     * @param imageResourceId
     */
    public Shopping(String name, String detail, int imageResourceId) {
        this.mImageResourceId = imageResourceId;
        this.mName = name;
        this.mDetail = detail;
    }

    public int getShoppingImageId() {
        return mImageResourceId;
    }

    public String getShoppingName() {
        return mName;
    }

    public String getShoppingDetail() {
        return mDetail;
    }


}


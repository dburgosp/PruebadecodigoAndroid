package com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class News {

    @SerializedName("cts")
    @Expose
    private List<Ct> cts = null;

    /**
     * No args constructor for use in serialization
     */
    public News() {
    }

    /**
     * @param cts
     */
    public News(List<Ct> cts) {
        super();
        this.cts = cts;
    }

    public List<Ct> getCts() {
        return cts;
    }

    public void setCts(List<Ct> cts) {
        this.cts = cts;
    }

}

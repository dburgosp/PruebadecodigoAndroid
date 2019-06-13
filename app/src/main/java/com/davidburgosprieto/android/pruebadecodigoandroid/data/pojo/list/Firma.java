package com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Firma {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("location")
    @Expose
    private String location;

    /**
     * No args constructor for use in serialization
     */
    public Firma() {
    }

    /**
     * @param location
     * @param name
     */
    public Firma(String name, String location) {
        super();
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}

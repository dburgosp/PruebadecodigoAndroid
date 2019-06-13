package com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Firma {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("link")
    @Expose
    private String link;

    /**
     * No args constructor for use in serialization
     */
    public Firma() {
    }

    /**
     * @param location
     * @param link
     * @param name
     */
    public Firma(String name, String location, String link) {
        super();
        this.name = name;
        this.location = location;
        this.link = link;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}

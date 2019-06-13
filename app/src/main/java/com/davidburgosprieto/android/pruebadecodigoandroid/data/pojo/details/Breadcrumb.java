package com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Breadcrumb {

    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("types")
    @Expose
    private List<String> types = null;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * No args constructor for use in serialization
     */
    public Breadcrumb() {
    }

    /**
     * @param name
     * @param path
     * @param types
     */
    public Breadcrumb(String path, List<String> types, String name) {
        super();
        this.path = path;
        this.types = types;
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

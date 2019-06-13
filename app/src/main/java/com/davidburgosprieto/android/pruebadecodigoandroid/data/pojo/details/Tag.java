package com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tag {

    @SerializedName("nameTag")
    @Expose
    private String nameTag;
    @SerializedName("relevance")
    @Expose
    private String relevance;
    @SerializedName("autocoverUrl")
    @Expose
    private String autocoverUrl;
    @SerializedName("idTag")
    @Expose
    private String idTag;

    /**
     * No args constructor for use in serialization
     */
    public Tag() {
    }

    /**
     * @param relevance
     * @param nameTag
     * @param autocoverUrl
     * @param idTag
     */
    public Tag(String nameTag, String relevance, String autocoverUrl, String idTag) {
        super();
        this.nameTag = nameTag;
        this.relevance = relevance;
        this.autocoverUrl = autocoverUrl;
        this.idTag = idTag;
    }

    public String getNameTag() {
        return nameTag;
    }

    public void setNameTag(String nameTag) {
        this.nameTag = nameTag;
    }

    public String getRelevance() {
        return relevance;
    }

    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

    public String getAutocoverUrl() {
        return autocoverUrl;
    }

    public void setAutocoverUrl(String autocoverUrl) {
        this.autocoverUrl = autocoverUrl;
    }

    public String getIdTag() {
        return idTag;
    }

    public void setIdTag(String idTag) {
        this.idTag = idTag;
    }

}

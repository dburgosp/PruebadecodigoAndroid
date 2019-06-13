package com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Multimedium {

    @SerializedName("titulo")
    @Expose
    private String titulo;
    @SerializedName("autor")
    @Expose
    private String autor;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("videoData")
    @Expose
    private VideoData videoData;
    @SerializedName("position")
    @Expose
    private String position;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     */
    public Multimedium() {
    }

    /**
     * @param id
     * @param position
     * @param titulo
     * @param height
     * @param autor
     * @param videoData
     * @param width
     * @param type
     * @param url
     */
    public Multimedium(String titulo, String autor, String type, VideoData videoData, String position, String id, Integer width, Integer height, String url) {
        super();
        this.titulo = titulo;
        this.autor = autor;
        this.type = type;
        this.videoData = videoData;
        this.position = position;
        this.id = id;
        this.width = width;
        this.height = height;
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VideoData getVideoData() {
        return videoData;
    }

    public void setVideoData(VideoData videoData) {
        this.videoData = videoData;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

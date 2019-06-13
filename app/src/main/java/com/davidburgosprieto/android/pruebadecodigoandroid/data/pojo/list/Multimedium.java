package com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Multimedium {

    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("titulo")
    @Expose
    private String titulo;
    @SerializedName("autor")
    @Expose
    private String autor;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("hasIcon")
    @Expose
    private String hasIcon;

    /**
     * No args constructor for use in serialization
     */
    public Multimedium() {
    }

    /**
     * @param id
     * @param titulo
     * @param height
     * @param autor
     * @param width
     * @param hasIcon
     * @param type
     * @param url
     */
    public Multimedium(Integer width, Integer height, String url, String titulo, String autor, String type, String id, String hasIcon) {
        super();
        this.width = width;
        this.height = height;
        this.url = url;
        this.titulo = titulo;
        this.autor = autor;
        this.type = type;
        this.id = id;
        this.hasIcon = hasIcon;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHasIcon() {
        return hasIcon;
    }

    public void setHasIcon(String hasIcon) {
        this.hasIcon = hasIcon;
    }

}

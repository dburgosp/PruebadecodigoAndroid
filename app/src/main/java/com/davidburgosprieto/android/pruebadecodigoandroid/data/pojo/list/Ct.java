package com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.list;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ct {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("titulo")
    @Expose
    private String titulo;
    @SerializedName("cintillo")
    @Expose
    private String cintillo;
    @SerializedName("seccion")
    @Expose
    private String seccion;
    @SerializedName("publishedAt")
    @Expose
    private String publishedAt;
    @SerializedName("multimedia")
    @Expose
    private List<Multimedium> multimedia = null;
    @SerializedName("firmas")
    @Expose
    private List<Firma> firmas = null;
    @SerializedName("antetitulo")
    @Expose
    private String antetitulo;
    @SerializedName("hasVideo")
    @Expose
    private Boolean hasVideo;

    /**
     * No args constructor for use in serialization
     */
    public Ct() {
    }

    /**
     * @param publishedAt
     * @param id
     * @param titulo
     * @param hasVideo
     * @param multimedia
     * @param firmas
     * @param antetitulo
     * @param seccion
     * @param cintillo
     * @param type
     * @param url
     */
    public Ct(String id, String type, String url, String titulo, String cintillo, String seccion, String publishedAt, List<Multimedium> multimedia, List<Firma> firmas, String antetitulo, Boolean hasVideo) {
        super();
        this.id = id;
        this.type = type;
        this.url = url;
        this.titulo = titulo;
        this.cintillo = cintillo;
        this.seccion = seccion;
        this.publishedAt = publishedAt;
        this.multimedia = multimedia;
        this.firmas = firmas;
        this.antetitulo = antetitulo;
        this.hasVideo = hasVideo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getCintillo() {
        return cintillo;
    }

    public void setCintillo(String cintillo) {
        this.cintillo = cintillo;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public List<Multimedium> getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(List<Multimedium> multimedia) {
        this.multimedia = multimedia;
    }

    public List<Firma> getFirmas() {
        return firmas;
    }

    public void setFirmas(List<Firma> firmas) {
        this.firmas = firmas;
    }

    public String getAntetitulo() {
        return antetitulo;
    }

    public void setAntetitulo(String antetitulo) {
        this.antetitulo = antetitulo;
    }

    public Boolean getHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(Boolean hasVideo) {
        this.hasVideo = hasVideo;
    }

}


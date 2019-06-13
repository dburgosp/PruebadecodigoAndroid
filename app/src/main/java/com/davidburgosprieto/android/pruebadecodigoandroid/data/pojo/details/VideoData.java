package com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VideoData {

    @SerializedName("elementoMultimedia")
    @Expose
    private ElementoMultimedia elementoMultimedia;
    @SerializedName("pathImagenMiniatura")
    @Expose
    private String pathImagenMiniatura;
    @SerializedName("tagOjd")
    @Expose
    private String tagOjd;
    @SerializedName("tagPublicidad")
    @Expose
    private TagPublicidad tagPublicidad;
    @SerializedName("urlEnviar")
    @Expose
    private String urlEnviar;
    @SerializedName("urlImagenMiniatura")
    @Expose
    private String urlImagenMiniatura;
    @SerializedName("urlImagen140")
    @Expose
    private String urlImagen140;

    /**
     * No args constructor for use in serialization
     */
    public VideoData() {
    }

    /**
     * @param urlImagen140
     * @param tagOjd
     * @param urlImagenMiniatura
     * @param urlEnviar
     * @param tagPublicidad
     * @param pathImagenMiniatura
     * @param elementoMultimedia
     */
    public VideoData(ElementoMultimedia elementoMultimedia, String pathImagenMiniatura, String tagOjd, TagPublicidad tagPublicidad, String urlEnviar, String urlImagenMiniatura, String urlImagen140) {
        super();
        this.elementoMultimedia = elementoMultimedia;
        this.pathImagenMiniatura = pathImagenMiniatura;
        this.tagOjd = tagOjd;
        this.tagPublicidad = tagPublicidad;
        this.urlEnviar = urlEnviar;
        this.urlImagenMiniatura = urlImagenMiniatura;
        this.urlImagen140 = urlImagen140;
    }

    public ElementoMultimedia getElementoMultimedia() {
        return elementoMultimedia;
    }

    public void setElementoMultimedia(ElementoMultimedia elementoMultimedia) {
        this.elementoMultimedia = elementoMultimedia;
    }

    public String getPathImagenMiniatura() {
        return pathImagenMiniatura;
    }

    public void setPathImagenMiniatura(String pathImagenMiniatura) {
        this.pathImagenMiniatura = pathImagenMiniatura;
    }

    public String getTagOjd() {
        return tagOjd;
    }

    public void setTagOjd(String tagOjd) {
        this.tagOjd = tagOjd;
    }

    public TagPublicidad getTagPublicidad() {
        return tagPublicidad;
    }

    public void setTagPublicidad(TagPublicidad tagPublicidad) {
        this.tagPublicidad = tagPublicidad;
    }

    public String getUrlEnviar() {
        return urlEnviar;
    }

    public void setUrlEnviar(String urlEnviar) {
        this.urlEnviar = urlEnviar;
    }

    public String getUrlImagenMiniatura() {
        return urlImagenMiniatura;
    }

    public void setUrlImagenMiniatura(String urlImagenMiniatura) {
        this.urlImagenMiniatura = urlImagenMiniatura;
    }

    public String getUrlImagen140() {
        return urlImagen140;
    }

    public void setUrlImagen140(String urlImagen140) {
        this.urlImagen140 = urlImagen140;
    }

}

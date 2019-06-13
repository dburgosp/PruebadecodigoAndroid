package com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TagPublicidad {

    @SerializedName("codPortal")
    @Expose
    private String codPortal;
    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("descripcion")
    @Expose
    private String descripcion;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     */
    public TagPublicidad() {
    }

    /**
     * @param codigo
     * @param codPortal
     * @param descripcion
     * @param url
     */
    public TagPublicidad(String codPortal, String codigo, String descripcion, String url) {
        super();
        this.codPortal = codPortal;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.url = url;
    }

    public String getCodPortal() {
        return codPortal;
    }

    public void setCodPortal(String codPortal) {
        this.codPortal = codPortal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

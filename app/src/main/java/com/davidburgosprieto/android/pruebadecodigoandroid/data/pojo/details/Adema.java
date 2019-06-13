package com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Adema {

    @SerializedName("titulo")
    @Expose
    private String titulo;
    @SerializedName("enlace")
    @Expose
    private String enlace;

    /**
     * No args constructor for use in serialization
     */
    public Adema() {
    }

    /**
     * @param titulo
     * @param enlace
     */
    public Adema(String titulo, String enlace) {
        super();
        this.titulo = titulo;
        this.enlace = enlace;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

}


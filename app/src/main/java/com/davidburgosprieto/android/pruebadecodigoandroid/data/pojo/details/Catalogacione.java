package com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Catalogacione {

    @SerializedName("alias")
    @Expose
    private String alias;
    @SerializedName("categoria")
    @Expose
    private String categoria;
    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("nombre")
    @Expose
    private String nombre;

    /**
     * No args constructor for use in serialization
     */
    public Catalogacione() {
    }

    /**
     * @param nombre
     * @param codigo
     * @param categoria
     * @param alias
     */
    public Catalogacione(String alias, String categoria, String codigo, String nombre) {
        super();
        this.alias = alias;
        this.categoria = categoria;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

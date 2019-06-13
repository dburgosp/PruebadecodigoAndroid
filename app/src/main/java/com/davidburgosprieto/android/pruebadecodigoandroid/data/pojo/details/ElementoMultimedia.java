package com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ElementoMultimedia {

    @SerializedName("altoVentana")
    @Expose
    private String altoVentana;
    @SerializedName("anchoVentana")
    @Expose
    private String anchoVentana;
    @SerializedName("autor")
    @Expose
    private String autor;
    @SerializedName("baja")
    @Expose
    private String baja;
    @SerializedName("canales")
    @Expose
    private List<Object> canales = null;
    @SerializedName("catalogaciones")
    @Expose
    private List<Catalogacione> catalogaciones = null;
    @SerializedName("fechaInicio")
    @Expose
    private String fechaInicio;
    @SerializedName("fechaFin")
    @Expose
    private String fechaFin;
    @SerializedName("codPortal")
    @Expose
    private String codPortal;
    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("compartible")
    @Expose
    private String compartible;
    @SerializedName("encriptarUrl")
    @Expose
    private String encriptarUrl;
    @SerializedName("enlace")
    @Expose
    private String enlace;
    @SerializedName("fecha")
    @Expose
    private String fecha;
    @SerializedName("fechaCompleta")
    @Expose
    private String fechaCompleta;
    @SerializedName("idKaltura")
    @Expose
    private String idKaltura;
    @SerializedName("idUnico")
    @Expose
    private String idUnico;
    @SerializedName("numero")
    @Expose
    private String numero;
    @SerializedName("pathMiniatura")
    @Expose
    private String pathMiniatura;
    @SerializedName("proveedor")
    @Expose
    private String proveedor;
    @SerializedName("tagOjd")
    @Expose
    private String tagOjd;
    @SerializedName("tagPublicidad")
    @Expose
    private String tagPublicidad;
    @SerializedName("targetVentana")
    @Expose
    private String targetVentana;
    @SerializedName("texto")
    @Expose
    private String texto;
    @SerializedName("textoAlternativo")
    @Expose
    private String textoAlternativo;
    @SerializedName("tipo")
    @Expose
    private String tipo;
    @SerializedName("titular")
    @Expose
    private String titular;
    @SerializedName("ubicaciones")
    @Expose
    private List<Object> ubicaciones = null;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("urlImagen")
    @Expose
    private String urlImagen;
    @SerializedName("videoTags")
    @Expose
    private List<String> videoTags = null;

    /**
     * No args constructor for use in serialization
     */
    public ElementoMultimedia() {
    }

    /**
     * @param urlImagen
     * @param canales
     * @param altoVentana
     * @param fechaFin
     * @param catalogaciones
     * @param idKaltura
     * @param idUnico
     * @param tagPublicidad
     * @param codigo
     * @param codPortal
     * @param fechaCompleta
     * @param videoTags
     * @param titular
     * @param proveedor
     * @param tagOjd
     * @param encriptarUrl
     * @param fechaInicio
     * @param autor
     * @param fecha
     * @param texto
     * @param pathMiniatura
     * @param anchoVentana
     * @param enlace
     * @param ubicaciones
     * @param url
     * @param baja
     * @param numero
     * @param textoAlternativo
     * @param targetVentana
     * @param tipo
     * @param compartible
     */
    public ElementoMultimedia(String altoVentana, String anchoVentana, String autor, String baja, List<Object> canales, List<Catalogacione> catalogaciones, String fechaInicio, String fechaFin, String codPortal, String codigo, String compartible, String encriptarUrl, String enlace, String fecha, String fechaCompleta, String idKaltura, String idUnico, String numero, String pathMiniatura, String proveedor, String tagOjd, String tagPublicidad, String targetVentana, String texto, String textoAlternativo, String tipo, String titular, List<Object> ubicaciones, String url, String urlImagen, List<String> videoTags) {
        super();
        this.altoVentana = altoVentana;
        this.anchoVentana = anchoVentana;
        this.autor = autor;
        this.baja = baja;
        this.canales = canales;
        this.catalogaciones = catalogaciones;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.codPortal = codPortal;
        this.codigo = codigo;
        this.compartible = compartible;
        this.encriptarUrl = encriptarUrl;
        this.enlace = enlace;
        this.fecha = fecha;
        this.fechaCompleta = fechaCompleta;
        this.idKaltura = idKaltura;
        this.idUnico = idUnico;
        this.numero = numero;
        this.pathMiniatura = pathMiniatura;
        this.proveedor = proveedor;
        this.tagOjd = tagOjd;
        this.tagPublicidad = tagPublicidad;
        this.targetVentana = targetVentana;
        this.texto = texto;
        this.textoAlternativo = textoAlternativo;
        this.tipo = tipo;
        this.titular = titular;
        this.ubicaciones = ubicaciones;
        this.url = url;
        this.urlImagen = urlImagen;
        this.videoTags = videoTags;
    }

    public String getAltoVentana() {
        return altoVentana;
    }

    public void setAltoVentana(String altoVentana) {
        this.altoVentana = altoVentana;
    }

    public String getAnchoVentana() {
        return anchoVentana;
    }

    public void setAnchoVentana(String anchoVentana) {
        this.anchoVentana = anchoVentana;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getBaja() {
        return baja;
    }

    public void setBaja(String baja) {
        this.baja = baja;
    }

    public List<Object> getCanales() {
        return canales;
    }

    public void setCanales(List<Object> canales) {
        this.canales = canales;
    }

    public List<Catalogacione> getCatalogaciones() {
        return catalogaciones;
    }

    public void setCatalogaciones(List<Catalogacione> catalogaciones) {
        this.catalogaciones = catalogaciones;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
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

    public String getCompartible() {
        return compartible;
    }

    public void setCompartible(String compartible) {
        this.compartible = compartible;
    }

    public String getEncriptarUrl() {
        return encriptarUrl;
    }

    public void setEncriptarUrl(String encriptarUrl) {
        this.encriptarUrl = encriptarUrl;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFechaCompleta() {
        return fechaCompleta;
    }

    public void setFechaCompleta(String fechaCompleta) {
        this.fechaCompleta = fechaCompleta;
    }

    public String getIdKaltura() {
        return idKaltura;
    }

    public void setIdKaltura(String idKaltura) {
        this.idKaltura = idKaltura;
    }

    public String getIdUnico() {
        return idUnico;
    }

    public void setIdUnico(String idUnico) {
        this.idUnico = idUnico;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPathMiniatura() {
        return pathMiniatura;
    }

    public void setPathMiniatura(String pathMiniatura) {
        this.pathMiniatura = pathMiniatura;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getTagOjd() {
        return tagOjd;
    }

    public void setTagOjd(String tagOjd) {
        this.tagOjd = tagOjd;
    }

    public String getTagPublicidad() {
        return tagPublicidad;
    }

    public void setTagPublicidad(String tagPublicidad) {
        this.tagPublicidad = tagPublicidad;
    }

    public String getTargetVentana() {
        return targetVentana;
    }

    public void setTargetVentana(String targetVentana) {
        this.targetVentana = targetVentana;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTextoAlternativo() {
        return textoAlternativo;
    }

    public void setTextoAlternativo(String textoAlternativo) {
        this.textoAlternativo = textoAlternativo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public List<Object> getUbicaciones() {
        return ubicaciones;
    }

    public void setUbicaciones(List<Object> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public List<String> getVideoTags() {
        return videoTags;
    }

    public void setVideoTags(List<String> videoTags) {
        this.videoTags = videoTags;
    }

}

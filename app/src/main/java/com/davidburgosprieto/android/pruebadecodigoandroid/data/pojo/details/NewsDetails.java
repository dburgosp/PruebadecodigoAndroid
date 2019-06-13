package com.davidburgosprieto.android.pruebadecodigoandroid.data.pojo.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NewsDetails {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("titulo")
    @Expose
    private String titulo;
    @SerializedName("tipoWeb")
    @Expose
    private Boolean tipoWeb;
    @SerializedName("indexable")
    @Expose
    private Boolean indexable;
    @SerializedName("breadcrumb")
    @Expose
    private Breadcrumb breadcrumb;
    @SerializedName("texto")
    @Expose
    private String texto;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("antetitulo")
    @Expose
    private String antetitulo;
    @SerializedName("cintillo")
    @Expose
    private String cintillo;
    @SerializedName("cintilloUrl")
    @Expose
    private String cintilloUrl;
    @SerializedName("entradilla")
    @Expose
    private String entradilla;
    @SerializedName("ademas")
    @Expose
    private List<Adema> ademas = null;
    @SerializedName("firmas")
    @Expose
    private List<Firma> firmas = null;
    @SerializedName("sectionId")
    @Expose
    private String sectionId;
    @SerializedName("model")
    @Expose
    private String model;
    @SerializedName("seccion")
    @Expose
    private String seccion;
    @SerializedName("codeComments")
    @Expose
    private String codeComments;
    @SerializedName("ttlComments")
    @Expose
    private Integer ttlComments;
    @SerializedName("multimedia")
    @Expose
    private List<Multimedium> multimedia = null;
    @SerializedName("firstPublishedAt")
    @Expose
    private String firstPublishedAt;
    @SerializedName("publishedAt")
    @Expose
    private String publishedAt;
    @SerializedName("tags")
    @Expose
    private List<Tag> tags = null;

    /**
     * No args constructor for use in serialization
     */
    public NewsDetails() {
    }

    /**
     * @param tags
     * @param model
     * @param indexable
     * @param texto
     * @param firstPublishedAt
     * @param cintilloUrl
     * @param seccion
     * @param type
     * @param antetitulo
     * @param cintillo
     * @param url
     * @param breadcrumb
     * @param publishedAt
     * @param id
     * @param sectionId
     * @param titulo
     * @param multimedia
     * @param entradilla
     * @param codeComments
     * @param firmas
     * @param ttlComments
     * @param ademas
     * @param language
     * @param tipoWeb
     */
    public NewsDetails(String type, String url, String id, String titulo, Boolean tipoWeb, Boolean indexable, Breadcrumb breadcrumb, String texto, String language, String antetitulo, String cintillo, String cintilloUrl, String entradilla, List<Adema> ademas, List<Firma> firmas, String sectionId, String model, String seccion, String codeComments, Integer ttlComments, List<Multimedium> multimedia, String firstPublishedAt, String publishedAt, List<Tag> tags) {
        super();
        this.type = type;
        this.url = url;
        this.id = id;
        this.titulo = titulo;
        this.tipoWeb = tipoWeb;
        this.indexable = indexable;
        this.breadcrumb = breadcrumb;
        this.texto = texto;
        this.language = language;
        this.antetitulo = antetitulo;
        this.cintillo = cintillo;
        this.cintilloUrl = cintilloUrl;
        this.entradilla = entradilla;
        this.ademas = ademas;
        this.firmas = firmas;
        this.sectionId = sectionId;
        this.model = model;
        this.seccion = seccion;
        this.codeComments = codeComments;
        this.ttlComments = ttlComments;
        this.multimedia = multimedia;
        this.firstPublishedAt = firstPublishedAt;
        this.publishedAt = publishedAt;
        this.tags = tags;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getTipoWeb() {
        return tipoWeb;
    }

    public void setTipoWeb(Boolean tipoWeb) {
        this.tipoWeb = tipoWeb;
    }

    public Boolean getIndexable() {
        return indexable;
    }

    public void setIndexable(Boolean indexable) {
        this.indexable = indexable;
    }

    public Breadcrumb getBreadcrumb() {
        return breadcrumb;
    }

    public void setBreadcrumb(Breadcrumb breadcrumb) {
        this.breadcrumb = breadcrumb;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAntetitulo() {
        return antetitulo;
    }

    public void setAntetitulo(String antetitulo) {
        this.antetitulo = antetitulo;
    }

    public String getCintillo() {
        return cintillo;
    }

    public void setCintillo(String cintillo) {
        this.cintillo = cintillo;
    }

    public String getCintilloUrl() {
        return cintilloUrl;
    }

    public void setCintilloUrl(String cintilloUrl) {
        this.cintilloUrl = cintilloUrl;
    }

    public String getEntradilla() {
        return entradilla;
    }

    public void setEntradilla(String entradilla) {
        this.entradilla = entradilla;
    }

    public List<Adema> getAdemas() {
        return ademas;
    }

    public void setAdemas(List<Adema> ademas) {
        this.ademas = ademas;
    }

    public List<Firma> getFirmas() {
        return firmas;
    }

    public void setFirmas(List<Firma> firmas) {
        this.firmas = firmas;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getCodeComments() {
        return codeComments;
    }

    public void setCodeComments(String codeComments) {
        this.codeComments = codeComments;
    }

    public Integer getTtlComments() {
        return ttlComments;
    }

    public void setTtlComments(Integer ttlComments) {
        this.ttlComments = ttlComments;
    }

    public List<Multimedium> getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(List<Multimedium> multimedia) {
        this.multimedia = multimedia;
    }

    public String getFirstPublishedAt() {
        return firstPublishedAt;
    }

    public void setFirstPublishedAt(String firstPublishedAt) {
        this.firstPublishedAt = firstPublishedAt;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

}

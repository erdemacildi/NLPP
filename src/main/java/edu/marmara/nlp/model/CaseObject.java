package edu.marmara.nlp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CaseObject {
    @JsonProperty("Dairesi")
    private String daire;

    @JsonProperty("Mahkemesi")
    private String mahkeme;

    @JsonProperty("Mahkeme Günü")
    private String mahkemeGunu;

    @JsonProperty("Mahkeme Ayı")
    private String mahkemeAyi;

    @JsonProperty("Mahkeme Yılı")
    private String mahkemeYili;

    @JsonProperty("Suç")
    private String suc;

    @JsonProperty("Dosyanın Daireye Geliş Günü")
    private String dosyaninDaireyeGelisGunu;

    @JsonProperty("Dosyanın Daireye Geliş Ayı")
    private String dosyaninDaireyeGelisAyi;

    @JsonProperty("Dosyanın Daireye Geliş Yılı")
    private String dosyaninDaireyeGelisYili;

    @JsonProperty("Kanun Yolu")
    private String kanunYolu;

    @JsonProperty("Temyiz Eden")
    private String temyizEden;

    @JsonProperty("Dava Türü")
    private String davaTuru;

    @JsonProperty("Birinci Mahkemesi")
    private String birinciMahkemesi;

    @JsonProperty("ictihat")
    private String ictihat;


    public String getDaire() {
        return daire;
    }

    public void setDaire(String daire) {
        this.daire = daire;
    }

    public String getMahkeme() {
        return mahkeme;
    }

    public void setMahkeme(String mahkeme) {
        this.mahkeme = mahkeme;
    }

    public String getMahkemeGunu() {
        return mahkemeGunu;
    }

    public void setMahkemeGunu(String mahkemeGunu) {
        this.mahkemeGunu = mahkemeGunu;
    }

    public String getMahkemeAyi() {
        return mahkemeAyi;
    }

    public void setMahkemeAyi(String mahkemeAyi) {
        this.mahkemeAyi = mahkemeAyi;
    }

    public String getMahkemeYili() {
        return mahkemeYili;
    }

    public void setMahkemeYili(String mahkemeYili) {
        this.mahkemeYili = mahkemeYili;
    }

    public String getSuc() {
        return suc;
    }

    public void setSuc(String suc) {
        this.suc = suc;
    }

    public String getDosyaninDaireyeGelisGunu() {
        return dosyaninDaireyeGelisGunu;
    }

    public void setDosyaninDaireyeGelisGunu(String dosyaninDaireyeGelisGunu) {
        this.dosyaninDaireyeGelisGunu = dosyaninDaireyeGelisGunu;
    }

    public String getDosyaninDaireyeGelisAyi() {
        return dosyaninDaireyeGelisAyi;
    }

    public void setDosyaninDaireyeGelisAyi(String dosyaninDaireyeGelisAyi) {
        this.dosyaninDaireyeGelisAyi = dosyaninDaireyeGelisAyi;
    }

    public String getDosyaninDaireyeGelisYili() {
        return dosyaninDaireyeGelisYili;
    }

    public void setDosyaninDaireyeGelisYili(String dosyaninDaireyeGelisYili) {
        this.dosyaninDaireyeGelisYili = dosyaninDaireyeGelisYili;
    }

    public String getKanunYolu() {
        return kanunYolu;
    }

    public void setKanunYolu(String kanunYolu) {
        this.kanunYolu = kanunYolu;
    }

    public String getTemyizEden() {
        return temyizEden;
    }

    public void setTemyizEden(String temyizEden) {
        this.temyizEden = temyizEden;
    }

    public String getDavaTuru() {
        return davaTuru;
    }

    public void setDavaTuru(String davaTuru) {
        this.davaTuru = davaTuru;
    }

    public String getBirinciMahkemesi() {
        return birinciMahkemesi;
    }

    public void setBirinciMahkemesi(String birinciMahkemesi) {
        this.birinciMahkemesi = birinciMahkemesi;
    }

    public String getIctihat() {
        return ictihat;
    }

    public void setIctihat(String ictihat) {
        this.ictihat = ictihat;
    }
}

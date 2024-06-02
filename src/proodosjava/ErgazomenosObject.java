/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proodosjava;

/**
 *
 * @author Kwstas
 */
public class ErgazomenosObject {
    private String id;
    private String onoma;
    private String eponimo;
    private double misthos;
    private int meresErgasiasMina;
    private int adeia;
    private int asthenia;
    private int aneuApodoxon;
    private int tiposMisthou;
    private double wresErgasias;
    private String address;
    private int amka;
    private double sinoloMisthou;
    private String imerominiaMisthodosias;
        public ErgazomenosObject()
    {
    
    }
    public ErgazomenosObject(String id,String onoma,String eponimo,double misthos,int meresErgasiasMina,int adeia,int asthenia,int aneuApodoxon,int tiposMisthou,double wresErgasias,String address,int amka,String imerominiaMisthodosias,double sinoloMisthou)
    {
        this.id=id;
        this.onoma=onoma;
        this.eponimo=eponimo;
        this.misthos=misthos;
        this.meresErgasiasMina=meresErgasiasMina;
        this.adeia=adeia;
        this.asthenia=asthenia;
        this.aneuApodoxon=aneuApodoxon;
        this.tiposMisthou=tiposMisthou;
        this.wresErgasias=wresErgasias;
        this.address=address;
        this.amka=amka;
        this.sinoloMisthou=sinoloMisthou;
        this.imerominiaMisthodosias=imerominiaMisthodosias;
    }   

    public String getImerominiaMisthodosias() {
        return imerominiaMisthodosias;
    }

    public void setImerominiaMisthodosias(String imerominiaMisthodosias) {
        this.imerominiaMisthodosias = imerominiaMisthodosias;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAmka() {
        return amka;
    }

    public void setAmka(int amka) {
        this.amka = amka;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the onoma
     */
    public String getOnoma() {
        return onoma;
    }

    /**
     * @param onoma the onoma to set
     */
    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    /**
     * @return the eponimo
     */
    public String getEponimo() {
        return eponimo;
    }

    /**
     * @param eponimo the eponimo to set
     */
    public void setEponimo(String eponimo) {
        this.eponimo = eponimo;
    }

    /**
     * @return the misthos
     */
    public double getMisthos() {
        return misthos;
    }

    /**
     * @param misthos the misthos to set
     */
    public void setMisthos(double misthos) {
        this.misthos = misthos;
    }

    /**
     * @return the meresErgasiasMina
     */
    public int getMeresErgasiasMina() {
        return meresErgasiasMina;
    }

    /**
     * @param meresErgasiasMina the meresErgasiasMina to set
     */
    public void setMeresErgasiasMina(int meresErgasiasMina) {
        this.meresErgasiasMina = meresErgasiasMina;
    }

    /**
     * @return the adeia
     */
    public int getAdeia() {
        return adeia;
    }

    /**
     * @param adeia the adeia to set
     */
    public void setAdeia(int adeia) {
        this.adeia = adeia;
    }

    /**
     * @return the asthenia
     */
    public int getAsthenia() {
        return asthenia;
    }

    /**
     * @param asthenia the asthenia to set
     */
    public void setAsthenia(int asthenia) {
        this.asthenia = asthenia;
    }

    /**
     * @return the aneuApodoxon
     */
    public int getAneuApodoxon() {
        return aneuApodoxon;
    }

    /**
     * @param aneuApodoxon the aneuApodoxon to set
     */
    public void setAneuApodoxon(int aneuApodoxon) {
        this.aneuApodoxon = aneuApodoxon;
    }

    /**
     * @return the tiposMisthou
     */
    public int getTiposMisthou() {
        return tiposMisthou;
    }

    /**
     * @param tiposMisthou the tiposMisthou to set
     */
    public void setTiposMisthou(int tiposMisthou) {
        this.tiposMisthou = tiposMisthou;
    }

    /**
     * @return the wresErgasias
     */
    public double getWresErgasias() {
        return wresErgasias;
    }

    /**
     * @param wresErgasias the wresErgasias to set
     */
    public void setWresErgasias(double wresErgasias) {
        this.wresErgasias = wresErgasias;
    }
    
        public String toString() {
        return id+" "+onoma+" "+eponimo+" "+misthos+" "+meresErgasiasMina+" "+adeia+" "+asthenia+" "+aneuApodoxon+" "+tiposMisthou+" "+wresErgasias;
    }
    public double misthosErgazomenou()
            
    {
        sinoloMisthou=0;
        if (tiposMisthou==1)
        {
            sinoloMisthou+=wresErgasias*misthos;
        }
        else if (tiposMisthou==2)
        {
            sinoloMisthou+=misthos*(meresErgasiasMina+adeia+asthenia);
        }
        return sinoloMisthou;
    }
    public  String pdfToString()
    {
        return "AFM Ergazomenou: "+id+"\nOnomateponimo: "+onoma+" "+eponimo+"\nAddress: "+address+"\nAMKA: "+amka+"\nMisthos: "+sinoloMisthou+"€\nHmeres Kanonikis Adeias: "+adeia+"\nHmeres Adeias Asthenias: "+asthenia+"\nHmeres Adeias Aneu Apodoxon: "+aneuApodoxon;
    }
}

    
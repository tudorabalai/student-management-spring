package edu.msia11.proiect.components.student;

/* Entitatea este reprezentarea unei tabele din baza de date
* sub forma unei clase Java */
public class StudentEntity {
    private String numarMatricol;
    private String Nume;
    private String Prenume;
    private long cnp;
    private String adresaDomiciliu;
    private String serieBuletin;
    private int sumarBuletin;

    public String getNumarMatricol() {
        return numarMatricol;
    }

    public void setNumarMatricol(String numarMatricol) {
        this.numarMatricol = numarMatricol;
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public String getPrenume() {
        return Prenume;
    }

    public void setPrenume(String prenume) {
        Prenume = prenume;
    }

    public long getCnp() {
        return cnp;
    }

    public void setCnp(long cnp) {
        this.cnp = cnp;
    }

    public String getAdresaDomiciliu() {
        return adresaDomiciliu;
    }

    public void setAdresaDomiciliu(String adresaDomiciliu) {
        this.adresaDomiciliu = adresaDomiciliu;
    }

    public String getSerieBuletin() {
        return serieBuletin;
    }

    public void setSerieBuletin(String serieBuletin) {
        this.serieBuletin = serieBuletin;
    }

    public int getSumarBuletin() {
        return sumarBuletin;
    }

    public void setSumarBuletin(int sumarBuletin) {
        this.sumarBuletin = sumarBuletin;
    }
}
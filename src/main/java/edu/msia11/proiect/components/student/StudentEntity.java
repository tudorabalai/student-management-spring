package edu.msia11.proiect.components.student;

/* Entitatea este reprezentarea unei tabele din baza de date
* sub forma unei clase Java */
public class StudentEntity {
    private String numarMatricol;
    private String nume;
    private String prenume;
    private long cnp;
    private String adresaDomiciliu;
    private String serieBuletin;
    private int numarBuletin;

    public StudentEntity(String numarMatricol,
                         String nume,
                         String prenume,
                         long cnp,
                         String adresaDomiciliu,
                         String serieBuletin,
                         int numarBuletin) {
        this.numarMatricol = numarMatricol;
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.adresaDomiciliu = adresaDomiciliu;
        this.serieBuletin = serieBuletin;
        this.numarBuletin = numarBuletin;
    }

    public StudentEntity() {
    }

    public String getNumarMatricol() {
        return numarMatricol;
    }

    public void setNumarMatricol(String numarMatricol) {
        this.numarMatricol = numarMatricol;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
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

    public int getNumarBuletin() {
        return numarBuletin;
    }

    public void setNumarBuletin(int numarBuletin) {
        this.numarBuletin = numarBuletin;
    }
}
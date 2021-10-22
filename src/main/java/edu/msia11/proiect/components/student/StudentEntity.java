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

}
package Objetos;

import java.util.Objects;

public class Persona {

private String nom;

private String cognom;

private int edat;

private String dni;

private String adreça;

private String telefon;

private String correu;

    public Persona (String nom, String cognom, int edat, String dni, String adreça, String telefon, String correu){
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
        this.dni = dni;
        this.adreça = adreça;
        this.telefon = telefon;
        this.correu = correu;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAdreça() {
        return adreça;
    }

    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getCorreu() {
        return correu;
    }

    public void setCorreu(String correu) {
        this.correu = correu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edat == persona.edat && Objects.equals(nom, persona.nom) && Objects.equals(cognom, persona.cognom) && Objects.equals(dni, persona.dni) && Objects.equals(adreça, persona.adreça) && Objects.equals(telefon, persona.telefon) && Objects.equals(correu, persona.correu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, cognom, edat, dni, adreça, telefon, correu);
    }

    @Override
    public String
    toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", cognom='" + cognom + '\'' +
                ", edat=" + edat +
                ", dni='" + dni + '\'' +
                ", adreça='" + adreça + '\'' +
                ", telefon='" + telefon + '\'' +
                ", correu='" + correu + '\'' +
                '}';
    }
}

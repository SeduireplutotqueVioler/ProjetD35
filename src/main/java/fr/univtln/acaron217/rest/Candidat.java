package fr.univtln.acaron217.rest;

import javax.persistence.Id;

public class Candidat {
    @Id
    private int ID;
    private String nom;
    private String prenom;
    private String adresse;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getID() {
        return ID;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public Candidat() {

    }


    public static class Builder {
        private String nom;
        private String prenom;
        private String adresse;

        public Builder (String nom) {
            this.nom = nom;
        }

        public Builder prenom(String prenom) {
            this.prenom = prenom;
            return this;
        }

        public Builder adresse(String adresse) {
            this.adresse = adresse;
            return this;
        }

        public Candidat build() {
            return new Candidat(this);
        }
    }

    public Candidat(Builder b) {
        this.nom = b.nom;
        this.prenom = b.prenom;
        this.adresse = b.adresse;
    }
}

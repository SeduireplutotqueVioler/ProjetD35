package fr.univtln.acaron217.ejb;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.IOException;
import java.io.Serializable;

@Named
@SessionScoped
public class CandidatBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nom="";
    private String prenom="";
    private String adresse="";

    private String nouveaunom;
    private String nouveauprenom;
    private String nouvelleadresse;

    private int compteur = 0;

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public String updateNom() {
        return nouveaunom;
    }

    public String updatePrenom() {
        return nouveauprenom;
    }

    public String updateAdresse() {
        return nouvelleadresse;
    }

    public void logout() throws IOException {
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.invalidateSession();
        ec.redirect(ec.getRequestContextPath() + "/index.html");
    }
}

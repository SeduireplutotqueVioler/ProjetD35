package fr.univtln.acaron217.rest;

import java.util.ArrayList;
import java.util.List;

public class Les_Candidats {
    private List<Candidat> candidats;

    public Les_Candidats() {
        candidats = new ArrayList<>();
    }
    public void ajouterCandidat(Candidat candidat) {
        candidats.add(candidat);
    }

    public void ajouterCandidat(String nom, String prenom, String adresse) {
        candidats.add(new Candidat.Builder(nom).prenom(prenom).adresse(adresse).build());
    }

    public void supprimerCandidat(int Id) {
        for (int i = 0; i < candidats.size(); i++) {
            if (candidats.get(i).getID() == Id) {
                candidats.remove(i);
                return;
            }
        }
    }

    public Candidat getCandidat(int Id) {
        for (int i = 0; i < candidats.size(); i++) {
            if (candidats.get(i).getID() == Id) {
                return candidats.get(i);
            }
        }
        return new Candidat();
    }

    public List<Candidat> getCandidats(){
        return candidats;
    }
}

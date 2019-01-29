package fr.univtln.acaron217.rest;

import javax.ws.rs.*;
import java.util.List;

@Path("/annuaire")
@Produces({"application/json", "application/xml"})
//@Produces("application/json")
public class Annuaire {

    private final static Les_Candidats moduleClients = new Les_Candidats();
    public static final Candidat[] candidatsinit = {new Candidat.Builder("Gaeton").prenom("Cyril").adresse("666 Enfer").build(),
            new Candidat.Builder("Michel").prenom("Marie").adresse("654 rue des roses").build()};

    static {
        moduleClients.ajouterCandidat(candidatsinit[0]);
        moduleClients.ajouterCandidat(candidatsinit[1]);
    }

    @PUT
    @Path("candidat")
    public void ajouterAuteur(@QueryParam("prenom") String prenom, @QueryParam("nom") String nom, @QueryParam("adresse") String adresse) {
        moduleClients.ajouterCandidat(prenom, nom, adresse);
    }

    @DELETE
    @Path("candidat/{id}")
    public void supprimerAuteur(@PathParam("id") final int ID) {
        moduleClients.supprimerCandidat(ID);
    }

    @GET
    @Path("candidat/{id}")
    public Candidat getAuteur(@PathParam("id") final int ID) {
        Candidat auteur = moduleClients.getCandidat(ID);
        return auteur;
    }

    @GET
    @Path("candidat")
    public List<Candidat> getAuteurs() {
        return moduleClients.getCandidats();
    }
}

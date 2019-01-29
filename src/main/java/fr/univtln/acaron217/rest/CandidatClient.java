package fr.univtln.acaron217.rest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class CandidatClient {
    public static void main(String[] args) {
        // create the client
        Client c = Client.create();
        WebResource webResource = c.resource(Main.BASE_URI);

        //Send a get with a String as response
        String responseAuteursAsJson = webResource.path("annuaire/candidat").get(String.class);
        System.out.println(responseAuteursAsJson);

        //Idem but the result is deserialised to an instance of Auteur
        Candidat auteur = webResource.path("annuaire/candidat/1").get(Candidat.class);
        System.out.println(auteur);

        webResource.path("annuaire/candidat").queryParam("nom","X").queryParam("prenom","Y").put();
        System.out.println(webResource.path("annuaire/auteur").get(String.class));
    }
}
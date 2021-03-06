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
public class HelloBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String message = "Bien!";

    private String newMessage;

    public String getNewMessage() {
        return newMessage;
    }

    public void setNewMessage(String newMessage) {
        this.newMessage = newMessage;
    }

    private int compteur = 0;

    public String getMessage() {
        return message + " " + compteur++;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String updateMessage() {
        message = newMessage;
        return "welcome";
    }
    public void logout() throws IOException {
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.invalidateSession();
        ec.redirect(ec.getRequestContextPath() + "/index.html");
    }
}

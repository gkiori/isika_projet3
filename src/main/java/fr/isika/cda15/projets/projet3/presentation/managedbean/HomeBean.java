package fr.isika.cda15.projets.projet3.presentation.managedbean;

import fr.isika.cda15.projets.projet3.service.association.AssociationService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import java.io.Serializable;

@ManagedBean
@ViewScoped
public class HomeBean implements Serializable {

    @Inject
    private AssociationService associationService;

    public String getConnectedUser() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        String connectedUser = (String) session.getAttribute("userName");
        return connectedUser;
    }

    public String doLogout() {
        HttpSession connecterUser = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        connecterUser.invalidate();
        return "index?faces-redirect=true";
    }

}

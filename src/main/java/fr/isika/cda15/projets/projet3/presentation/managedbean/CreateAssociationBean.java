package fr.isika.cda15.projets.projet3.presentation.managedbean;

import fr.isika.cda15.projets.projet3.entity.Association;
import fr.isika.cda15.projets.projet3.entity.UserAccount;
import fr.isika.cda15.projets.projet3.presentation.viewmodel.AssociationForm;
import fr.isika.cda15.projets.projet3.service.association.AssociationService;
import fr.isika.cda15.projets.projet3.service.useraccount.UserAccountService;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import java.io.Serializable;

@ManagedBean
@ViewScoped
public class CreateAssociationBean implements Serializable {

    @Inject
    private AssociationService associationService;
    @Inject
    private UserAccountService userAccountService;

    private AssociationForm associationForm = new AssociationForm();

    public String create() {
        UIComponent formulaire = FacesContext.getCurrentInstance().getViewRoot().findComponent("createAssociationForm");
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        UserAccount admin = userAccountService.findByIdService((Long) session.getAttribute("id"));
        try {
            Association association = new Association();
            association.setName(associationForm.getName());
            association.setEmail(associationForm.getEmail());
            association.setDescription(associationForm.getDescription());
            association.setAdminAsso(admin);
            associationService.createService(association);
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(formulaire.getClientId(), new FacesMessage(e.getMessage()));
        }
        return "index?faces-redirect=true";
    }

    public AssociationForm getAssociationForm() {
        return associationForm;
    }

    public void setAssociationForm(AssociationForm associationForm) {
        this.associationForm = associationForm;
    }
}

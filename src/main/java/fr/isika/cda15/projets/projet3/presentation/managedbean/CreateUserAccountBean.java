package fr.isika.cda15.projets.projet3.presentation.managedbean;

import fr.isika.cda15.projets.projet3.domaine.exception.UserAlreadyExistsException;
import fr.isika.cda15.projets.projet3.entity.UserAccount;
import fr.isika.cda15.projets.projet3.presentation.viewmodel.UserAccountForm;
import fr.isika.cda15.projets.projet3.service.useraccount.UserAccountService;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.io.Serializable;

@ManagedBean
@ViewScoped
public class CreateUserAccountBean implements Serializable {

    @Inject
    private UserAccountService accountService;
    private UserAccountForm userAccountForm = new UserAccountForm();

    public String create() {
        UIComponent formulaire = FacesContext.getCurrentInstance().getViewRoot().findComponent("createUserAccountForm");
        if ( !userAccountForm.passwordsAreSame()) {
            FacesContext.getCurrentInstance().addMessage(formulaire.getClientId(), new FacesMessage("Passwords are different"));
            return "";
        } else {
            try {
                UserAccount userAccount = new UserAccount();
                userAccount.setUsername(userAccountForm.getUsername());
                userAccount.setEmail(userAccountForm.getEmail());
                userAccount.setAddress(userAccountForm.getAddress());
                userAccount.setPhone(userAccountForm.getPhone());
                userAccount.setPassword(userAccountForm.getPassword());
                accountService.createService(userAccount);
                return "index?faces-redirect=true";
            } catch (UserAlreadyExistsException e) {
                FacesContext.getCurrentInstance().addMessage(formulaire.getClientId(), new FacesMessage(e.getMessage()));
            }
            return "createAccount";
        }
    }

    public UserAccountForm getUserAccountForm() {
        return userAccountForm;
    }

    public void setUserAccountForm(UserAccountForm userAccountForm) {
        this.userAccountForm = userAccountForm;
    }
}

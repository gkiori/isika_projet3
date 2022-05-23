package fr.isika.cda15.projets.projet3.presentation.managedbean;

import fr.isika.cda15.projets.projet3.entity.UserAccount;
import fr.isika.cda15.projets.projet3.service.useraccount.UserAccountService;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Optional;

@ManagedBean
public class LoginBean implements Serializable {

    private static final long serialVersionUID = -11574855474L;

    @NotEmpty(message = "Required")
    @NotNull(message = "Required")
    @Email
    private String email;
    @NotEmpty(message = "Required")
    @NotNull(message = "Required")
    private String password;
    private HttpSession connectedUser;
    @Inject
    private UserAccountService accountService;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HttpSession getConnectedUser() {
        return connectedUser;
    }

    public void setConnectedUser(HttpSession connectedUser) {
        this.connectedUser = connectedUser;
    }

    public String doLogin() throws ServletException {
        Optional<UserAccount> optional = accountService.finByEmailService(email);
        if (optional.isPresent()) {
            UserAccount account = optional.get();
            if (account.getEmail().equals(email) && account.getPassword().equals(password)) {
                HttpSession connectedUser = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
                connectedUser.setAttribute("id", account.getId());
                connectedUser.setAttribute("userName", account.getUsername());
                System.out.println("LoginBean.doLogin() : " + connectedUser.getAttribute("userName"));
                return "index?faces-redirect=true";
            } else {
                UIComponent formulaire = FacesContext.getCurrentInstance().getViewRoot().findComponent("loginForm");
                FacesContext.getCurrentInstance().addMessage(formulaire.getClientId(), new FacesMessage("Wrong authentification"));
            }
        } else {
            UIComponent formulaire = FacesContext.getCurrentInstance().getViewRoot().findComponent("loginForm");
            FacesContext.getCurrentInstance().addMessage(formulaire.getClientId(), new FacesMessage("UserAccount not found"));
        }
        return "login";
    }

    public String doLogout() {
        HttpSession connecterUser = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        connecterUser.invalidate();
        return "index?faces-redirect=true";
    }
}

package fr.isika.cda15.projets.projet3.presentation.viewmodel;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

public class AssociationForm implements Serializable {

    private static final long serialVersionUID = -22847744774155L;

    @NotEmpty
    @NotNull
    private String name;
    @NotEmpty
    @NotNull
    @Email
    private String email;
    private String description;

    public AssociationForm() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

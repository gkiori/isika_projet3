package fr.isika.cda15.projets.projet3.presentation.viewmodel;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class UserAccountForm implements Serializable {

    private static final long serialVersionUID = -222554844774155L;

    @NotEmpty(message = "Not empty field")
    @NotNull(message = "Not null field")
    @Size(min = 1, max = 25, message = "Min character 1; Max character 25")
    @Pattern(regexp = "[^0-9]*", message = "No digits in Username")
    private String username;
    @Email
    private String email;
    private String phone;
    private String address;
    private String password;
    private String confirmPassword;

    public UserAccountForm() {
    }

    public boolean passwordsAreSame() {
        return password.equals(confirmPassword);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}

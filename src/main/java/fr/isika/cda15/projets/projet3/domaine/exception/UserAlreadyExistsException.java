package fr.isika.cda15.projets.projet3.domaine.exception;

public class UserAlreadyExistsException extends Exception {

    private static final long serialVersionUID = -22551442254477L;
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}

package fr.isika.cda15.projets.projet3.repository.useraccount;

import fr.isika.cda15.projets.projet3.entity.UserAccount;
import fr.isika.cda15.projets.projet3.repository.Dao;

import java.util.Optional;

public interface UserAccountDao extends Dao<UserAccount> {
    Optional<UserAccount> findByEmail(final String email);
}

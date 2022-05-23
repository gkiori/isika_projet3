package fr.isika.cda15.projets.projet3.repository.useraccount;

import fr.isika.cda15.projets.projet3.entity.UserAccount;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Stateless
public class UserAccountDaoImpl implements UserAccountDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public UserAccount create(UserAccount userAccount) {
        try {
            UserAccount userAccountToCreate = new UserAccount();
            userAccountToCreate.setUsername(userAccount.getUsername());
            userAccountToCreate.setEmail(userAccount.getEmail());
            userAccountToCreate.setPhone(userAccount.getPhone());
            userAccountToCreate.setAddress(userAccount.getAddress());
            userAccountToCreate.setPassword(userAccount.getPassword()); // Ajout de MD5 pour l'encryptage du mdp
            this.entityManager.persist(userAccountToCreate);
            return userAccount;
        } catch (Exception e) {
            System.out.println("UserAccountDaoImpl.create() - Failed : " + e.getMessage());
            return null;
        }
    }

    @Override
    public void update(UserAccount userAccount) {
        try {
            UserAccount userAccountToUpdate = this.entityManager.find(UserAccount.class, userAccount.getId());
            userAccountToUpdate.setUsername(userAccount.getUsername());
            userAccountToUpdate.setEmail(userAccount.getEmail());
            userAccountToUpdate.setPhone(userAccount.getPhone());
            userAccountToUpdate.setAddress(userAccount.getAddress());
            userAccountToUpdate.setPassword(userAccount.getPassword());
            this.entityManager.persist(userAccountToUpdate);
        } catch (Exception e) {
            System.out.println("UserAccountDaoImpl.update() - Failed : " + e.getMessage());
        }
    }

    @Override
    public void delete(Long id) {
        try {
            UserAccount userAccountToDelete = this.entityManager.find(UserAccount.class, id);
            this.entityManager.remove(userAccountToDelete);
        } catch (Exception e) {
            System.out.println("UserAccountDaoImpl.delete() - Failed : " + e.getMessage());
        }
    }

    @Override
    public UserAccount findById(Long id) {
        return this.entityManager.find(UserAccount.class, id);
    }

    @Override
    public List<UserAccount> findAll() {
        return this.entityManager.createQuery("select ua from UserAccount ua", UserAccount.class).getResultList();
    }

    @Override
    public Optional<UserAccount> findByEmail(String email) {
        try {
            UserAccount userAccount = this.entityManager.createNamedQuery("UserAccount.findByEmail", UserAccount.class)
                    .setParameter("email_param", email).getSingleResult();
            return Optional.ofNullable(userAccount);
        } catch (NoResultException ex) {
            System.out.println("UserAccountDaoImpl.findByEmail() - not found : " + email);
        }
        return Optional.empty();
    }
}

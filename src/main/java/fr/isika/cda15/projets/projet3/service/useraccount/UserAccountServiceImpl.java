package fr.isika.cda15.projets.projet3.service.useraccount;

import fr.isika.cda15.projets.projet3.domaine.exception.UserAlreadyExistsException;
import fr.isika.cda15.projets.projet3.entity.*;
import fr.isika.cda15.projets.projet3.repository.useraccount.UserAccountDao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@Stateless
public class UserAccountServiceImpl implements UserAccountService {
    @Inject
    private UserAccountDao userAccountDao;

    /**
     * @param userAccount
     * @return
     */
    @Override
    public UserAccount createService(UserAccount userAccount) throws UserAlreadyExistsException {

        Optional<UserAccount> optional = userAccountDao.findByEmail(userAccount.getEmail());
        if(optional.isPresent()) {
            throw new UserAlreadyExistsException("Account already exists");
        }
        return userAccountDao.create(userAccount);
    }

    /**
     * @param userAccount
     */
    @Override
    public void updateService(UserAccount userAccount) {
        userAccountDao.update(userAccount);
    }

    /**
     * @param id
     */
    @Override
    public void deleteService(Long id) {
        userAccountDao.delete(id);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public UserAccount findByIdService(Long id) {
        return userAccountDao.findById(id);
    }

    /**
     * @return
     */
    @Override
    public List<UserAccount> findAllService() {
        return userAccountDao.findAll();
    }

    /**
     * @param email
     * @return
     */
    @Override
    public Optional<UserAccount> finByEmailService(String email) {
        return userAccountDao.findByEmail(email);
    }

    /**
     * @param userAccount 
     * @return
     */
    @Override
    public UserAccount createUserAccount(UserAccount userAccount) {
        return null;
    }

    /**
     * @param userAccount 
     */
    @Override
    public void updateUserAccountt(UserAccount userAccount) {

    }

    /**
     * @param userAccount 
     */
    @Override
    public void deleteUserAccount(UserAccount userAccount) {

    }

    /**
     * @param userAccount 
     * @param association
     */
    @Override
    public void subscribe(UserAccount userAccount, Association association) {

    }

    /**
     * @param cotisation 
     * @return
     */
    @Override
    public byte[] generateCotisationInvoice(Cotisation cotisation) {
        return new byte[0];
    }

    /**
     * @param contribution 
     * @return
     */
    @Override
    public byte[] generateContributionInvoice(Contribution contribution) {
        return new byte[0];
    }

    /**
     * @param order 
     * @return
     */
    @Override
    public byte[] generateOrderInvoice(Order order) {
        return new byte[0];
    }
}

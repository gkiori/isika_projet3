package fr.isika.cda15.projets.projet3.service.useraccount;

import fr.isika.cda15.projets.projet3.entity.*;
import fr.isika.cda15.projets.projet3.service.Service;

import java.util.Optional;

public interface UserAccountService extends Service<UserAccount> {

    Optional<UserAccount> finByEmailService(String email);
    UserAccount createUserAccount(UserAccount userAccount);
    void updateUserAccountt(UserAccount userAccount);
    void deleteUserAccount(UserAccount userAccount);

    void subscribe(UserAccount userAccount, Association association);
    byte[] generateCotisationInvoice(Cotisation cotisation);

    byte[] generateContributionInvoice(Contribution contribution);

    byte[] generateOrderInvoice(Order order);

}

package fr.isika.cda15.projets.projet3.service.crowdfunding;

import fr.isika.cda15.projets.projet3.entity.Crowdfunding;
import fr.isika.cda15.projets.projet3.service.Service;

import java.util.List;

public interface CrowdfundingService extends Service<Crowdfunding> {
    Crowdfunding findCrowdunfingById(Long id);
    List<Crowdfunding> findAllCrowdunfing();
    List<Crowdfunding> sortByAssociation();
    List<Crowdfunding> sortByTag();
}

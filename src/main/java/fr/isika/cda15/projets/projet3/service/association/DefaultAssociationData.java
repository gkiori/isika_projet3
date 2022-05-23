package fr.isika.cda15.projets.projet3.service.association;

import fr.isika.cda15.projets.projet3.entity.Association;
import fr.isika.cda15.projets.projet3.repository.association.AssociationDao;

import javax.ejb.Stateless;

@Stateless
public class DefaultAssociationData {

    private AssociationDao associationDao;

    public void initialisation() {
        Association asso1 = associationDao.create(new Association(
                "AGP",
                "agp@gmail.com",
                "Association des Gabonais de Poitiers"));
    }
}

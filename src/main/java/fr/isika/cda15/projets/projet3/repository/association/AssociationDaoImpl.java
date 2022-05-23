package fr.isika.cda15.projets.projet3.repository.association;

import fr.isika.cda15.projets.projet3.entity.Association;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class AssociationDaoImpl implements AssociationDao{

    @PersistenceContext
    private EntityManager entityManager;

    /**
     *
     * @param association
     * @return
     */
    @Override
    public Association create(Association association) {
        try {
            this.entityManager.persist(association);
            return association;
        } catch (Exception e) {
            System.out.println("AssociationDaoImpl.create() - Failed : " + e.getMessage());
            return null;
        }
    }

    /**
     *
     * @param association
     */
    @Override
    public void update(Association association) {
        try {
            Association associationToUpdate = this.entityManager.find(Association.class, association.getId());
            associationToUpdate.setName(association.getName());
            associationToUpdate.setAdminAsso(association.getAdminAsso());
            this.entityManager.persist(associationToUpdate);
        } catch (Exception e) {
            System.out.println("AssociationDaoImpl.update() - Failed : " + e.getMessage());
        }
    }

    /**
     *
     * @param id
     */
    @Override
    public void delete(Long id) {
        try {
            Association associationToDelete = this.entityManager.find(Association.class, id);
            this.entityManager.remove(associationToDelete);
        } catch (Exception e) {
            System.out.println("AssociationDaoImpl.delete() - Failed : " + e.getMessage());
        }

    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Association findById(Long id) {
        return this.entityManager.find(Association.class, id);
    }

    /**
     *
     * @return
     */
    @Override
    public List<Association> findAll() {
        return this.entityManager.createQuery("select ass from Association ass", Association.class).getResultList();
    }
}

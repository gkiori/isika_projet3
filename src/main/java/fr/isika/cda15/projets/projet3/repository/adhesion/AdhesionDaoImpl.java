package fr.isika.cda15.projets.projet3.repository.adhesion;

import fr.isika.cda15.projets.projet3.entity.Adhesion;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class AdhesionDaoImpl implements AdhesionDao{

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * @param adhesion 
     * @return
     */
    @Override
    public Adhesion create(Adhesion adhesion) {
        return null;
    }

    /**
     * @param adhesion 
     */
    @Override
    public void update(Adhesion adhesion) {

    }

    /**
     * @param id 
     */
    @Override
    public void delete(Long id) {

    }

    /**
     * @param id 
     * @return
     */
    @Override
    public Adhesion findById(Long id) {
        return null;
    }

    /**
     * @return 
     */
    @Override
    public List<Adhesion> findAll() {
        return null;
    }
}

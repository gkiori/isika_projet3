package fr.isika.cda15.projets.projet3.repository.cotisation;

import fr.isika.cda15.projets.projet3.entity.Cotisation;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class CotisationDaoImpl implements CotisationDao {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * @param cotisation
     * @return
     */
    @Override
    public Cotisation create(Cotisation cotisation) {
        return null;
    }

    /**
     * @param cotisation
     */
    @Override
    public void update(Cotisation cotisation) {

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
    public Cotisation findById(Long id) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Cotisation> findAll() {
        return null;
    }
}

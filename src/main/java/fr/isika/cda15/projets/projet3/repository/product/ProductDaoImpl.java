package fr.isika.cda15.projets.projet3.repository.product;

import fr.isika.cda15.projets.projet3.entity.Product;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ProductDaoImpl implements ProductDao {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * @param product 
     * @return
     */
    @Override
    public Product create(Product product) {
        return null;
    }

    /**
     * @param product 
     */
    @Override
    public void update(Product product) {

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
    public Product findById(Long id) {
        return null;
    }

    /**
     * @return 
     */
    @Override
    public List<Product> findAll() {
        return null;
    }
}

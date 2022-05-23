package fr.isika.cda15.projets.projet3.service.product;

import fr.isika.cda15.projets.projet3.domaine.exception.UserAlreadyExistsException;
import fr.isika.cda15.projets.projet3.entity.Product;
import fr.isika.cda15.projets.projet3.repository.product.ProductDao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class ProductServiceImpl implements ProductService {

    @Inject
    private ProductDao productDao;

    /**
     * @param id
     * @return
     */
    @Override
    public Product findProductById(Long id) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Product> findAllProduct() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Product> sortProductQuantity() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Product> sortProductUnitPrice() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Product> inStockProduct() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Product> outStockProduct() {
        return null;
    }

    /**
     * @param product
     * @return
     * @throws UserAlreadyExistsException
     */
    @Override
    public Product createService(Product product) throws UserAlreadyExistsException {
        return null;
    }

    /**
     * @param product
     */
    @Override
    public void updateService(Product product) {

    }

    /**
     * @param id
     */
    @Override
    public void deleteService(Long id) {

    }

    /**
     * @param id
     * @return
     */
    @Override
    public Product findByIdService(Long id) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Product> findAllService() {
        return null;
    }
}

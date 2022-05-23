package fr.isika.cda15.projets.projet3.service;

import fr.isika.cda15.projets.projet3.domaine.exception.UserAlreadyExistsException;

import java.util.List;

public interface Service<T> {
    T createService(T t) throws UserAlreadyExistsException;
    void updateService(T t);
    void deleteService(Long id);
    T findByIdService(Long id);
    List<T> findAllService();
}

package fr.isika.cda15.projets.projet3.repository;

import java.util.List;

public interface Dao<T> {
    T create(T t);
    void update(T t);
    void delete(Long id);
    T findById(Long id);
    List<T> findAll();
}

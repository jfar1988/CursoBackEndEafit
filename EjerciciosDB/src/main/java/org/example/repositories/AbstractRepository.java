package org.example.repositories;

import lombok.NoArgsConstructor;
import org.example.configs.EntityManagerPostgres;

import java.lang.reflect.ParameterizedType;
import java.util.List;

@NoArgsConstructor
public abstract class AbstractRepository<T>{

    protected EntityManagerPostgres<T> entityManagerPostgres;

    private Class<T> tClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    public AbstractRepository(EntityManagerPostgres<T> entityManagerPostgres) {
        this.entityManagerPostgres = entityManagerPostgres;
    }

    public void create(T entity) {
        entityManagerPostgres.save(entity);
        System.out.println("Entidad creada");
    }

    public List<T> findAll() {
        String className = tClass.getSimpleName();
        return entityManagerPostgres.listAll(
                "SELECT d FROM " + className + " d",
                tClass);
    }

    public T findById(Long id) {
        return entityManagerPostgres.getEntityManager().find(tClass, id);
    }


    // Cerrar el EntityManagerFactory cuando haya terminado.
    public void close() {
        if (entityManagerPostgres.getEntityManager() != null) {
            entityManagerPostgres.getEntityManager().close();
        }
    }

}

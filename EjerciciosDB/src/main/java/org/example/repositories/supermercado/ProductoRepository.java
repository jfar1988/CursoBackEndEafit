package org.example.repositories.supermercado;

import org.example.configs.EntityManagerPostgres;
import org.example.models.supermercado.Producto;
import org.example.repositories.AbstractRepository;

public class ProductoRepository extends AbstractRepository<Producto> {

    public ProductoRepository() {
        super(new EntityManagerPostgres<>());
    }
}

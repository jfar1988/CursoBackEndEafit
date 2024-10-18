package org.example.repositories.supermercado;

import org.example.configs.EntityManagerPostgres;

import org.example.models.supermercado.Venta;
import org.example.repositories.AbstractRepository;

public class VentaRepository extends AbstractRepository<Venta> {

    public VentaRepository() {
        super(new EntityManagerPostgres<>());
    }
}

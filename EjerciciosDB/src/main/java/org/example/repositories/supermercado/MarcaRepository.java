package org.example.repositories.supermercado;

import org.example.configs.EntityManagerPostgres;

import org.example.models.supermercado.Marca;
import org.example.repositories.AbstractRepository;

public class MarcaRepository extends AbstractRepository<Marca> {

    public MarcaRepository() {
        super(new EntityManagerPostgres<>());
    }
}
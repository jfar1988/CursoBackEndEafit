package org.example.repositories.supermercado;

import org.example.configs.EntityManagerPostgres;
import org.example.models.supermercado.Cliente;
import org.example.repositories.AbstractRepository;

public class ClienteRepository extends AbstractRepository<Cliente> {

    public ClienteRepository() {
        super(new EntityManagerPostgres<>());
    }
}
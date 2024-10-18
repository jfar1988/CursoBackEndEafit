package org.example.repositories.curso;

import org.example.configs.EntityManagerPostgres;
import org.example.models.curso.Nota;
import org.example.repositories.AbstractRepository;

public class NotaRepository extends AbstractRepository<Nota> {

    public NotaRepository() {
        super(new EntityManagerPostgres<>());
    }
}

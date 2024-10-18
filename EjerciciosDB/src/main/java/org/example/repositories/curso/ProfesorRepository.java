package org.example.repositories.curso;

import org.example.configs.EntityManagerPostgres;
import org.example.models.curso.Profesor;
import org.example.repositories.AbstractRepository;

public class ProfesorRepository extends AbstractRepository<Profesor> {

    public ProfesorRepository() {
        super(new EntityManagerPostgres<>());
    }
}

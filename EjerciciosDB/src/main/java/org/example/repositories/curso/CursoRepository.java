package org.example.repositories.curso;

import org.example.configs.EntityManagerPostgres;
import org.example.models.curso.Curso;
import org.example.repositories.AbstractRepository;

public class CursoRepository extends AbstractRepository<Curso> {

    public CursoRepository() {
        super(new EntityManagerPostgres<>());
    }
}
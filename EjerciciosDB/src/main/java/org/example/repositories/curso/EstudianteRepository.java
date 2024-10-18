package org.example.repositories.curso;

import org.example.configs.EntityManagerPostgres;
import org.example.models.curso.Estudiante;
import org.example.repositories.AbstractRepository;

public class EstudianteRepository extends AbstractRepository<Estudiante> {

    public EstudianteRepository() {
        super(new EntityManagerPostgres<>());
    }
}
package org.example.repositories.empleado;

import org.example.configs.EntityManagerPostgres;
import org.example.models.empleado.Empleado;
import org.example.repositories.AbstractRepository;

public class EmpleadoRepository extends AbstractRepository<Empleado> {

    public EmpleadoRepository() {
        super(new EntityManagerPostgres<>());
    }
}


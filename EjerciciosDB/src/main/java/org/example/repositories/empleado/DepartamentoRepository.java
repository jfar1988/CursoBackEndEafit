package org.example.repositories.empleado;

import org.example.configs.EntityManagerPostgres;
import org.example.models.empleado.Departamento;
import org.example.repositories.AbstractRepository;

public class DepartamentoRepository extends AbstractRepository<Departamento> {

    public DepartamentoRepository() {
        super(new EntityManagerPostgres<>());
    }
}

package org.example.repositories.empleado;

import org.example.configs.EntityManagerPostgres;
import org.example.models.empleado.Proyecto;
import org.example.repositories.AbstractRepository;

public class ProyectoRepository extends AbstractRepository<Proyecto> {

    public ProyectoRepository() {
        super(new EntityManagerPostgres<Proyecto>());
    }
}

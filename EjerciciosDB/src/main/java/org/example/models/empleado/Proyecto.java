package org.example.models.empleado;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Entity
@Table(name = "proyectos")
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NonNull
    private String nombre;

    @NonNull
    private String descripcion;

    private double presupuesto;

    @OneToMany(mappedBy = "proyecto", fetch = FetchType.EAGER)
    private List<Empleado> empleados;
}

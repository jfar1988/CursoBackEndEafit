package org.example.models.empleado;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "departamentos")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NonNull
    private String nombre;

    @NonNull
    private String descripcion;

    @NonNull
    private String ciudad;

    @OneToMany(mappedBy = "departamento", fetch = FetchType.EAGER)
    private List<Empleado> empleados;

}

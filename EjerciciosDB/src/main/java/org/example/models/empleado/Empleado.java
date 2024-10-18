package org.example.models.empleado;

import jakarta.persistence.*;
import lombok.*;
import lombok.Builder;


import java.math.BigDecimal;
import java.util.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NonNull
    @Column(nullable = false)
    private String nombre;

    @NonNull
    @Column(nullable = false)
    private BigDecimal salario;

    @NonNull
    @Column(nullable = false)
    private String cuentaBancaria;

    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;

    @ManyToOne
    @JoinColumn(name = "proyecto_id")
    private Proyecto proyecto;

}

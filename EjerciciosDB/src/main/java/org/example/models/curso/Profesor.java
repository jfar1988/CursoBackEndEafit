package org.example.models.curso;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="profesores")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name="apellido", nullable = false)
    private String apellido;

    @Column(name = "especialidad", nullable = false)
    private String especialidad;

    @OneToMany(mappedBy = "profesor")
    private List<Curso> cursos;



}

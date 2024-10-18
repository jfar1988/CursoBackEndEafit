package org.example.models.curso;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "programa", nullable = false)
    private String programa;

    @ManyToMany(mappedBy = "estudiantes")
    private List<Curso> cursos;

}

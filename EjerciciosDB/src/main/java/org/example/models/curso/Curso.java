package org.example.models.curso;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDateTime fechaInicio;

    @ManyToOne
    private Profesor profesor;

    @OneToMany(mappedBy = "curso")
    private List<Nota> notas = new ArrayList<>();

    public void setNotas(List<Nota> notas) {
        if (notas.size() < 1 || notas.size() > 7) {
            throw new IllegalArgumentException("Un curso debe tener entre 1 y 7 notas.");
        }
        this.notas = notas;
    }

    @ManyToMany
    private List<Estudiante> estudiantes;



}

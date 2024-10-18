package org.example.models.curso;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="notas")
public class Nota {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;

    @Column(name="valor", nullable = false)
    private double valor;

    @Column(name="descripcion", nullable = false)
    private String descripcion;

    private LocalDateTime fecha;

    @ManyToOne
    private Curso curso;

    @ManyToOne
    private Estudiante estudiante;
}

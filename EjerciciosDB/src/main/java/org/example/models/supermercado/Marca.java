package org.example.models.supermercado;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "marcas")
public class Marca {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    private double precio;

    private String descripcion;

    @OneToMany(mappedBy = "marca")
    private List<Producto> productos;


}

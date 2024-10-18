package org.example.models.supermercado;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clientes") //nombre de la tabla en la base de datos
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nombre;
    private String correo;
    private String telefono;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Venta> ventas;
}
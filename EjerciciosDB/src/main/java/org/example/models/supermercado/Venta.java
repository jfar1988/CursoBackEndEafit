package org.example.models.supermercado;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(nullable = false)
    private LocalDateTime fecha;

    private Double total;

    private String observacion;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;


    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "venta_producto",
            joinColumns = @JoinColumn(name = "venta_id"),
            inverseJoinColumns = @JoinColumn(name = "producto_id"))
    private List<Producto> productos;
}

package com.electroapp.electroapp.domain.enties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "terceros")
public class Tercero {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(name = "apellido",length = 50, nullable = false)
    private String apellido;

    @Column(name = "telefono", length = 50, nullable = false)
    private String telefono;

    @Column(name = "direccion", length = 50, nullable = false)
    private String direccion;

    @Column(name = "email", length = 50, nullable = false)
    private String email;

    @Column(name = "plazo_dias_pago", length = 50, nullable = false)
    private String plazodiaspago;
}

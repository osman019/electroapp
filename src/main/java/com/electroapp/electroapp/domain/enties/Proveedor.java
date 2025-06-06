package com.electroapp.electroapp.domain.enties;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "proveedores")
public class Proveedor {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "diasplazo",length = 30, nullable = false)
    private String dias;

    @Column(name = "porcentajeprontopago", length = 30, nullable = false)
    private int porcentaje;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    @JsonBackReference
    Persona personaId;
}

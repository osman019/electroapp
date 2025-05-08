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
@Table(name = "employees")
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="fechacontratacion",length = 30, nullable = false)
    private int fecha;

    @Column(name="salariobase",length = 30, nullable = false)
    private int salario;

    @Column(name="fechanac",length = 30, nullable = false)
    private int fechanac;

    @ManyToOne
    @JoinColumn(name = "eps_Id")
    @JsonBackReference
    Eps epsId;

    @ManyToOne
    @JoinColumn(name = "arl_id")
    @JsonBackReference
    Arl arlId;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    @JsonBackReference
    Persona personaId;
}

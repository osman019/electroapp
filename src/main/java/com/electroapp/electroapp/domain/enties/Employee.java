package com.electroapp.electroapp.domain.enties;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
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

    @Column(length = 50, nullable = true)
    private String name;

    @Column(name = "fecha_contratacion")
    private LocalDateTime createdAt;

    @Column(name = "salariobase",length = 50, nullable = false)
    private String employeename;
    
    @Embedded
    Audit audit = new Audit();

    @ManyToOne
    @JoinColumn(name = "eps_Id")
    @JsonBackReference
    Eps epsId;
}

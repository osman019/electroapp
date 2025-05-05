package com.electroapp.electroapp.domain.enties;

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




@Getter
@Setter
@Table(name = "cities")
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Embedded
    Audit audit = new Audit();

    @Column(length = 80, nullable = false)
    private String name;

    @ManyToOne 
    @JoinColumn(name = "region_id")
    @JsonBackReference
    Region regionId;
}

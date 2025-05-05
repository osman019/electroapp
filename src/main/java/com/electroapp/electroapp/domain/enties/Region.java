package com.electroapp.electroapp.domain.enties;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Table(name = "regions")
@Entity
@EqualsAndHashCode(exclude =  {"cities"})
@ToString(exclude =  {"cities"})
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

     @Column(length = 80, nullable = false)
    private String name;
    @Embedded
    Audit audit = new Audit();


    @ManyToOne
    @JoinColumn(name = "country")
    @JsonBackReference
    Country countryId;

    @OneToMany(mappedBy =   "region", fetch =   FetchType.LAZY, cascade =  CascadeType.ALL)
    @JsonBackReference
    private Set<City> cities = new HashSet<>();
}


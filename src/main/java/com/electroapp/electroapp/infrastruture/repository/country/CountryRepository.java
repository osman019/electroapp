package com.electroapp.electroapp.infrastruture.repository.country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.electroapp.electroapp.domain.enties.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}

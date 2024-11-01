package com.example.backend.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.data.entity.CountryEntity;

public interface ICountryJPARepository extends JpaRepository<CountryEntity, Long> {

}

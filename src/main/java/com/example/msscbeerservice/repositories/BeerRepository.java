package com.example.msscbeerservice.repositories;

import com.example.msscbeerservice.domain.Beer;
import com.example.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface BeerRepository extends JpaRepository<Beer, UUID> {
    Page<Beer> findAllByBeerNameAndBeerStyle(String beerName, BeerStyleEnum beerStyle, Pageable pagable);

    Page<Beer> findAllByBeerName(String beerName, Pageable pagable);

    Page<Beer> findAllByBeerStyle(BeerStyleEnum beerStyle, Pageable pagable);


    Beer findByUpc(String beerUpc);
}

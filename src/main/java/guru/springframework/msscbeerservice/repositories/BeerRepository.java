package guru.springframework.msscbeerservice.repositories;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.sfg.brewery.model.BeerStyleEnum;
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

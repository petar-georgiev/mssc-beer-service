package com.example.msscbeerservice.web.mappers;

import com.example.msscbeerservice.domain.Beer;
import com.example.msscbeerservice.web.model.BeerDto;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
@DecoratedWith(BeerMapperDecorator.class)
public interface BeerMapper {
    BeerDto beerToBeerDto (Beer beer);
    BeerDto beerToBeerDtoWithInventory (Beer beer);
    Beer beetDtoToBeer (BeerDto dto);
}

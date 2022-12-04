package com.example.msscbeerservice.events;

import com.example.msscbeerservice.web.model.BeerDto;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BeerEvent implements Serializable {
    static final long serialVersionUID = 4140743008218702270L;
    private BeerDto beerDto;

}

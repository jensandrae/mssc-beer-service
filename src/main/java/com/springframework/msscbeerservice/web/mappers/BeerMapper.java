package com.springframework.msscbeerservice.web.mappers;

import com.springframework.msscbeerservice.domain.Beer;
import com.springframework.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by Jens Andrae on 2020-10-27
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDTO(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}

package edu.pub.pubmenu.mappers;

import edu.pub.pubmenu.entities.Beer;
import edu.pub.pubmenu.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);
}

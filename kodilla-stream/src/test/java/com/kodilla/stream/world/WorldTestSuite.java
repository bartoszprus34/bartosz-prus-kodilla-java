package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country countriesOfAsia1 = new Country("China", BigDecimal.valueOf(1398000000 ));
        Country countryOfAmerica1 = new Country("USA", BigDecimal.valueOf(328200000));
        Country countryOfAmerica2 = new Country("Brazylia", BigDecimal.valueOf(211000000));
        Country countriesOfEurope1 = new Country("Szwecja", BigDecimal.valueOf(10230000 ));
        Country countriesOfEurope2 = new Country("Serbia", BigDecimal.valueOf(6945000));

        final List<Country> countriesOfAsia = new ArrayList<>();
        countriesOfAsia.add(countriesOfAsia1);

        final List<Country> countriesOfAmerica = new ArrayList<>();

        countriesOfAmerica.add(countryOfAmerica1);
        countriesOfAmerica.add(countryOfAmerica2);

        final List<Country> countriesOfEurope = new ArrayList<>();
        countriesOfEurope.add(countriesOfEurope1);
        countriesOfEurope.add(countriesOfEurope2);

        Continent continent1 = new Continent("Asia", countriesOfAsia);
        Continent continent2 = new Continent("North America", countriesOfAmerica);
        Continent continent3 = new Continent("Europe", countriesOfEurope);

        final List<Continent> continents = new ArrayList<>();
        continents.add(continent1);
        continents.add(continent2);
        continents.add(continent3);

        World world = new World(continents);

        //When
        BigDecimal result = world.getPeopleQuantity();
        BigDecimal expected = BigDecimal.valueOf(1954375000L);

        //Then
        assertEquals(result, expected);

    }
}
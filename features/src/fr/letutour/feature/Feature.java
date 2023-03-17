package fr.letutour.feature;

import fr.letutour.feature.matching.CelestialMatching;
import fr.letutour.feature.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Feature {

    private static CelestialMatching matching = new CelestialMatching();

    public static void main(String[] args) {

        Star sun = new Star("Sun");

        Planet mercury = new Planet("Mercury", new ArrayList<>());
        Planet venus = new Planet("Venus", new ArrayList<>());

        NaturalSatellite moon = new NaturalSatellite("Moon");
        Planet earth = new Planet("Earth", List.of(moon));

        NaturalSatellite phobos = new NaturalSatellite("Phobos");
        NaturalSatellite deimos = new NaturalSatellite("Deimos");
        Planet mars = new Planet("Mars", List.of(phobos, deimos));

        HumanMadeSatellite hubble = new HumanMadeSatellite("Hubble");

        List<Celestial> solarSystem = List.of(sun, mercury, venus, earth, mars, hubble);

        for (Celestial c : solarSystem) {
            matching.matching(c);
        }
        System.out.println("=================");

        String textBloc = """
                {
                    "name":"Solar system",
                    "numberOfPlanet":"8"
                }
                """;

        System.out.println(textBloc);

    }
}

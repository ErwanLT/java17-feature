package fr.letutour.feature;

import fr.letutour.feature.matching.CelestialMatching;
import fr.letutour.feature.models.Celestial;
import fr.letutour.feature.models.NaturalSatellite;
import fr.letutour.feature.models.Planet;
import fr.letutour.feature.models.Star;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Feature {

    private static CelestialMatching matching = new CelestialMatching();

    public static void main(String[] args) {

        List<Celestial> solarSystem = new ArrayList<>();

        Star sun = new Star("Sun");


        NaturalSatellite moon = new NaturalSatellite("Moon");
        Planet earth = new Planet("Earth", Arrays.asList(moon));

        solarSystem.add(sun);
        solarSystem.add(earth);

        for (Celestial c : solarSystem) {
            matching.matching(c);
        }

    }
}

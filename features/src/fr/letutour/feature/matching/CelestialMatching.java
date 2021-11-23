package fr.letutour.feature.matching;

import fr.letutour.feature.models.Celestial;
import fr.letutour.feature.models.NaturalSatellite;
import fr.letutour.feature.models.Planet;
import fr.letutour.feature.models.Star;

public class CelestialMatching {

    public void matching(Celestial celestial){

        switch (celestial) {
            case NaturalSatellite ns -> System.out.println(ns.toString());
            case Star s -> System.out.println(s.toString());
            case Planet p -> System.out.println(p.toString());
            default -> throw new IllegalStateException("Unexpected value: " + celestial);
        }
    }
}

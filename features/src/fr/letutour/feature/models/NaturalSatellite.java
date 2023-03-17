package fr.letutour.feature.models;

import java.util.Objects;

public record NaturalSatellite(String name, int size) implements Celestial{

    public NaturalSatellite(String name){
        this(name, 0);
    }
    public NaturalSatellite{
        Objects.requireNonNull(name);
    }
}

package fr.letutour.feature.models;

import java.util.Objects;

public record HumanMadeSatellite(String name) implements Celestial{

    public HumanMadeSatellite{
        Objects.requireNonNull(name);
    }
}

package fr.letutour.feature.models;

import java.util.Objects;

public final record NaturalSatellite(String name) implements Celestial{
    public NaturalSatellite{
        Objects.requireNonNull(name);
    }
}

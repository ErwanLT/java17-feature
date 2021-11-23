package fr.letutour.feature.models;

import java.util.List;

public final class Planet implements Celestial {

    String name;

    List<NaturalSatellite> celestialRegistry;

    public Planet(String name, List<NaturalSatellite> celestialRegistry) {
        this.name = name;
        this.celestialRegistry = celestialRegistry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NaturalSatellite> getCelestialRegistry() {
        return celestialRegistry;
    }

    public void setCelestialRegistry(List<NaturalSatellite> celestialRegistry) {
        this.celestialRegistry = celestialRegistry;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", celestialRegistry=" + celestialRegistry +
                '}';
    }
}

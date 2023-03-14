package fr.letutour.feature.models;

public sealed interface Celestial permits HumanMadeSatellite, NaturalSatellite, Planet, Star {
}

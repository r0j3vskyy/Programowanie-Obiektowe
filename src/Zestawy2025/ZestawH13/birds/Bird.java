package Zestawy2025.ZestawH13.birds;

import java.util.Objects;

public class Bird implements Comparable<Bird> {
    private String species;
    private String habitat;
    private int wingspan;

    public Bird(String species, String habitat, int wingspan){
        this.species = species;
        this.habitat = habitat;
        this.wingspan = wingspan;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bird bird = (Bird) obj;
        return Objects.equals(species, bird.species);
    }
    @Override
    public int hashCode(){
        return Objects.hash(species);
    }
    @Override
    public int compareTo(Bird other){
        return this.species.compareTo(other.species);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " +species+ ", " +habitat+ ", " +wingspan+ ".";
    }
}

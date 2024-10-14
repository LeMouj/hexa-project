package org.iut.mastermind.domain.partie;

import java.util.Objects;

public class Joueur {
    private final String nom;

    // constructeur
    public Joueur(String nom) {
        this.nom = nom;
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Joueur joueur = (Joueur) o;
        return Objects.equals(nom, joueur.nom);
    }

    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }
}
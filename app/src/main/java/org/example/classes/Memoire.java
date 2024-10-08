package org.example.classes;
import java.util.List;

public class Memoire implements Document {
    private String titre;
    private List<Chapitre> chapitres;

    public Memoire(String titre, List<Chapitre> chapitres) {
        this.titre = titre;
        this.chapitres = chapitres;
    }

    @Override
    public String titre() {
        return titre;
    }

    @Override
    public int taille() {
        int t= 0;
        for (Chapitre ci : chapitres) {
            int ti=ci.taille();
            t+=ti;
           
        }
        return t;
    }
}

/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;
import org.example.classes.Chapitre;
import org.example.classes.Memoire;
import java.util.Arrays;
import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello, World!";}
    public static void main(String[] args) {
        Chapitre chapitre1 = new Chapitre("Chapitre 1", Arrays.asList("Page 1", "Page 2"));
        Chapitre chapitre2 = new Chapitre("Chapitre 2", Arrays.asList("Page 1", "Page 2", "Page 3"));
        List<Chapitre> chapitres = Arrays.asList(chapitre1, chapitre2);

        Memoire memoire = new Memoire("Memoire apprentissage", chapitres);

        System.out.println("Titre : " + memoire.titre());
        System.out.println("Taille totale : " + memoire.taille());
    }
}
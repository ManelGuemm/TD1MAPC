package org.example.model;
import org.example.classes.Chapitre;
import org.example.classes.Memoire;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MemoireTest {

    @Test
    public void testTailleMemoire() {
        // Création des chapitres selon le diagramme d'objet
        Chapitre c1 = new Chapitre("Introduction", Arrays.asList("...", "..."));
        Chapitre c2 = new Chapitre("Patrons", Arrays.asList("...", "...", "..."));
        Chapitre c3 = new Chapitre("Anti-Patrons", Arrays.asList("...", "..."));
        Chapitre c4 = new Chapitre("Conclusion", Arrays.asList("..."));

        // Création de la liste de chapitres et de la mémoire
        List<Chapitre> chapitres = Arrays.asList(c1, c2, c3, c4);
        Memoire memoireAlice = new Memoire("Patrons et Anti-Patrons", chapitres);

        // Test de la taille du mémoire (valeur correcte)
        assertEquals(8, memoireAlice.taille(), "La taille devrait être 8");
    }
}

package projet.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CouleursTest {
    //On test si chaque couleur renvoie bien la valeur entière correspondante.

	@Test
    public void testViolet() {
        assertEquals(-12320428, Couleurs.VIOLET);
    }

    @Test
    public void testJaune() {
        assertEquals(-137436, Couleurs.JAUNE);
    }

    @Test
    public void testVert() {
        assertEquals(-14506108, Couleurs.VERT);
    }

}

package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class scenario {

	public static void main(String[] args) {
        Druide panoramix = new Druide("panoramix",5, 10);
        Gaulois asterix = new Gaulois("Astérix", 5);
        Gaulois obelix = new Gaulois("Obélix", 10);
        Romain minus = new Romain("Minus", 6);

        panoramix.parler();;
        panoramix.preparerPotion();

        obelix.boirePotion(6); // Obélix tente de boire la potion
        asterix.boirePotion(6); // Astérix boit la potion

        asterix.parler();
        minus.parler("UN GAU... UN GAUGAU...");

        for (int i = 0; i < 3; i++) { // Astérix frappe Minus trois fois
            asterix.frapper(minus);
        }
    }

}

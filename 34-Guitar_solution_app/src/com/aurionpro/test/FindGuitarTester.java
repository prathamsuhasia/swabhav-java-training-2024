package com.aurionpro.test;

import java.util.List;
import com.aurionpro.model.Builder;
import com.aurionpro.model.Guitar;
import com.aurionpro.model.GuitarSpecification;
import com.aurionpro.model.Type;
import com.aurionpro.model.Wood;

public class FindGuitarTester {

    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        // Create the guitar specification to search for
        GuitarSpecification whatErinLikes = new GuitarSpecification(
            Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6
        );

        // Perform the search
        List<Guitar> guitars = inventory.search(whatErinLikes);

        // Output the results
        if (!guitars.isEmpty()) {
            for (Guitar guitar : guitars) {
                GuitarSpecification spec = guitar.getGuitarSpecification();
                System.out.println("Erin, you might like this " +
                                   spec.getBuilder() + " " + spec.getModel() + " " +
                                   spec.getType() + " guitar:\n   " +
                                   spec.getBackWood() + " back and sides,\n   " +
                                   spec.getTopWood() + " top.\nYou can have it for only $" +
                                   guitar.getPrice() + "!");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        // Add guitars to the inventory...
        inventory.addGuitar("11277", 3999.95, Builder.COLLINGS, "CJ", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.SITKA, 6);
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);
        inventory.addGuitar("U34567", 1299.95, Builder.GIBSON, "Les Paul", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE, 6);
        inventory.addGuitar("G54321", 2199.95, Builder.MARTIN, "D-28", Type.ACOUSTIC, Wood.MAPLE, Wood.CEDAR, 6);
        inventory.addGuitar("H67890", 3499.95, Builder.COLLINGS, "OM2H", Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.SITKA, 6);
        inventory.addGuitar("J98765", 899.95, Builder.FENDER, "Telecaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);
    }
}

package com.aurionpro.test;


import com.aurionpro.model.Guitar;

public class FindGuitarTester {

    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("", "Alder", "fender", "Stratocastor",
                                          "electric", "Alder", 0);

        Guitar guitar = inventory.search(whatErinLikes);
        if (guitar != null) {
            System.out.println("Erin, you might like this " +
                               guitar.getBuilder() + " " + guitar.getModel() + " " +
                               guitar.getType() + " guitar:\n   " +
                               guitar.getBackWood() + " back and sides,\n   " +
                               guitar.getTopWood() + " top.\nYou can have it for only $" +
                               guitar.getPrice() + "!");
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        // Add guitars to the inventory...
        inventory.addGuitar("11277", 3999.95, "Collings", "CJ", "acoustic", "Indian Rosewood", "Sitka");
        inventory.addGuitar("V95693", 1499.95, "Fender", "Stratocastor", "electric", "Alder", "Alder");
        // Add more guitars as needed
    }
}

package com.aurionpro.test;

import java.util.LinkedList;
import java.util.List;
import com.aurionpro.model.Guitar;
import com.aurionpro.model.GuitarSpecification;
import com.aurionpro.model.Builder;
import com.aurionpro.model.Type;
import com.aurionpro.model.Wood;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood, int numberOfStrings) {
        GuitarSpecification spec = new GuitarSpecification(builder, model, type, backWood, topWood, numberOfStrings);
        Guitar guitar = new Guitar(serialNumber, price, spec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpecification searchSpec) {
        List<Guitar> matchingGuitars = new LinkedList<>();

        for (Guitar guitar : guitars) {
            GuitarSpecification spec = guitar.getGuitarSpecification();
            if (spec.matches(searchSpec)) {
                matchingGuitars.add(guitar);
            }
        }

        return matchingGuitars;
    }
}

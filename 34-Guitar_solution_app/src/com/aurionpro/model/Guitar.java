package com.aurionpro.model;

public class Guitar {
    private String serialNumber;
    private double price;
    private GuitarSpecification guitarSpecification;

    public Guitar(String serialNumber, double price, GuitarSpecification guitarSpecification) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpecification = guitarSpecification;
    }

    public GuitarSpecification getGuitarSpecification() {
        return guitarSpecification;
    }

    public void setGuitarSpecification(GuitarSpecification guitarSpecification) {
        this.guitarSpecification = guitarSpecification;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

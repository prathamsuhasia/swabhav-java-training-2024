package com.aurionpro.creational.builder.model;

public class PhoneBuilder {
    private String operatingSystem;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;
    
    public PhoneBuilder setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }
    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }
    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }
    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }
    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }
    
    public Phone getPhone() {
        return new Phone(operatingSystem, ram, processor, screenSize, battery);
    }
}

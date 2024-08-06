package com.aurionpro.model;

public class GuitarSpecification {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numberOfStrings;

    public GuitarSpecification(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numberOfStrings) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }

    public boolean matches(GuitarSpecification searchSpec) {
        if (searchSpec.getBuilder() != null && searchSpec.getBuilder() != Builder.ANY && !searchSpec.getBuilder().equals(this.builder)) {
            return false;
        }
        if (searchSpec.getModel() != null && !searchSpec.getModel().equals("") && !searchSpec.getModel().equals(this.model)) {
            return false;
        }
        if (searchSpec.getType() != null && searchSpec.getType() != Type.ANY && !searchSpec.getType().equals(this.type)) {
            return false;
        }
        if (searchSpec.getBackWood() != null && searchSpec.getBackWood() != Wood.ANY && !searchSpec.getBackWood().equals(this.backWood)) {
            return false;
        }
        if (searchSpec.getTopWood() != null && searchSpec.getTopWood() != Wood.ANY && !searchSpec.getTopWood().equals(this.topWood)) {
            return false;
        }
        return true;
    }
}

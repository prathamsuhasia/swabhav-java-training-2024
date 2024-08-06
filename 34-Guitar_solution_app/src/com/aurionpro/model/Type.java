package com.aurionpro.model;

public enum Type {
    ACOUSTIC, ELECTRIC, ANY;

    public String toString() {
        switch(this) {
            case ACOUSTIC: return "acoustic";
            case ELECTRIC: return "electric";
            case ANY: return "Any";
            default: return "";
        }
    }
}

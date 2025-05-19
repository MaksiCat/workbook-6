package com.pluralsight.finance;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(String name, double weight) {
        super(name, weight * 75);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return weight * 75;
    }
}

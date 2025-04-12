package com.basics.java.math;

public class CalculatorImpl implements Calculator{


    @Override
    public int sum(int v1, int v2) {
        return v1 + v2;

    }

    @Override
    public double sum(double v1, double v2) {
        return v1 + v2;
    }
}

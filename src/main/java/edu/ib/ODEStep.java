package edu.ib;

public interface ODEStep
{
    // Interface to specify the method and have the next value depending on the formula in the method.
    public double step(double t, double x, double h, ODEEquation function);
}

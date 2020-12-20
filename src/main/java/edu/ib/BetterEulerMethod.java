package edu.ib;

public class BetterEulerMethod implements ODEStep
{
    @Override
    public double step(double t, double x, double h, ODEEquation function) {
        return x + (function.function(t,x)*h)/2;
    }
}

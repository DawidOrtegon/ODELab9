package edu.ib;

public class HeunMethod implements ODEStep
{
    @Override
    public double step(double t, double x, double h, ODEEquation function)
    {
        double xTemp = x + function.function(t,x)*h;
        return x + 0.5*h*(function.function(t,x) + function.function(t+h,xTemp));
    }
}

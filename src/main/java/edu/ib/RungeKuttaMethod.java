package edu.ib;

public class RungeKuttaMethod implements ODEStep
{
    @Override
    public double step(double t, double x, double h, ODEEquation function)
    {
        double k1 = function.function(t,x);
        double k2 = function.function(t+(h/2),(x+((h*k1)/2)));
        double k3 = function.function(t+(h/2), (x+((h*k2)/2)));
        double k4 = function.function(t+h, x+(h*k3));
        return x +(0.16)*(k1+2*k2+2*k3+k4)*h;
    }
}

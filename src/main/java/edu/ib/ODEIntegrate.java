package edu.ib;

import java.util.ArrayList;

public class ODEIntegrate
{
    double a;
    double b;
    double x0;
    ODEEquation function;
    StepHandler stepHandler;

    // Receives like an argument the begin (a), the end (b), the value for the first xTrue (x0), and the function.
    public ODEIntegrate(double a, double b, double x0, ODEEquation function, StepHandler stepHandler) {
        this.a = a;
        this.b = b;
        this.x0 = x0;
        this.function = function;
        this.stepHandler = stepHandler;
    }

    public void integrate(ODEStep method, double h)
    {
        double globalError = 0;
        double localError = 0;
        double t = a;
        double x = x0;
        while(t <= b)
         {
             // System.out.println("Time: " + t + " X: " + x);
             stepHandler.update(t,x,globalError,localError);
             // Only for the next value.
             globalError = (x - function.function(t,x))/function.function(t,x); // Wrong since we need the true function and we do not have it.
             x = method.step(t,x,h,function);
             // For the errors.
             t += h;
        }

    }
}

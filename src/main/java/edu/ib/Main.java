package edu.ib;

public class Main
{
    public static void main(String[] args)
    {
        // Always with the notation that the function depends of t, x.
        ODEEquation function = (t,x) -> -2*Math.pow(t,3)+12*Math.pow(t,2)-20*t+8.5;
        EulerMethod eulerMethod = new EulerMethod();
        ConsoleHandler consoleHandler = new ConsoleHandler();
        // Accept the class that implements the interface as argument for the constructor.
        System.out.println("EULER METHOD");
        ODEIntegrate odeIntegrate = new ODEIntegrate(0,4,1, function, consoleHandler);
        odeIntegrate.integrate(eulerMethod,0.5);
        consoleHandler.print();
        System.out.println("\n\n");

        System.out.println("EULER METHOD IMPROVED");
        // It is necessary to create another console handler, otherwise the results will be joined.
        ConsoleHandler consoleHandler2 = new ConsoleHandler();
        BetterEulerMethod betterEulerMethod = new BetterEulerMethod();
        ODEIntegrate odeIntegrate2 = new ODEIntegrate(0,4,1, function, consoleHandler2);
        odeIntegrate2.integrate(betterEulerMethod,0.5);
        consoleHandler2.print();
    }
}

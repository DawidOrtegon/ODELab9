package edu.ib;

public class Main
{
    public static void main(String[] args)
    {
        // Always with the notation that the function depends of t, x.
        ODEEquation truefunction1 = (t,x) -> Math.exp(-0.5*t)*(-1.07692+(3.07692*Math.exp(1.3*t)));
        ODEEquation function = (t,x) -> 4*Math.exp(0.8*t)-0.5*x;
        EulerMethod eulerMethod = new EulerMethod();
        ConsoleHandler consoleHandler = new ConsoleHandler(0,4,0.1);
        // Accept the class that implements the interface as argument for the constructor.
        System.out.println("EULER METHOD");
        ODEIntegrate odeIntegrate = new ODEIntegrate(0,4,2, function, consoleHandler);
        odeIntegrate.integrate(eulerMethod,0.1, truefunction1);
        consoleHandler.print();
        System.out.println("\n\n");

        System.out.println("EULER METHOD IMPROVED");
        // It is necessary to create another console handler, otherwise the results will be joined.
        BetterEulerMethod betterEulerMethod = new BetterEulerMethod();
        ConsoleHandler consoleHandler2 = new ConsoleHandler(0,4,0.1);
        ODEIntegrate odeIntegrate2 = new ODEIntegrate(0,4,2, function, consoleHandler2);
        odeIntegrate2.integrate(betterEulerMethod,0.1, truefunction1);
        consoleHandler2.print();
        System.out.println("\n\n");

        System.out.println("RUNGE KUTTA METHOD");
        RungeKuttaMethod rungeKuttaMethod = new RungeKuttaMethod();
        ConsoleHandler consoleHandler3 = new ConsoleHandler(0,4,0.1);
        ODEIntegrate rungeKutta = new ODEIntegrate(0,4.,2,function,consoleHandler3);
        rungeKutta.integrate(rungeKuttaMethod,0.1, truefunction1);
        consoleHandler3.print();
        System.out.println("\n\n");

        System.out.println("HEUN METHOD");
        HeunMethod heunMethod = new HeunMethod();
        ConsoleHandler consoleHandler4 = new ConsoleHandler(0,4.02,0.1);
        ODEIntegrate heunMethodInt = new ODEIntegrate(0, 4.02, 2,function,consoleHandler4);
        heunMethodInt.integrate(heunMethod,0.1, truefunction1);
        consoleHandler4.print();
        System.out.println("\n\n");

    }
}

package edu.ib;

import java.util.ArrayList;

public class ConsoleHandler implements StepHandler
{
    // Creation.
    private ArrayList<Double> time;
    private ArrayList<Double> X;
    private ArrayList <Double> lError;
    private ArrayList <Double> gError;

    // Without arguments since we do  not need to specify the values at the first time.
    // Initialization.
    public ConsoleHandler()
    {
        time = new ArrayList();
        X = new ArrayList();
        lError = new ArrayList();
        gError = new ArrayList();
    }

    // Adding.
    @Override
    public void update(double t, double x, double globalError, double localError)
    {
        time.add(t);
        X.add(x);
        gError.add(globalError);
        lError.add(localError);
    }

    public void print()
    {
        System.out.printf("%15s %15s %15s %15s%n","Time","X Euler","Global Error", "Local Error");
        for (int i = 0; i < time.size(); i ++)
        {
            // System.out.println(time.get(i) + "  " + X.get(i) + "  " + gError.get(i) + "  " + lError.get(i));
            System.out.printf("%15g %15g %15g %15g%n",time.get(i), X.get(i), gError.get(i), lError.get(i));
        }
    }
}

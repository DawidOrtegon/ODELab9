package edu.ib;

import java.util.ArrayList;
// Makes the table for the values.
public class ConsoleHandler implements StepHandler
{
    // Creation.
    private ArrayList<Double> time;
    private ArrayList<Double> X;
    private ArrayList <Double> lError;
    private ArrayList <Double> gError;
    double begin;
    double end;
    double h;

    // Without arguments since we do  not need to specify the values at the first time.
    // Initialization.
    public ConsoleHandler(double begin, double end, double h)
    {
        time = new ArrayList();
        X = new ArrayList();
        lError = new ArrayList();
        gError = new ArrayList();
        this.begin = begin;
        this.end = end;
        this.h = h;
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
        double numElements = ((end - begin)/h);
//      System.out.printf("%15s %15s %15s %15s%n","Time","X","Global Error", "Local Error");
        System.out.printf("%15s %15s %15s%n","Time","X","Global Error");
        for (int i = 0; i < numElements; i ++)
        {
            // System.out.printf("%15g %15g %15g %15g%n",time.get(i), X.get(i), gError.get(i), lError.get(i));
            System.out.printf("%15g %15g %15g%n",time.get(i), X.get(i), gError.get(i));
        }
    }
}

package edu.ib;

public interface StepHandler
{
    void update(double t, double x, double globalError, double localError);
}

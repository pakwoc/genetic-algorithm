package com.pakwochan.ga.iteration;

import com.pakwochan.ga.GeneticAlgorithmContext;

public interface IterationListener {

	public abstract void iterationStart(GeneticAlgorithmContext context);

	public abstract void iterationEnd(GeneticAlgorithmContext context);

}
package com.pakwochan.ga.iteration;

import com.pakwochan.ga.GeneticAlgorithmContext;

public interface EvolveListener{

	public void evolveStart(GeneticAlgorithmContext context);
	
	public void evolveEnd(GeneticAlgorithmContext context);
}

package com.pakwochan.ga.listener;

import com.pakwochan.ga.GeneticAlgorithmContext;

public interface EvolveListener<M>{

	public void evolveStart(GeneticAlgorithmContext<M> context);
	
	public void evolveEnd(GeneticAlgorithmContext<M> context);
}

package com.pakwochan.ga.listener;

import com.pakwochan.ga.GeneticAlgorithmContext;

public interface TerminationListener<M> {

	public boolean decide(GeneticAlgorithmContext<M> context);
	
}

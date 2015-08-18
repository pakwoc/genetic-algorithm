package com.pakwochan.ga.termination;

import com.pakwochan.ga.GeneticAlgorithmContext;

public interface TerminationDecider {

	public boolean decide(GeneticAlgorithmContext context);
	
}

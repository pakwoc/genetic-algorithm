package com.pakwochan.ga.iteration;

import com.pakwochan.ga.GeneticAlgorithmContext;

public class FixEliteSizeStrategy implements EvolveListener{

	public int eliteSize;
	
	public FixEliteSizeStrategy(int eliteSize) {
		this.eliteSize = eliteSize;
	}

	@Override
	public void evolveStart(GeneticAlgorithmContext context) {
		context.setEliteSize(eliteSize);
	}

	@Override
	public void evolveEnd(GeneticAlgorithmContext context) {
	}

}

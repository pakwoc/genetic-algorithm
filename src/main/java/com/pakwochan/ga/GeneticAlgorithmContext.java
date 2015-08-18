package com.pakwochan.ga;

public class GeneticAlgorithmContext {

	private int iteration = 0;
	
	private int eliteSize = 1;
	
	public int getEliteSize() {
		return eliteSize;
	}

	public void setEliteSize(int eliteSize) {
		this.eliteSize = eliteSize;
	}

	public int getIteration() {
		return iteration;
	}

	public void setIteration(int iteration) {
		this.iteration = iteration;
	}
	
}

package com.pakwochan.ga;

import java.util.List;

import com.pakwochan.ga.model.Population;

public class GeneticAlgorithmContext<M> {

	private int currentIteration = 1;
	
	private List<M> initialData;
	
	private Population<M> currentPopulation;
	
	public int getCurrentIteration() {
		return currentIteration;
	}

	public void setCurrentIteration(int currentIteration) {
		this.currentIteration = currentIteration;
	}

	public List<M> getInitialData() {
		return initialData;
	}

	public void setInitialData(List<M> initialData) {
		this.initialData = initialData;
	}

	public Population<M> getCurrentPopulation() {
		return currentPopulation;
	}

	public void setCurrentPopulation(Population<M> currentPopulation) {
		this.currentPopulation = currentPopulation;
	}
	
}

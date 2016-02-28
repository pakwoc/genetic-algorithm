package com.pakwochan.ga.model;

import java.util.List;

public class Population<M> {

	private Individual<M> bestIndividual;
	
	private List<Individual<M>> rankedIndividual;

	public Individual<M> getBestIndividual() {
		return bestIndividual;
	}

	public void setBestIndividual(Individual<M> bestIndividual) {
		this.bestIndividual = bestIndividual;
	}

	public List<Individual<M>> getRankedIndividual() {
		return rankedIndividual;
	}

	public void setRankedIndividual(List<Individual<M>> rankedIndividual) {
		this.rankedIndividual = rankedIndividual;
	}
	
}

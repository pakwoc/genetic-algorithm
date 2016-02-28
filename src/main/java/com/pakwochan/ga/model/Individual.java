package com.pakwochan.ga.model;

public class Individual<M> {
	
	private M model;
	
	private Integer fitness;

	public Integer getFitness() {
		return fitness;
	}

	public void setFitness(Integer fitness) {
		this.fitness = fitness;
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}
	
}

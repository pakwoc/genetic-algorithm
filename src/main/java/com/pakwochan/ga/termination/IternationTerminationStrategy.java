package com.pakwochan.ga.termination;

import com.pakwochan.ga.GeneticAlgorithmContext;

public class IternationTerminationStrategy implements TerminationDecider{

	private int targetIternation;

	public IternationTerminationStrategy(int targetIteration) {
		this.targetIternation = targetIteration;
	}
	
	@Override
	public boolean decide(GeneticAlgorithmContext context){
		if(context.getIteration() >= targetIternation){
			return true;
		}
		return false;
	}
	
	
	
}

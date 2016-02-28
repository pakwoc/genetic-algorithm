package com.pakwochan.ga.listener.impl;

import com.pakwochan.ga.GeneticAlgorithmContext;
import com.pakwochan.ga.listener.TerminationListener;

public class IternationTerminationListener<M> implements TerminationListener<M>{

	private int targetIternation;
	
	
	public IternationTerminationListener(int targetIteration) {
		this.targetIternation = targetIteration;
	}
	
	@Override
	public boolean decide(GeneticAlgorithmContext<M> context){
		if(context.getCurrentIteration() >= targetIternation){
			return true;
		}
		return false;
	}

}

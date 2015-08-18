package com.pakwochan.ga;

import com.pakwochan.ga.termination.IternationTerminationStrategy;
import com.pakwochan.ga.termination.TerminationDecider;

public class GeneticAlgorithmConfiguration {

	private GeneticAlgorithmContext context  = new GeneticAlgorithmContext();
	
	private TerminationDecider terminator = new IternationTerminationStrategy(1000);
	
	public GeneticAlgorithm build(){
		GeneticAlgorithm ga = new GeneticAlgorithm();
		return ga;
	}
	
	public TerminationDecider getTerminator() {
		return terminator;
	}

	public void setTerminator(TerminationDecider terminator) {
		this.terminator = terminator;
	}

	public GeneticAlgorithmConfiguration setEliteSize(int eliteSize){
		context.setEliteSize(eliteSize);
		return this;
	}
	
	public GeneticAlgorithmConfiguration setIteration(int iteration){
		context.setIteration(iteration);
		return this;
	}
	
}

package com.pakwochan.ga;

import com.pakwochan.ga.listener.TerminationListener;
import com.pakwochan.ga.listener.impl.FixEliteSizeListener;
import com.pakwochan.ga.listener.impl.IternationTerminationListener;
import com.pakwochan.ga.model.IndividualFactory;

public class GeneticAlgorithmConfiguration<M> {

	public static final int DEFAULT_ITERATION = 1000;
	
	public static final int DEFAULT_ELITE_SIZE = 1;
	
	private GeneticAlgorithmContext<M> context  = new GeneticAlgorithmContext<>();
	
	private TerminationListener<M> terminator = new IternationTerminationListener<M>(DEFAULT_ITERATION);
	
	private FixEliteSizeListener<M> eliteSizeListener = new FixEliteSizeListener<>(DEFAULT_ELITE_SIZE);
	
	private IndividualFactory<M> individualFactory;
	
	public GeneticAlgorithmConfiguration(IndividualFactory<M> individualFactory){
		this.individualFactory = individualFactory;
	}
	
	public GeneticAlgorithm<M> build(){
		GeneticAlgorithm<M> ga = new GeneticAlgorithm<>();
		ga.setContext(context);
		return ga;
	}
	
	public TerminationListener<M> getTerminator() {
		return terminator;
	}

	public void setTerminator(TerminationListener<M> terminator) {
		this.terminator = terminator;
	}

	public GeneticAlgorithmConfiguration<M> setIteration(int iteration){
		getContext().setCurrentIteration(iteration);
		return this;
	}

	public GeneticAlgorithmContext<M> getContext() {
		return context;
	}

	public FixEliteSizeListener<M> getEliteSizeListener() {
		return eliteSizeListener;
	}

	public void setEliteSizeListener(FixEliteSizeListener<M> eliteSizeListener) {
		this.eliteSizeListener = eliteSizeListener;
	}

}

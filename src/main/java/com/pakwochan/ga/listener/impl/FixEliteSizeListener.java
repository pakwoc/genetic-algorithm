package com.pakwochan.ga.listener.impl;

import com.pakwochan.ga.GeneticAlgorithmContext;
import com.pakwochan.ga.listener.EvolveListener;

public class FixEliteSizeListener<M> implements EvolveListener<M>{

	public int eliteSize;
	
	public FixEliteSizeListener(int eliteSize) {
		this.eliteSize = eliteSize;
	}

	@Override
	public void evolveStart(GeneticAlgorithmContext<M> context) {
		//TODO
	}

	@Override
	public void evolveEnd(GeneticAlgorithmContext<M> context) {
		//TODO
	}

}

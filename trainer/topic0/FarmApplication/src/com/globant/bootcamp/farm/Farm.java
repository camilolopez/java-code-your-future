package com.globant.bootcamp.farm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.globant.bootcamp.animals.Chicken;
import com.globant.bootcamp.animals.Egg;

public class Farm {
	private HenHouse henHouse;
	private Farmer farmer;
	private static final Integer TIMES_COLLECT_EGGS_BY_DAY = 2;

	public Farm(Chicken[] chickens, Farmer farmer) {
		super();
		this.henHouse = new HenHouse(chickens);
		this.farmer = farmer;
	}

	public List<EggCarton> collectAndClassifyEggs() {
		List<Egg> eggsByDay = new ArrayList<>();

		for (int i = 0; i < TIMES_COLLECT_EGGS_BY_DAY; i++) {
			eggsByDay.addAll(this.henHouse.getEggs());
		}

		List<EggCarton> classifyEggs = this.farmer.classifyEggs(eggsByDay);

		Collections.sort(classifyEggs);

		return classifyEggs;
	}

}

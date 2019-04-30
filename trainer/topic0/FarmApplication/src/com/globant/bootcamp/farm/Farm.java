package com.globant.bootcamp.farm;

import com.globant.bootcamp.animals.Chicken;
import com.globant.bootcamp.animals.Egg;

public class Farm {
	private HenHouse henHouse;
	private Farmer farmer;

	public Farm(Chicken[] chickens, Farmer farmer) {
		super();
		this.henHouse = new HenHouse(chickens);
		this.farmer = farmer;
	}

	public EggCarton[] collectAndClassifyEggs() {
		Egg[] eggsOne = this.henHouse.getEggs();
		Egg[] eggsTwo = this.henHouse.getEggs();
		
		EggCarton[] eggCartons = this.farmer.classifyEggs(eggsOne);

		return eggCartons;
	}

}

package com.globant.bootcamp.farm;

import com.globant.bootcamp.animals.Chicken;
import com.globant.bootcamp.animals.Egg;

public class HenHouse {
	private static final Integer MAX_SIZE = 40;

	private Chicken[] chickens = null;

	public HenHouse(Chicken[] chickens) {
		if (chickens.length > MAX_SIZE) {
			new IllegalArgumentException("El gallinero debe tener maximo " + MAX_SIZE + " Gallinas");
		}
		
		this.chickens = chickens;
	}

	public Egg[] getEggs() {
		Egg[] eggs = new Egg[this.chickens.length];

		int i = 0;
		for (Chicken chicken : this.chickens) {
			eggs[i++] = chicken.gaveBirth();
		}

		return eggs;
	}
}

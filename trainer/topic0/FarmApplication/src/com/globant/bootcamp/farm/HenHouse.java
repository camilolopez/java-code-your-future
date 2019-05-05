package com.globant.bootcamp.farm;

import java.util.ArrayList;
import java.util.List;

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

	public List<Egg> getEggs() {
		List<Egg> eggs = new ArrayList<Egg>();
		
		for (Chicken chicken : this.chickens) {
			eggs.add(chicken.gaveBirth());
		}

		return eggs;
	}
}

package com.globant.bootcamp.farm;

import java.util.ArrayList;
import java.util.List;

import com.globant.bootcamp.abstracts.Human;
import com.globant.bootcamp.animals.Egg;
import com.globant.bootcamp.enums.EggColor;

public class Farmer extends Human {

	@Override
	public void makeSound() {
		System.out.println("Cuántas copas tenés? Booo");
	}

	public List<EggCarton> classifyEggs(List<Egg> eggs) {
		List<EggCarton> eggsCartons = new ArrayList<>();

		EggCarton whiteEggsCarton = new EggCarton();
		EggCarton redEggsCarton = new EggCarton(EggColor.RED);

		eggsCartons.add(whiteEggsCarton);
		eggsCartons.add(redEggsCarton);

		for (Egg egg : eggs) {
			switch (egg.getEggColor()) {
			case WHITE:
				fillEggCarton(eggsCartons, whiteEggsCarton, egg);
				break;
			case RED:
				fillEggCarton(eggsCartons, redEggsCarton, egg);
				break;
			default:
				break;
			}
		}

		return eggsCartons;
	}

	public void fillEggCarton(List<EggCarton> eggsCartons, EggCarton eggCarton, Egg egg) {
		eggCarton.put(egg);

		if (eggCarton.isFull()) {
			eggsCartons.add(eggCarton);
			eggCarton = new EggCarton(egg.getEggColor());
		}
	}

}

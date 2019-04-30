package com.globant.bootcamp.farm;

import java.util.ArrayList;
import java.util.List;

import com.globant.bootcamp.abstracts.Human;
import com.globant.bootcamp.animals.Egg;

public class Farmer extends Human {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Cuantas copas tenes? Booo");
	}

	public EggCarton[] classifyEggs(Egg[] eggs) {
		List<EggCarton> whiteEggs = new ArrayList<>();
		List<EggCarton> redEggs = new ArrayList<>();

		EggCarton whiteEggsCarton = new EggCarton();
		EggCarton redEggsCarton = new EggCarton();

		for (Egg egg : eggs) {
			switch (egg.getEggColor()) {
			case WHITE:
				whiteEggsCarton = fillEggCarton(whiteEggs, whiteEggsCarton, egg);
				break;
			case RED:
				redEggsCarton = fillEggCarton(redEggs, redEggsCarton, egg);

			default:
				break;
			}
		}
		
		
		
		whiteEggs.addAll(redEggs);

		return whiteEggs.toArray(new EggCarton[whiteEggs.size()]);
	}

	public EggCarton fillEggCarton(List<EggCarton> whiteEggs, EggCarton whiteEggsCarton, Egg egg) {
		whiteEggsCarton.put(egg);

		if (whiteEggsCarton.isFull()) {
			whiteEggs.add(whiteEggsCarton);
			whiteEggsCarton = new EggCarton();
		}

		return whiteEggsCarton;
	}

}

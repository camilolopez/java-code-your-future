package com.globant.bootcamp.animals.chickens;

import com.globant.bootcamp.animals.Chicken;
import com.globant.bootcamp.animals.Egg;
import com.globant.bootcamp.enums.EggColor;

public class BrownChicken extends Chicken{

	@Override
	protected Egg eggType() {

		return new Egg(new BrownChicken(), EggColor.RED);
	}

}

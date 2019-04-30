package com.globant.bootcamp.animals.chickens;

import com.globant.bootcamp.animals.Chicken;
import com.globant.bootcamp.animals.Egg;

public class WhiteChicken extends Chicken{
	
	@Override
	protected Egg eggType() {
		// TODO Auto-generated method stub
		return new Egg(new WhiteChicken());
	}
	
}

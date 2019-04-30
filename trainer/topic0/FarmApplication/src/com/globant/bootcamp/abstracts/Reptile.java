package com.globant.bootcamp.abstracts;

import com.globant.bootcamp.animals.Egg;
import com.globant.bootcamp.enums.Gender;
import com.globant.bootcamp.interfaces.Oviparous;

public abstract class Reptile extends Animal<Egg> implements Oviparous	{

	public Reptile() {
		super();
	}
	
	public Reptile(Gender gender) {
        super(gender);
    }
}

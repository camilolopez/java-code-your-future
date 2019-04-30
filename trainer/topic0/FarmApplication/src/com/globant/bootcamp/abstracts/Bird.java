package com.globant.bootcamp.abstracts;

import com.globant.bootcamp.animals.Egg;
import com.globant.bootcamp.enums.Gender;
import com.globant.bootcamp.interfaces.Aerial;
import com.globant.bootcamp.interfaces.Oviparous;
import com.globant.bootcamp.interfaces.Terrestrial;

public abstract class Bird extends Animal<Egg> implements Aerial, Terrestrial, Oviparous {

	public Bird() {
		super();
	}
    
	public Bird(Gender gender) {
        super(gender);
    }
    
    @Override
    public void fly() {
        System.out.println("Mover alitas e ir al cielo");
    }

    @Override
    public void walk() {
        System.out.println("Mover patitas");
    }
}

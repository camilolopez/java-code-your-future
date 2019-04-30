package com.globant.bootcamp.abstracts;

import com.globant.bootcamp.enums.Gender;
import com.globant.bootcamp.interfaces.Aquatic;
import com.globant.bootcamp.interfaces.HumanBeing;
import com.globant.bootcamp.interfaces.Terrestrial;

public abstract class Human extends Animal<Human> implements HumanBeing<Human> , Terrestrial, Aquatic {

    public Human() {
    	super();
    }
	
	public Human(Gender gender) {
        super(gender);
    }
	
	@Override
	public void think() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Human gaveBirth() {
		if(gender == Gender.FEMALE)
			return new Human() {};
		
		return null;
	}

    @Override
    public void walk() {
        System.out.println("Mover las piernas");
    }

    @Override
    public void swing() {
        System.out.println("Mover los pies y los brazos");
    }
}

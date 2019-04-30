package com.globant.bootcamp.animals;

import com.globant.bootcamp.enums.Gender;
import com.globant.bootcamp.abstracts.Bird;

public abstract class Chicken extends Bird {
	
	public Integer eggByDay = 2;

	public Chicken() {
        super();
    }
	
    public Chicken(Gender gender) {
        super(gender);
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
    public void fly() {
        System.out.println("Mover alitas hasta 15cms");
    }

    @Override
    public void makeSound() {
        System.out.println("Pio Pio");
    }
    
    @Override
    public Egg gaveBirth() {
    	// TODO Auto-generated method stub
    	if(eggByDay != 0) {
    		return eggType();
    	}
    	
    	return null;
    }
    
    protected abstract Egg eggType();
    
}

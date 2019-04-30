package com.globant.bootcamp.animals;

import java.util.UUID;

import com.globant.bootcamp.enums.EggColor;
import com.globant.bootcamp.interfaces.Oviparous;

public class Egg {
	private final String id = UUID.randomUUID().toString();
	
	public boolean isFertilze = false;

	private Oviparous baby;

	private EggColor eggColor;

	public Egg(Oviparous animal) {
		this(animal, EggColor.WHITE);
	}

	public Egg(Oviparous animal, EggColor eggColor) {
		this.baby = animal;
		this.eggColor = eggColor;
	}

	public EggColor getEggColor() {
		return eggColor;
	}

	public Oviparous getBaby() {
		return (isFertilze) ? this.baby : null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Egg other = (Egg) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}

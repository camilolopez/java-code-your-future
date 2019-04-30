package com.globant.bootcamp.abstracts;

import java.util.UUID;

import com.globant.bootcamp.enums.Gender;
import com.globant.bootcamp.interfaces.Being;

public abstract class Animal<T> implements Being<T> {
	private final String id = UUID.randomUUID().toString();

	protected Gender gender;

	public Animal() {
		this(randomGender());
	}

	public Animal(Gender gender) {
		this.gender = gender;
	}

	public Gender getGender() {
		return gender;
	}

	public abstract void makeSound();

	protected static Gender randomGender() {
		return (Math.random() < 0.5) ? Gender.FEMALE : Gender.MALE;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}

package com.globant.bootcamp.farm;

import com.globant.bootcamp.animals.Egg;
import com.globant.bootcamp.enums.EggColor;

public class EggCarton implements Comparable<EggCarton>{
	private static final Integer ROWS = 6;
	private static final Integer COLUMNS = 5;
	private Integer lastRow = 0;
	private Integer lastColumn = 0;
	private EggColor eggColor;

	protected final Egg[][] eggs = new Egg[ROWS][COLUMNS];
	
	public EggCarton(EggColor eggColor) {
		this.eggColor = eggColor;
	}
	
	public EggCarton() {
	}

	public boolean put(Egg egg) {
		if (!isFull()) {
			this.eggs[this.lastRow][this.lastColumn++] = egg;
			this.eggColor = this.eggColor == null ? egg.getEggColor() : this.eggColor;
			if (this.lastColumn == COLUMNS) {
				this.lastColumn = 0;
				this.lastRow++;
			}
		}

		return isFull();
	}

	public void print() {
		for (int row = 0; row < ROWS; row++) {
			String rows = "";
			for (int column = 0; column < COLUMNS; column++) {
				Egg egg = eggs[row][column];
				String character = (egg != null) ? egg.getEggColor().getConsoleChar() : EggColor.EMPTY.getConsoleChar();
				rows += character;
			}
			System.out.println(rows);
		}
	}

	public boolean isFull() {
		return this.lastRow.equals(ROWS) && this.lastColumn.equals(0);
	}

	public Egg[][] getEggs() {
		return this.eggs;
	}

	@Override
	public int compareTo(EggCarton otherEggCartor) {
		// TODO Auto-generated method stub
		return this.eggColor.compareTo(otherEggCartor.eggColor);
	}
}

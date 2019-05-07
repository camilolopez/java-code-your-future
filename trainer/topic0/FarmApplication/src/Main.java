import java.util.List;

import com.globant.bootcamp.animals.Chicken;
import com.globant.bootcamp.animals.chickens.BrownChicken;
import com.globant.bootcamp.animals.chickens.WhiteChicken;
import com.globant.bootcamp.farm.EggCarton;
import com.globant.bootcamp.farm.Farm;
import com.globant.bootcamp.farm.Farmer;

public class Main {
	private static final int PERCENTAGE_WHITE_CHICKEN = 70;
	private static final int CHIKENS_SIZE = 40;

	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		Chicken[] chickens = new Chicken[CHIKENS_SIZE];

		for (int i = 0; i < CHIKENS_SIZE; i++) {
			Chicken chicken = i < ((PERCENTAGE_WHITE_CHICKEN * CHIKENS_SIZE) / 100) ? new WhiteChicken() : new BrownChicken();
			chickens[i] = chicken;
		}

		Farm farm = new Farm(chickens, farmer);

		List<EggCarton> eggCartons = farm.collectAndClassifyEggs();

		for (EggCarton eggCarton : eggCartons) {
			eggCarton.print();
			System.out.println("------------------");
		}
	}
}

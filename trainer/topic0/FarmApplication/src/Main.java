import com.globant.bootcamp.animals.Chicken;
import com.globant.bootcamp.animals.chickens.BrownChicken;
import com.globant.bootcamp.animals.chickens.WhiteChicken;
import com.globant.bootcamp.farm.EggCarton;
import com.globant.bootcamp.farm.Farm;
import com.globant.bootcamp.farm.Farmer;

public class Main {
	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		Chicken[] chickens = new Chicken[40];

		for (int i = 0; i < 40; i++) {
			Chicken chicken = (Math.random() < 0.5) ? new WhiteChicken() : new BrownChicken();
			chickens[i] = chicken;
		}

		Farm farm = new Farm(chickens, farmer);

		EggCarton[] eggCartons = farm.collectAndClassifyEggs();

		for (EggCarton eggCarton : eggCartons) {
			eggCarton.print();
		}
	}
}

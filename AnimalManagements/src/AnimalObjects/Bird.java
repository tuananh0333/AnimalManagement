package AnimalObjects;

import Interfaces.Flyable;

public class Bird extends Animal implements Flyable{
	
	protected int numberOfWings;

	public Bird(float[] bodyLengthRange, FoodRequire foodRequire, int numberOfWings) {
		super(2, bodyLengthRange, foodRequire);
		this.numberOfWings = numberOfWings;
	}

	@Override
	public void Flying() {
		// TODO Auto-generated method stub
		System.out.print("it's a bird and it can fly...");
	}
	
}

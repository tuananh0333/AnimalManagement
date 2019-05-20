package AnimalObjects;

public abstract class Animal {
	protected int numbersOfLegs;
	protected float[] bodyLengthRange;
	protected FoodRequire foodRequire;
	
	public Animal(int numbersOfLegs, float bodyLengthRange[], FoodRequire foodRequire) {
		super();
		this.numbersOfLegs = numbersOfLegs;
		this.bodyLengthRange = bodyLengthRange;
		this.foodRequire = foodRequire;
	}
	
	public int getNumbersOfLegs() {
		return numbersOfLegs;
	}
	public void setNumbersOfLegs(int numbersOfLegs) {
		this.numbersOfLegs = numbersOfLegs;
	}
	public float[] getBodyLengthRange() {
		return bodyLengthRange;
	}
	public void setBodyLengthRange(float[] bodyLengthRange) {
		this.bodyLengthRange = bodyLengthRange;
	}
	public FoodRequire getFoodRequire() {
		return foodRequire;
	}
	public void setFoodRequire(FoodRequire foodRequire) {
		this.foodRequire = foodRequire;
	}
}

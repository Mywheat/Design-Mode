package homework2;

import java.util.ArrayList;

public class SetMealBuilder3 extends Builder{

	private setmealC c = new setmealC();
	public SetMealModel getSetMealModel() {
		return this.c;
	}
	public void setSequence(ArrayList<String> sequence) {
		this.c.setSequence(sequence);		
	}
}

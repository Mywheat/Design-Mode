package homework2;

import java.util.ArrayList;

public class SetMealBuilder2 extends Builder{

	private setmealB b = new setmealB();
	public SetMealModel getSetMealModel() {
		return this.b;
	}
	public void setSequence(ArrayList<String> sequence) {
		this.b.setSequence(sequence);		
	}
}

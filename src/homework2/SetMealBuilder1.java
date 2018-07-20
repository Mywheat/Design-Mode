package homework2;

import java.util.ArrayList;

public class SetMealBuilder1 extends Builder{

	private setmealA a = new setmealA();
	public SetMealModel getSetMealModel() {
		return this.a;
	}
	public void setSequence(ArrayList<String> sequence) {
		this.a.setSequence(sequence);		
	}
}

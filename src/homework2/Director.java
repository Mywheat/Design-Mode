package homework2;

import java.util.ArrayList;

public class Director {

	private ArrayList<String> sequence = new ArrayList();
	private SetMealBuilder1 smb1 = new SetMealBuilder1();
	private SetMealBuilder2 smb2 = new SetMealBuilder2();
	private SetMealBuilder3 smb3 = new SetMealBuilder3();
	public setmealA getsetmealA(){
		this.sequence.clear();
		this.sequence.add("kele");
		this.sequence.add("galifan");
		this.sequence.add("yumi");
		this.smb1.setSequence(this.sequence);
		return (setmealA)this.smb1.getSetMealModel();
	}
	
	public setmealB getsetmealB(){
		this.sequence.clear();
		this.sequence.add("chengzhi");
		this.sequence.add("jirou");
		this.sequence.add("tudouni");
		this.smb2.setSequence(this.sequence);
		return (setmealB)this.smb2.getSetMealModel();
	}
	
	public setmealC getsetmealC(){
		this.sequence.clear();
		this.sequence.add("doujiang");
		this.sequence.add("zhou");
		this.sequence.add("yumishala");
		this.smb3.setSequence(this.sequence);
		return (setmealC)this.smb3.getSetMealModel();
	}
}

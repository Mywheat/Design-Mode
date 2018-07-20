package homework2;

import java.util.ArrayList;

public abstract class SetMealModel {

	private ArrayList<String> sequence = new ArrayList<String> ();
	protected abstract void kele();
	protected abstract void chengzhi();
	protected abstract void doujiang();
	protected abstract void galifan();
	protected abstract void jirou();
	protected abstract void zhou();
	protected abstract void yumi();
	protected abstract void tudouni();
	protected abstract void yumishala();
	final public void choice(){
		for(int i=0;i<this.sequence.size();i++){
			String choiceName = this.sequence.get(i);
			if(choiceName.equalsIgnoreCase("kele"))
				this.kele();
			else if(choiceName.equalsIgnoreCase("chengzhi"))
				this.chengzhi();
			else if(choiceName.equalsIgnoreCase("doujiang"))
				this.doujiang();
			else if(choiceName.equalsIgnoreCase("galifan"))
				this.galifan();
			else if(choiceName.equalsIgnoreCase("jirou"))
				this.jirou();
			else if(choiceName.equalsIgnoreCase("zhou"))
				this.zhou();
			else if(choiceName.equalsIgnoreCase("yumi"))
				this.yumi();
			else if(choiceName.equalsIgnoreCase("tudouni"))
				this.tudouni();
			else if(choiceName.equalsIgnoreCase("yumishala"))
				this.doujiang();
		}
	}
	final public void setSequence(ArrayList<String> Sequence){
		this.sequence = sequence;
	}
}

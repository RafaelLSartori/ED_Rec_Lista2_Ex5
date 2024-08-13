package controller;

public class Ex5 {
	public Ex5() {
		super();
	}
	
	public int mdc(int n1, int n2){
		if(n1 == 0) {
			return n1;
		} else {
			return mdc(n2, n1 % n2);
		}
	}
}

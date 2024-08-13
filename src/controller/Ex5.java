package controller;

public class Ex5 {
    public Ex5() {
        super();
    }

    public int mdc(int n1, int n2){
        if(n1 == n2) {
            return n1;
        } else {
            if(n1 > n2) {
                return mdc(n1 - n2, n2);
            } else{
                return mdc(n1, n2 - n1);
            }
        }
    }
}

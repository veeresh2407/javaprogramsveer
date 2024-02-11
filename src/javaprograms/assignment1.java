package javaprograms;

public class assignment1 {

	public static void main(String[] args) {
		assignment1 a1=new assignment1();
		a1.funA(10);
		a1.funB(1233);	
		a1.funC(832);
		a1.funD(10.245);
		a1.funE('E');
		a1.funF(true);
		

	}
	void funA(int a){
		System.out.println(a);
		
	}
	void funB(long l){
		System.out.println(l);
	}
	void funC(float f){
		System.out.println(f);
	}
	void funD(double d){
		System.out.println(d);
	}
	void funE(char c){
		System.out.println(c);
	}
	void funF(boolean b){
		System.out.println(b);
	}

}

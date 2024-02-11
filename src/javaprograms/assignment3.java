package javaprograms;

public class assignment3 {

	public static void main(String[] args) {
		System.out.println("assignment3 starts");
		assignment3 a1=new assignment3();
		a1.funA();
		a1.funB();
		a1.funC();
		a1.funD();
		a1.funE();
		a1.funF();

	}
	int funA(){
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
		return c;
	}
	long funB(){
		long l=23456;
		System.out.println(l);
		return l;
	}
	float funC(){
		float f=344454;
		System.out.println(f);
		return f;
	}
	double funD(){
		double d=102.3444;
		System.out.println(d);
		return d;
	}
	char funE(){
		char c='D';
		System.out.println(c);
		return c;
	}
	boolean funF(){ 
		boolean b=true;
		System.out.println(b);
		return b;
	}

}

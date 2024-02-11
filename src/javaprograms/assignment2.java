package javaprograms;

public class assignment2 {

	public static void main(String[] args) {
		assignment2 a1=new assignment2();
		a1.funA();
		a1.funB();
		a1.funC();
		a1.funD();
		a1.funE();
		a1.funF();
		 

	}
	
	int funA(){
		System.out.println("funA of assignment2");
		int a=20;
		int b=30;
		int z=a+b;
		return z;
	}
	long funB(){
		System.out.println("funB of assignment2");
		return 234345;
	}
	float funC(){
		System.out.println("funC of assignment2");
		return 12234443;
	}
	double funD(){
		System.out.println("funD of assignment2");
		return 10.234;
	}
	char funE(){
		System.out.println("funE of assignment2");
		return 'c';
	}
	boolean funF(){
		System.out.println("funF of assignment2");
		return true;
	}

}

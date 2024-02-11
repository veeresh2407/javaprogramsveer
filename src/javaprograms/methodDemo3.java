package javaprograms;

public class methodDemo3 {
	
	public static void main(String[] args) {
		System.out.println("main method starts");
		funC();
		System.out.println("done");
	
//		methodDemo3 hel=new methodDemo3();
//		hel.funA();
//		hel.funB();
	}
	static void funA(){
		System.out.println("fun a method");
		funC();
	}
	static void funB(){
		System.out.println("fun b starts");
		funA();
	}
	static void funC(){
		System.out.println("func started");
		funB();
	}
}

package javaprograms;

public class Ramesh3 {

	public static void main(String[] args) {
		Ramesh3 r1=new Ramesh3();
		r1.addNumbers(50, 40);
		r1.fun5("welcome");
	}
	
	void addNumbers(int a, int b){
		
	     int c=a+b;
		System.out.println(c);
	}
	void fun5(String s1){
		System.out.println(s1);
	}
	static int funB(){
		int a=15; 
		int b=30; 
		int c=a+b;
		System.out.println(c);
		return c;
	}

}

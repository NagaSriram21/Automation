package OOPS;

public class CompileTimePolymorphism {
	void myMethod (int a){
		System.out.println("value of a is " + a);
	}
	
	void myMethod (int a, int b){
		System.out.println("value of a is " + a + " and value of b is " + b);
	}
	void myMethod (String a){
		System.out.println(a);
	}
	
	public static void main (String [] args){
		CompileTimePolymorphism obj = new CompileTimePolymorphism();
		obj.myMethod(10);
		obj.myMethod(10, 20);
		obj.myMethod("I am a String");
	}

}

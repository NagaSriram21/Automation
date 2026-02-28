package OOPS;

public class MethodOverRidingChildClass extends MethodOverRidingParentClass {
	public void myMethod(){
		System.out.println("I am a method from Child Class");
	}
	
	public static void main(String [] args){
		
		/* When parent class reference refers to the child class object
		 * then the method of the child class (overriding method) is called.
		 * This we call as runtime polymorphism
		 */
		MethodOverRidingParentClass obj = new MethodOverRidingChildClass();
		// It calls the child class method myMethod()
		obj.myMethod();
		
		/* When Parent class reference refers to the parent class object
		 * then the method of parent class (overriden method) is called.
		 */
		MethodOverRidingParentClass obj1 = new MethodOverRidingParentClass();
		obj1.myMethod();
		
	}

}

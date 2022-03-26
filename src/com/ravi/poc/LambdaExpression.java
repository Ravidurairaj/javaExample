package com.ravi.poc;

/**
 * @author ravidurairaj
 * @version 1.0
 * This class is for exploring different type of lambda expression implementation
 */
public class LambdaExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Drawable d1 = () -> {
			System.out.println("i am drawing");
		};
		
		d1.draw();
		
		
		Sayable s1 = (name) -> {
			System.out.println("Myname is "+name);
		};
		
		s1.sayMyName("Ravi");
		
		Addable a1 = (a,b) -> {
			System.out.println("adding two numbers "+(a+b));
		};
		
		a1.addIt(2, 3);
	}

}

@FunctionalInterface
interface Drawable{
	public void draw();
}

@FunctionalInterface
interface Sayable{
	public void sayMyName(String myname);
}

@FunctionalInterface
interface Addable{
	public void addIt(int i,int j);
}
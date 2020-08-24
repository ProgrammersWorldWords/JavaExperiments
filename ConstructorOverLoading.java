// Write a program to find area of circle using (i) constructor overloading.
/**
 * constructor like a method.
 * What is Constructor OverLoading ?
 * ans: more than one constructor of same name inside same name of class is called constructor overloading.
 *      no return type requird to put.
 *                     constructor type
 *		1.default constructor ==> not passed any parameter inside constructor.
 *		2.paramiterised constructor==> passed some parameteriside constructor.
 *      when creat an object of that class constructor automatically called.
*/

import java.util.*;

class AreaOfCircle{
	double r;

	AreaOfCircle(){
		r=5;
	}
	
	AreaOfCircle(double radius){
		r=radius;
	}
	
	AreaOfCircle(int radius){
		r=radius;
	}

	void display(){
		System.out.println("Area of circle : "+3.14*r*r) ;
	}

}

public class ConstructorOverLoading{

	public static void main(String arg[]){

		double r1;
		int r2;

                Scanner input=new Scanner(System.in);
                
		AreaOfCircle a = new AreaOfCircle();
		
		System.out.print("Enter a radius(double) of circle : ");
		r1 = input.nextDouble();

		AreaOfCircle b = new AreaOfCircle(r1);

		System.out.print("Enter a radius(integer) of circle : ");
		r2 = input.nextInt();

		AreaOfCircle c = new AreaOfCircle(r2);

                a.display();
		b.display();
		c.display();
	}
}



		
		
		

		
		
		
		
	 
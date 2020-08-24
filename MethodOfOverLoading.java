// Write a program to find area of circle using (i) method of over loadind.
/**
 * What is Method of Over Loading ?
 *ans: more than one method of same name inside same class.
 *     but diffrentiating by passing parameters and creating object of that class.
*/

import java.util.*;

class Area{
	double r;

	void areaofcircle(){
		r=5;
	}
	
	void areaofcircle(double radius){
		r=radius;
	}
	
	void areaofcircle(int radius){
		r=radius;
	}

	void display(){
		System.out.println("Area of circle : "+3.14*r*r) ;
	}

}

public class MethodOfOverLoading{

	public static void main(String arg[]){

		double r1;
		int r2;

                Scanner input=new Scanner(System.in);
                
		Area a = new Area();
		a.areaofcircle();
		
		System.out.print("Enter a radius(double) of circle : ");
		r1 = input.nextDouble();

		Area b = new Area();
		b.areaofcircle(r1);

		System.out.print("Enter a radius(integer) of circle : ");
		r2 = input.nextInt();

		Area c = new Area();
		c.areaofcircle(r2);

                a.display();
		b.display();
		c.display();
	}
}



		
		
		

		
		
		
		
	 
/*
write a program to print patterns by for loop.
*/

public class LabelTest{

	public static void main(String args[]){

		stop:{
                      nextRow:
                      for(int row=1;row<=7;row++){
                                     if (row==6)
                                     break stop;

                                     System.out.println();

                                     for(int column=1;column<=10;column++){
                                                           if(column>row)
                                                              continue nextRow;

                                                           System.out.print(" * ");
                                      }
                           }
	         }
	}
}

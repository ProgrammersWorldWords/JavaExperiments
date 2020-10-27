import java.util.Scanner;
// class decimal number convertor
class DecimalTo{
	void decimaltobinary(int input){
		System.out.print("Your Decimal is "+input+"\n");
		System.out.print("Binary Equiavalent is ");
		}
	void decimaltooctal(int input){
		System.out.print("Your Decimal is \n");
		System.out.print("Octal Equiavalent is ");
		}
	void decimaltohexadecimal(int input){
		System.out.print("Your Decimal is \n");
		System.out.print("Hexadecimal Equiavalent is ");
		}
}
// class binary number convertor
class BinaryTo{
	void binarytodecimal(int input){
		System.out.print("Your Binary is \n");
		System.out.print("decimal Equiavalent is ");
		}
	void binarytooctal(int input){
		System.out.print("Your Binary is \n");
		System.out.print("Octal Equiavalent is ");
		}
	void binarytohexadecimal(int input){
		System.out.print("Your Binary is \n");
		System.out.print("Hexadecimal Equiavalent is ");
		}
}
// class octal number convertor
class OctalTo{
	void octaltobinary(){
		System.out.print("Your Octal Number is \n");
		System.out.print("decimal Equiavalent is ");
		}
	void octaltodecimal(){
		System.out.print("Your Octal Number is \n");
		System.out.print("decimal Equiavalent is ");
		}
	void octaltohexadecimal(){
		System.out.print("Your Octal Number is \n");
		System.out.print("Hexadecimal Equiavalent is ");
		}
}
// class hexadecimal number convertor
class HexadecimalTo{
	void hexadecimaltobinary(){
		System.out.print("Your Hexadecimal Number is \n");
		System.out.print("decimal Equiavalent is ");
		}
	void hexadecimaltooctal(){
		System.out.print("Your Hexadecimal Number is \n");
		System.out.print("decimal Equiavalent is ");
		}
	void hexadecimaltodecimal(){
		System.out.print("Your Hexadecimal Number is \n");
		System.out.print("decimal Equiavalent is ");
		}
}
// some checking
class CheckingClass{
}
// main class
public class NumberSystemConvertor{
	public static void clrscr(){
				try{
					new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
				}catch(Exception e){
					System.out.print(e);
				}

			}

	public static void main(String args[]){
		
		Scanner objectScanner = new Scanner(System.in);
		DecimalTo objectdecimalto = new  DecimalTo();
		BinaryTo objectbinaryto = new BinaryTo();
		OctalTo objectoctalto = new OctalTo();
		HexadecimalTo objecthexadecimalto = new HexadecimalTo();

		clrscr();
		System.out.print("			Number System Convertor\n");
		System.out.print("1>.Decimal to Binary,Octal,Hexadecimal.\n");
		System.out.print("2>.Binary to Decimal,Octal,Hexadecimal.\n");
		System.out.print("3>.Octal to Binary,Decimal,Hexadecimal.\n");
		System.out.print("4>.Hexadecimal to Binary,Octal,Decimal.\n");
		System.out.print("5>.Exit.\n");
		System.out.print("Select Option (1,2,3,4,5) : ");
		int option = objectScanner.nextInt();
		clrscr();

		switch(option){
			case 1:
				System.out.print("Enter a Decimal Number : ");
				int decimalinput = objectScanner.nextInt();
				clrscr();
				System.out.print("Decimal to \n");
				System.out.print("	1>.Binary.\n");
              			System.out.print("	2>.Octal.\n");
				System.out.print("	3>.Hexadecimal.\n");
				System.out.print("Seclect Option ");
				int decimaloption = objectScanner.nextInt();
				clrscr();
				switch(decimaloption){
					case 1:
						System.out.print("	1>.Binary.\n");
						objectdecimalto.decimaltobinary(decimalinput);
						break;
					case 2:
						System.out.print("	2>.Octal.\n");
						objectdecimalto.decimaltooctal(decimalinput);
						break;
					case 3:
						System.out.print("	3>.hex.\n");
						objectdecimalto.decimaltohexadecimal(decimalinput);
						break;
					default :
						System.out.print("Invalid Option");
					
				}
				break;

			case 2:
				System.out.print("Enter a Binary Number : ");
				int binaryinput = objectScanner.nextInt();
				clrscr();
				System.out.print("Binary to \n");
				System.out.print("	1>.Decimal.\n");
              			System.out.print("	2>.Octal.\n");
				System.out.print("	3>.Hexadecimal.\n");
				System.out.print("Seclect Option ");
				int binaryoption = objectScanner.nextInt();
				clrscr();
				switch(binaryoption){
					case 1:
						System.out.print("	b1>.decimal.\n");
						break;
					case 2:
						System.out.print("	b2>.Octal.\n");
						break;
					case 3:
						System.out.print("	b3>.hex.\n");
						break;
					default :
						System.out.print("Invalid Option");
					
				}
				break;

			case 3:
				System.out.print("Enter a Octal Number : ");
				int Octalinput = objectScanner.nextInt();
				clrscr();
				System.out.print("Octal to \n");
				System.out.print("	1>.Binary.\n");
              			System.out.print("	2>.Decimal.\n");
				System.out.print("	3>.Hexadecimal.\n");
				System.out.print("Seclect Option ");
				int octaloption = objectScanner.nextInt();
				clrscr();
				switch(octaloption){
					case 1:
						System.out.print("	o1>.Binary.\n");
						break;
					case 2:
						System.out.print("	o2>.Octal.\n");
						break;
					case 3:
						System.out.print("	o3>.hex.\n");
						break;
					default :
						System.out.print("Invalid Option");
					
				}
				break;

			case 4:
				System.out.print("Enter a Hexadecimal Number : ");
				int hexadecimalinput = objectScanner.nextInt();
				clrscr();
				System.out.print("Hexadecimal to \n");
				System.out.print("	1>.Binary.\n");
              			System.out.print("	2>.Octal.\n");
				System.out.print("	3>.Decimal.\n");
				System.out.print("Seclect Option ");
				int hexadecimaloption = objectScanner.nextInt();
				clrscr();
				switch(hexadecimaloption){
					case 1:
						System.out.print("	h1>.Binary.\n");
						break;
					case 2:
						System.out.print("	h2>.Octal.\n");
						break;
					case 3:
						System.out.print("	h3>.hex.\n");
						break;
					default :
						System.out.print("Invalid Option");
					
				}
				break;
			case 5:
				break;
			default :
				System.out.print("Invalid Option");


		}

	}
}
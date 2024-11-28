import java.util.Scanner;
public class IT24103947Lab5Q1 {

	public static void main(String[] args) {
		// Create a scanner object 
		Scanner scn=new Scanner(System.in);
		
		//Prompt the user to enter three integers
		System.out.print("Enter the first integer:");
		int num1=scn.nextInt();
		
		System.out.print("Enter the Second integer:");
		int num2=scn.nextInt();
		
		System.out.print("Enter the Third integer:");
		int num3=scn.nextInt();
		
		//Print the three numbers entered by user
		System.out.println(" ");
		System.out.println("User entered numbers are: "+ num1+" "+num2+" "+num3);
		
		//Find the largest number
		int largest=0;
		if(num1 > num2 && num1>num3) {
			largest=num1;
		}
		else if(num2>num1 && num2>num3){
			largest=num2;
		}
		else if(num3>num1 && num3>num2){
			largest=num3;
		}
		
		//Find the Smallest number
		int smallest=0;
		if(num1<num2 && num1<num3) {
			smallest=num1;
		}
		else if(num2<num1 && num2<num3) {
			smallest=num2;
		}
		else if(num3<num1 && num3<num2) {
			smallest=num3;
		}
		//Display the Smallest and Largest numbers
		System.out.println("The Smallest number is: " + smallest);
		System.out.println("The Largest number is: " + largest);
		
		

	}

}

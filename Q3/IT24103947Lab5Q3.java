import java.util.Scanner;
  public class IT24103947Lab5Q3 {
    
	//Declare the fixed values
	  public static final double roomCharge=48000;

      public static void main(String[] args) {

	//create Scanner object to read input from the keyboard
    	  Scanner scn=new Scanner(System.in);
	
	//declare variables
		double discount=0;
  
	//Prompt the user to input start and end dates
		System.out.print("Enter Start Date (1-31):");
		int startDate=scn.nextInt();

	 	System.out.print("Enter End Date (1-31):");
		int endDate=scn.nextInt();

	//Validate the entered dates are correct
		
		if(startDate < 1 || startDate > 31){
		    System.out.println("Error: Days must be between 1 and 31");
			return;
		}
		else if(endDate < 1 || endDate > 31){
		    System.out.println("Error: Days must be between 1 and 31");
			return;
		}
		else if(startDate > endDate){
		    System.out.println("Error: Start Date must be less than End Date");
			return;
		}
		
	//Find the number of days reserved
		int numOfDays = endDate - startDate;
		

	//Validate the discount
		if(numOfDays < 3){
		    discount=0;
		}else if(numOfDays >= 3 || numOfDays <= 4){
		    discount=10;
		}
		else if(numOfDays >= 5){
		    discount=20;
		}
	
	//calculations
		double totalAmount = numOfDays* roomCharge;
		double totalAmountWithDis = totalAmount - totalAmount * (discount/100);

	//Print the final results
		System.out.println();
		System.out.println("Room Charge Per Day: Rs. " + roomCharge+"/=");
		System.out.println("Number of Days Reserved: " + numOfDays);
		System.out.println("Total Amount to be Paid: " + totalAmountWithDis);
	
	scn.close();
		
	}

}

        

        
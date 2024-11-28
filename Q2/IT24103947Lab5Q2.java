import java.util.Scanner;
  public class IT24103947Lab5Q2 {
    public static void main(String[] args) {

    //create scanner class object 
	Scanner scn=new Scanner(System.in);

   //input the number of members
	System.out.print("Enter the number of new members introduced: ");
	int members=scn.nextInt();
   
   //check how many members introduced
	String prize;

	if(members<0){
		System.out.println("Input must be a number 0 or greater");
	}else {

	switch(members)
        {

	case 0 : prize="No Prize";
		break;
	case 1 : prize="Pen";
		break;
	case 2 : prize="Umbrella";
		break;
	case 3 : prize="Bag";
		break;
	case 4 : prize="Travelling Chair";
		break;
	default : prize="Headphone";
		break; 
	      }
	//Print the price
	System.out.println("Prize is a: " + prize);
        }
  }

}
	
	
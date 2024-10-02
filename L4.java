import java.util.Scanner;

public class L4{


	public static void main(String[] args){

		//Note: Starter code structure does not need to be followed exactly if you have a different way
		//to solve go ahead and solve BUT switch statements and loops must be used when specified

		//Create Scanner for user input
		Scanner userIn = new Scanner(System.in);

		boolean exit = false;

		while(!exit){

			System.out.println("Choose an option:");
			//Print menu
			System.out.println("1. Add");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulus");
			System.out.println("6. Factorial");
			System.out.println("7. Exit");

			//Grab user input if user enters exit option end program, otherwise continue 
			int option = userIn.nextInt();
			//Ask user to enter numbers
			switch(option){
			
			case 1://Add
				System.out.println("Enter the first number");
				int firstNum = userIn.nextInt();

				System.out.println("Enter the second number");
				int secNum = userIn.nextInt();

				int sum = firstNum+secNum;
				System.out.println("The result of "+firstNum+" + "+secNum+" is: "+sum);
			break;
			
			case 2://Subtraction
				System.out.println("Enter the first number");
				firstNum = userIn.nextInt();

				System.out.println("Enter the second number");
				secNum = userIn.nextInt();

				sum = firstNum-secNum;
				System.out.println("The result of "+firstNum+" - "+secNum+" is: "+sum);
			break;
			
			case 3://Multiplication
				System.out.println("Enter the first number");
				firstNum = userIn.nextInt();

				System.out.println("Enter the second number");
				secNum = userIn.nextInt();

				sum = firstNum*secNum;
				System.out.println("The result of "+firstNum+" * "+secNum+" is: "+sum);
			break;
			
			case 4://Division
				System.out.println("Enter the first number");
				firstNum = userIn.nextInt();

				System.out.println("Enter the second number");
				secNum = userIn.nextInt();

					if(secNum ==  0){
						System.out.println("Error! You can not divide by zero. Please try again.");

						System.out.println("Enter the first number");
							firstNum = userIn.nextInt();

						System.out.println("Enter the second number");
							secNum = userIn.nextInt();
				}

				sum = firstNum/secNum;
				System.out.println("The result of "+firstNum+" / "+secNum+" is: "+sum);
			break;
			
			case 5://Modulus
				System.out.println("Enter the first number");
				firstNum = userIn.nextInt();

				System.out.println("Enter the second number");
				secNum = userIn.nextInt();

				sum = firstNum%secNum;
				System.out.println("The result of "+firstNum+" % "+secNum+" is: "+sum);
			break;
			//If user picks factorial option you do not need to ask for second number
			// What can you use to make that decision 
			case 6://Factorial
				System.out.println("Enter the first number");
				firstNum = userIn.nextInt();

					int factorial = 1;

				if(firstNum<0){
					System.out.println("Sorry, can not find the factorial of numbers less than 0. Please try again.");
				}else{
					for(int i = 1; i <= firstNum; i++)
						factorial *= i;
					 System.out.println("The result of " +firstNum+"! is: "+factorial);
				} 
			break;

			case 7://Exit
				System.out.println("Goodbye!");
				exit = true;
			break;
			default:
				System.out.println("Invalid number. Please try again.");
			break;
		}
	}
}
		}
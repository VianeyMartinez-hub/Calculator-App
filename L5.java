import java.util.Scanner;

public class L5{
	
	//Create methods before the main method
	public static int addition (int x, int y){
			int result = x + y;
			return result;
	}

	public static int subtraction (int x , int y){
	 		int result = x - y;
			return result;
	}

	public static int multiplication (int x , int y){
	 		int result = x * y;
			return result;
	}

	public static int division (int x , int y){
			int result = x / y;
			return result;
	}

	public static int modulus (int x , int y){
	 		int result = x % y;
			return result;
	}

	public static int factorial (int x){
			int result = 1;

			if(x<0){
				System.out.println("Sorry, can not find the factorial of numbers less than 0. Please try again.");
			return -1;
			}else{
				for(int i = 1; i <= x; i++)
						result *= i;
			}
		return result;
	}

	//Watch out when diving by 0! We had a lecture in regards to division by 0!

	public static void main(String[] args){

		//Note: Starter code structure does not need to be followed exactly if you have a different way
		//to solve go ahead and solve BUT switch statements and loops must be used when specified

		//Create Scanner for user input
		Scanner userIn = new Scanner(System.in);

		int result;

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
  		    int firstNum = 0, secNum = 0;

  		    while(option < 1 || option > 7){
  		    	System.out.println("Invalid number. Please try again.");
  		    	option = userIn.nextInt();
  		    }

			if(option == 6){
				System.out.println("Enter the first number");
				firstNum = userIn.nextInt();

				}else if(option == 7){
					System.out.println("Goodbye!");
					break;

				}else{
					System.out.println("Enter the first number");
					firstNum = userIn.nextInt();

					System.out.println("Enter the second number");
					secNum = userIn.nextInt();
				}

			//Use switch statement to choose an option and complete appropriate arithmetic operation

			// Switch statement syntax:
			switch(option){

			case 1://Addition
				result = addition(firstNum, secNum);
				System.out.println("The addition of " + firstNum + " + " + secNum + " is: " + result);
			    break;
			
			case 2://Subtraction
				result = subtraction(firstNum, secNum);
				System.out.println("The subtraction of " + firstNum + " - " + secNum + " is: " + result);
			    break;
			
			case 3://Multiplication

				result = multiplication(firstNum, secNum);
				System.out.println("The multiplication of " + firstNum + " * " + secNum + " is: " + result);
			    break;
			
			case 4://Division
		        try {
					result = division(firstNum, secNum);
					System.out.println("The division of " + firstNum + " / " + secNum + " is: " + result);
			   		break;

		        } catch (ArithmeticException e) {
		            System.out.println("Error! You cannot divide by zero. Please try again.");

					System.out.println("Enter the first number");
					firstNum = userIn.nextInt();

					System.out.println("Enter the second number");
					secNum = userIn.nextInt();

					result = division(firstNum, secNum);
					System.out.println("The division of " + firstNum + " / " + secNum + " is: " + result);
			   		break;
				}
			
			case 5://Modulus
				result = modulus(firstNum, secNum);
				System.out.println("The modulus of " + firstNum + " % " + secNum + " is: " + result);
			    break;

			case 6://Factorial
				result = factorial(firstNum);
				System.out.println("The factorial of " + firstNum + "! is: " + result);
			    break;

			}
		}
	}
}
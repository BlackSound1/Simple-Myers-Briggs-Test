
// This program sorts a user into 1 of 16 possible Myers-Briggs personality types
// based on how they answer questions

import java.util.Scanner; // Importing the Scanner utility to get user input

public class MyersBriggs {
	
	public static void main(String[] args) {
		
		Scanner userIn = new Scanner(System.in); // Sets up Scanner as userIn
		
		// Asks user if they want to participate. Test runs regardless of user answer.
		System.out.println("Hello! This is a Myers-Briggs personality analyser." +
		" Do you want to take the quiz? \'yes\' or \'no\'");
		String userYesOrNo = userIn.next(); // takes in the user's answer 
		
		if(userYesOrNo.equalsIgnoreCase("yes")){
			System.out.println("That\'s great!");			
		}else{
			System.out.println("That's too bad... Let's do it anyway!");
		}
		
		// Main test. Asks user some personality questions and stores the answers. 
		System.out.print("Q1. How do you get your energy? ");
		System.out.println("\n    1- Spending time alone\n    10- Spending time with others");
		int userQ1Answer = userIn.nextInt();
		
		System.out.print("Q2: How do you see the world & gather information? ");
		System.out.println("\n    1- In concrete terms\n    10- In abstract terms");
		int userQ2Answer = userIn.nextInt();
		
		System.out.print("Q3: How do you make your decisions? ");
		System.out.println("\n    1- Using my head\n    10- Using my heart");
		int userQ3Answer = userIn.nextInt();
		
		System.out.print("Q4: How much do you like to plan? ");
		System.out.println("\n    1- Make plans far in advance\n    10- Go with the flow");
		int userQ4Answer = userIn.nextInt();
		
		
		// Defining useful variables for the main algorithm. Initializes them to empty spaces.  
		char introvertOrExtrovert = ' ';	
		char sensorOrIntuitive = ' ';
		char thinkerOrFeeler = ' ';
		char judgerOrPerceiver = ' ';
		
		// Main algorithm. Stores the user's Test answers as corresponding Myers-Briggs letters. 
		if (userQ1Answer <= 5){
			 introvertOrExtrovert = 'I';	
		}else{
			 introvertOrExtrovert = 'E';
		}
		
		if(userQ2Answer <= 5){
			 sensorOrIntuitive = 'S';
		}else{
			 sensorOrIntuitive = 'N';
		}
		
		if(userQ3Answer <= 5){
			 thinkerOrFeeler = 'T';
		}else{
			 thinkerOrFeeler = 'F';
		}
		
		if(userQ4Answer <= 5){
			 judgerOrPerceiver = 'J';
		}else{
			 judgerOrPerceiver = 'P';
		}
		
		// Display results to user and close program.
		System.out.println("Your personality type is: *" + introvertOrExtrovert +
				sensorOrIntuitive + thinkerOrFeeler + judgerOrPerceiver + "*");
		
		System.out.println("To find out more about that type of personality check out:"
                           +" https://www.truity.com/view/types");
		System.out.println("Have a great day!");
		
		userIn.close();
	}

}

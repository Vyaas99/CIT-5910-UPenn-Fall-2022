package hw1;
/**
 * CIT 5910
 * HW1
 * @author vyaas
 *
 */
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");//Printing "Hello World!"
		System.out.println("");//Gap Line
		System.out.println("----------");//Dash Line 
		System.out.println("");//Another Gap Line
		System.out.println(1.22*49021);//Printing the result of 1.22 multiplied by 49021
		/*
		 * The following gap and dash lines are used to separate the answers to different questions. 
		 * It will keep repeating after every answer.
		 */
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		System.out.println(3/0.3);//Printing the result of 3 divided by 0.3
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		System.out.println(214/6);//Printing the result of 214 divided by 6, discarding the remainder
		//Integer division does not include decimals effectively discarding the remainder and printing 210/6.
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		System.out.println(214.0/6.0);//Printing the result of 214 divided by 6, without discarding the remainder
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		System.out.println(214%6);//Printing the remainder of 214 divided by 6
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		System.out.println(Math.pow(3,11));//Printing the value of 3 raised to the 11th power
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		System.out.println(String.valueOf(6/4));//Cast the value of 6 divided by 4 to a String and print it
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		/*
		 * Concatenating and printing the Strings 'I', 'Love', and 'Java' with a single empty space 
between them.
		 */
		System.out.println("I"+" "+"Love"+" "+"Java");
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		/*
		 * Using print insted of println so that the two print statements come in the same line.
		 * The gap and dash lines have println because it is to be executed in the next line.
		 */
		System.out.print("4%2=");
		System.out.print(4%2);// Printing "4%2=" and its answer in the same line.
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		//We use a "\" to create an escape sequence to treat the quote symbol as a raw string.
		System.out.println("Albert Einstein's best quote is \"I have no special talent. I am only passionately curious.\"");//Printing "Albert Einstein's best quote is "I have no special talent. I am only passionately curious."
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		//We use the escape character "\" to create an escape sequence to treat "\" as a raw string.
		System.out.println("In Java Strings, the backslash (\\) is a special character, also called the \"escape\" character.");//Printing "In Java Strings, the backslash (\) is a special character, also called the "escape" character."
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		System.out.println("Goodbye");//Printing goodbye to signal the end of the program.
		
		

	}

}

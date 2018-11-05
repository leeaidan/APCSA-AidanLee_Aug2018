/*Prints out an HourGlass with a max width of 10, not counting the side symbols
 * @author Aidan lee
 * @version 11/3/2018 1.0
 */
public class Main {
	public static void main(String [] args) {
		printTopBot();
		printTHalf();
		printMid();
		printBHalf();
		printTopBot();
		
	}
	//prints the bottom and top parts 
	public static void printTopBot() {
		
		symbolLoop("|", 1);
		symbolLoop("\"", 10);
		symbolLoop("|", 1);
		newLine();
	}
	//prints the top half, using 5 in for loop b/c there are 4 lines of code
	public static void printTHalf() {
		for(int i = 1; i<5; i++) {
			symbolLoop(" ", i);
			symbolLoop("\\", 1);
			symbolLoop(":", 10-2*i);//subtracts from ten b/c thats the width, multiplies 2 by i b/c loses 2 colons each time
			symbolLoop("/", 1);
			newLine();
		}
	}
	//prints the mid portion, which has 5 spaces on each side
	public static void printMid() {
		symbolLoop(" ", 5);
		symbolLoop("||", 1);
		symbolLoop(" ", 5);
		newLine();
	}
	//uses 5 in for loop b/c there are 4 lines in the bottom half
	//basically reversal of the top half
	public static void printBHalf() {
		for(int i = 1; i<5; i++) {
			symbolLoop(" ", 5-i);
			symbolLoop("/", 1);
			symbolLoop(":", (10-(10-2*i))); //a totally jank solution like in printTalf() but reversed
			symbolLoop("\\", 1);
			newLine();
		}
	}
	
	/*This method, inspired by StackOverflow
	 * Loops a string input as many times until it hits the limit
	 * Basically the code that actually makes the code work properly, stack overflow is so helpful
	 * Basically is a nested for loop for each the above methods but simplified to reduce print statements
	 */
	public static void symbolLoop(String symbol, int limit) {
		for(int i = 1; i <= limit; i++) {
			System.out.print(symbol);
		}
	}
	//Prints a new line
	public static void newLine() {
		System.out.println("");
	}

}

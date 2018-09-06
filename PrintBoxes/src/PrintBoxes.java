
public class PrintBoxes {
	public static void main(String [] args) {
		for(int x=0; x<3; x++) {
			plus();
			pipe();
			pipe();
			pipe();
			plus();
			space();
			
		}
			
	}
	
public static void plus() {
	System.out.println("+_______+");
}

public static void pipe() {
	System.out.println("|       |");
}
public static void space() {
	System.out.println();
}
}

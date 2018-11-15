import java.util.Arrays;

public class LotsOfCopies {
	public static void main(String []args) {
		int num =7;
		String strMain = "APCS";
		int[] arrMain = {1,2,3,4,5};
		changeMe(num, strMain, arrMain);
		System.out.println("num: "+ num);
		System.out.println("strMain: "+ strMain);
		System.out.println("arrMain: "+ Arrays.toString(arrMain));
		
	
		part2();
;		
		
	}
	
	public static void changeMe(int x, String str, int[] arr) {
		x++;
		str +=str;
		arr[2]=42;
		
	}
	
	public static void part2() {
		System.out.println("\nPART 2");
		int a=5;
		int b=a;
		a=7;
		System.out.println("a: " + a);
		System.out.println("b: " +b);
		
		String a1 = "I ship Audraaron";
		String b1 = a1;
		a1 = "Memes";
		System.out.println("a1: " + a1);
		System.out.println("b1: " +b1);
		
		int[] a2 = {1,2,3,4,5};
		int[] b2 = a2;
		a2[4] = 10;
		System.out.println("a2: " + Arrays.toString(a2));
		System.out.println("b2: " +Arrays.toString(b2));
		
		
		
		
	}

}

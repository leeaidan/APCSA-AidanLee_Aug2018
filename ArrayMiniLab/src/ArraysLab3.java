/*
 * @author Aidan Lee 
 * @version 11/15/2018
 * This class investigates the traversal of arrays thoroughly
 */
import java.util.*;
public class ArraysLab3 {
	public static void main(String [] args) {
		int[] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
		int[] a2 = {7, 14, 21, 28, 35, 42, 49, 56};
		
		int[] sumArr = sum(a1, a2);
		
		int appendNum = 200;
		int[] appendArr = append(a1, appendNum);
		
		int removeIdx = 5;
		int[] removeArr = remove(a2, removeIdx);
		
		int sumOfEvens = sumEven(appendArr);
		
		rotateRight(a1);
		
		System.out.println(Arrays.toString(sumArr));
		System.out.println(Arrays.toString(appendArr));
		System.out.println(Arrays.toString(removeArr));
		System.out.println(sumOfEvens);
		System.out.println(Arrays.toString(a1));	
	}
	
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] outputSum = new int[arr2.length];
		for(int i =0; i<outputSum.length; i++ ) {
			outputSum[i] = arr1[i] + arr2[2];
		}
		return outputSum;
	}
	
	public static int[] append(int[] arr, int num) {
		int[] outputAppend = new int[arr.length + 1];
		for(int i =0; i< arr.length; i++) {
			outputAppend[i] = arr[i];
		}
		outputAppend[outputAppend.length -1] = num;
		return outputAppend;
	}
	
	public static int[] remove(int[] arr, int idx) {
		int[] outputRemove = new int[arr.length -1];
		int indexCounter = 0; //zero based indexing
		for(int i= 0; i< arr.length; i++) {
			if(i != idx) {
				outputRemove[indexCounter] = arr[i];
				indexCounter++;
			}
		}
		return outputRemove;	
	}
	
	public static int sumEven(int[] arr) {
		int outputSumEven = 0;
		for(int i=0; i < arr.length; i++) {
			if(i % 2 ==0) {
				outputSumEven = outputSumEven + arr[i];
			}
		}
		return outputSumEven;
	}
	
	public static void rotateRight(int[] arr) {
		int stored = arr[arr.length -1];
		for(int i = arr.length -1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = stored;
	}
	



}

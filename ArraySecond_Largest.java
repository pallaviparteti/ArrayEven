package array.com;
import java.util.Scanner;

public class ArraySecond_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		int size = scanner.nextInt();
	//declaring array 	
 int [] array = new int[size];
 
 System.out.println("Enter the elements of the array : ");
 for(int i = 0; i < size; i++)
 {
	 array[i] = scanner.nextInt();
 }
 //declaring the maximum elements
 int max = Integer.MIN_VALUE;
 //compairing with each elements and find maximum element
 for(int i = 0; i < size; i++) {
	 if(array[i] > max) {
		 max = array[i];
	 }
 }
 System.out.println("the maximum value is : " + max);
 int second_max = Integer.MIN_VALUE;
//Finding second largest  element
 //compairing with each element and aslo checking it is not equal to max
 for(int i = 0; i < size; i++)
 {
	 if(array[i] > second_max && array[i] != max) {
		 second_max = array[i];
	 }
 }
 System.out.println("the second maximum value is : " + second_max);
	}

}

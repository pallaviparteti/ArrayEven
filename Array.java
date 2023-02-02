package array.com;
public class Array
{
	public static void main(String[] args) {
  int array[] = new int[100];
  int index = 0;
  System.out.println("Even numbers");
  for(int i = 2; i <= 200; i++){
	  {
		  if(i % 2 == 0)
		  {
			  array[index] = i;
			  index++;
			  System.out.println(i + " ");
		  }
	  }
  }
 
	}
}
	
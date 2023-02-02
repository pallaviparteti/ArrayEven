package array.com;
	class Smallest_NumberOfArray {
	    public static void main(String args[])
	    {
	        int arr[] = { 12,43,34,54,65,77,21,69 };
	        int n = arr.length;
	        int smallest = Integer.MAX_VALUE;
	        // traversing the array to find
	        // smallest element.
	        for (int i = 0; i < n; i++) {
	            if (arr[i] < smallest) {
	                smallest = arr[i];
	            }
	        }
	        System.out.println("smallest element is: "
	                           + smallest);
	 
	        int second_smallest = Integer.MAX_VALUE;
	 
	        // traversing the array to find second smallest
	        // element
	        for (int i = 0; i < n; i++) {
	            if (arr[i] < second_smallest
	                && arr[i] > smallest) {
	                second_smallest = arr[i];
	            }
	        }
	        System.out.println("second smallest element is: "
	                           + second_smallest);
	    }
	}


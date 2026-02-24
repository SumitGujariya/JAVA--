package ArrayInJava;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		int nums[][] = new int [3][4]; 


		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) { // Here we use nested loop.
				nums[i][j] = (int) (Math.random() *10); // Generate a random number between 0 and 9 and store it in the 2-D array nums at position [i][j].
				// nums[i][j] = new Random().nextInt(10); // Both are doing same thing to print the number between 1 tp 9 and converting into the double to int.
			}
		}

		// For the output you want to write this for loop.
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(nums[i][j] + " "); // this ( + " ") we using to give a space into the array.
			} 
			System.out.println();
		}
		
		// This will is enhanced (for loop).
		for(int n[] : nums) {
			for(int m : n) {

				System.out.print(m+" ");
			}
			System.out.println();
		}
	}
}


// Second method to do this Multidimensional Array (2D).
/*
public class MultiDimensionalArray {
	public static void main(String[] args) {
		int nums[][]=new int [3][4]; // This is the meaning of ([3][4]) it means they want each nums have 3 array and inside the array have 4 elements.
		//inr random=0;
		//int random=(int)Math.random()*100; // This is the math.random method with the help of you generate random number.  
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				nums[i][j]=(int)Math.random()*100;
				System.out.println(nums[i][j]);
			}
			System.out.println();
		}
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int n[]:nums)
		{
			for(int m:n)
			{
				System.out.println(m+" ");
			}
			System.out.println();
		}
	}
}
*/
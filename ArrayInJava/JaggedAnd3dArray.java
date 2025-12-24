package ArrayInJava;

public class JaggedAnd3dArray {
	public static void main(String[] args) {
		int nums[][] = new int[3][]; // jagged
		nums[0] = new int[3]; // You describe the how many elements in those particular array. In this have (eelements).
		nums[1] = new int[4]; // In this have (4 elements)
		nums[2] = new int[2]; // In this have (2 elements)

		// int nums[][]=new int [3][4];
		// int nums[][]=new int [3][4][5]; // three dimensional

		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[i].length; j++) {
				nums[i][j] = (int) (Math.random() * 10);
			}
		}
		for (int n[] : nums){
			for (int m : n) {
				System.out.print(m + " ");
			}
				System.out.println();
		}
	}
}
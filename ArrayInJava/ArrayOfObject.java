package ArrayInJava;

class Student {
	int rollno;
	String name;
	int marks;	
}

public class ArrayOfObject  {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.rollno = 1;
		s1.name = "Navin";
		s1.marks = 88;
		// System.out.println(s1.name + ":"+ s1.marks);
		
		Student s2 = new Student();
		s2.rollno = 2;
		s2.name = "Harsh";
		s2.marks = 67;
		
		Student s3 = new Student();
		s3.rollno = 3;
		s3.name = "Kiran";
		s3.marks = 97;
		
		
		Student students[] = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		// you can find the output with the help of both loop in normal for  loop.
		// for(int i=0; i<students.length; i++) {
		// 	System.out.println(students[i].name+":"+students[i].marks); // Here's you fetch the value with the help of array.
		// }

		// you can find aslo the output with the help of this loop is (Enhanced loop say for each loop).
		for(Student stud : students) {
			System.out.println(stud.name + " : " + stud.marks);
		}
		
		
		
// 		int nums[] = new int[4];
// 		nums[0]=4;
// 		nums[1]=8;
// 		nums[2]=3;
// 		nums[3]=9;
// 
		// this both are diffrent method to solve the problem.
//		for(int i=0;i<nums.length;i++) {
//			System.out.println(nums[i]);
//		}

//		you can this will enhanced loop (for each loop).
// 		for(int n : nums) {
// 			System.out.println(n);
// 		}
	}
}
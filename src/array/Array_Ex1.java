package array;

import java.util.Arrays;

public class Array_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] Stu_Height= {175,167,160,183,187,188,179,176,175,169,175,176,178,165};
		int sum=0;
		for(int i=0;i<Stu_Height.length;i++)
		{
			sum +=Stu_Height[i];
		}
		Arrays.sort(Stu_Height);
		System.out.println(Arrays.toString(Stu_Height));
		
		int avg =sum/15;
		System.out.println("Sum of the students height "+sum);
		System.out.println("Average of the students height "+avg);
		System.out.println("Shortest Height" +Stu_Height[0]);
		System.out.println("Highest Height" +Stu_Height[14]);
	}

}

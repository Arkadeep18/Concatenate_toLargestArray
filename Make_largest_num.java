package practice_prev;
import java.util.*;
public class Make_largest_num {

	static int[] makeLarge(int[]nums) {
		int n=nums.length;
		int []newArr=new int [2*n];
		
		for(int i=0;i<n;i++) {
			newArr[i]=nums[i]; //first half
			newArr[i+n]=nums[i]; //repeatation to repeat the same item on other index
			}
		return newArr;
	}
	public static void main(String[] args) {
		int [] nums = {1,2,3};

		int [] ans=makeLarge(nums);
		System.out.println(Arrays.toString(ans));
		
	}

}

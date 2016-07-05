import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class leetcode18 {
	public static void main(String[] args) {
		List<List<Integer>> a = new ArrayList<List<Integer>>();
		int[] num = new int[]{-1,0,1,2,-1,-4};
		//System.out.println(fourSum(num, 0));
		System.out.println(KSum(num, 0,4));
	}
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		return KSum(nums, 0, 4);
    }
	public static List<List<Integer>> KSum(int[] nums, int target,int n) {
		List<List<Integer>> a = new ArrayList<List<Integer>>();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		int[] num ;
		for(int front = 0; front < nums.length ; front++){
			num = Arrays.copyOfRange(nums, front+1, nums.length );
			if(n > 3){
				list = KSum(num, target - nums[front],n - 1);
			}else list = twoSum(num, target - nums[front]);
			if(front!=0 && nums[front-1] == nums[front])continue;
			for(int i = 0; i < list.size(); i++){
				Integer[] array = new Integer[n];
				for(int ii = 0; ii < n-1; ii++){
					array[ii] = list.get(i).get(ii);
				}
				array[array.length -1] = nums[front];
				List<Integer> list1 = Arrays.asList(array);
				a.add( list1);
			}
		}
		return a;
	}
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> a = new ArrayList<List<Integer>>();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		int[] num ;
		for(int front = 0; front < nums.length ; front++){
			num = Arrays.copyOfRange(nums, front+1, nums.length );
			list = twoSum(num, -nums[front]);
			if(front!=0 && nums[front-1] == nums[front])continue;
			for(int i = 0; i < list.size(); i++){
				Integer[] array = new Integer[list.size()+1];
				for(int ii = 0; ii < list.size(); ii++) array[ii] = list.get(i).get(ii);
				array[array.length -1] = nums[front];
				List<Integer> list1 = Arrays.asList(array);
				a.add( list1);
			}
		}
		
		return a;
	}
	public static List<List<Integer>> twoSum(int[] nums, int target) {
		List<List<Integer>> a = new ArrayList<List<Integer>>();
		for(int front = 0; front < nums.length - 1; front++){
			for(int rear = front + 1; rear < nums.length; rear++){
				if(nums[front] + nums[rear] == target){
					if(a.size() != 0 && a.get(a.size()-1).get(1) == nums[rear])continue;
					a.add(Arrays.asList(nums[front], nums[rear]));
				}
			}
		}
		return a;
	}
}

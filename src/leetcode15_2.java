import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode15_2 {
	public static void main(String[] args) {
		List<List<Integer>> a = new ArrayList<List<Integer>>();
		int[] num = new int[]{-1,0,1,2,-1,-4};
		System.out.println(threeSum(num));
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
				a.add(Arrays.asList(nums[front], list.get(i).get(0), list.get(i).get(1)));
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

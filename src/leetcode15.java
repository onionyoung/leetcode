import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class leetcode15 {
	public static void main(String[] args) {
		//List<Integer> list = Arrays.asList(1, 2, 3);
		//List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<List<Integer>> a = new ArrayList<List<Integer>>();// = Arrays.asList(list,list1);
		//list = Arrays.asList(1, 2, 3);
		//a.add(list);
		//a.add(list1);
		int[] num = new int[]{-1,0,1,2,-1,-4};
		//threeSum(nums);
		System.out.println(threeSum(num));
	}
	public static List<List<Integer>> threeSum(int[] nums) {
		int front = 0, mid = 0, rear = 0;
		List<List<Integer>> a = new ArrayList<List<Integer>>();
		int state = 0;
		for(; front < nums.length -2; front++){
			mid = front + 1;
			for(; mid < nums.length -1; mid++){
				rear = mid + 1;
				for(; rear < nums.length; rear++){
					if(nums[front] + nums[mid] + nums[rear] == 0){
						List<Integer> list = Arrays.asList(nums[front], nums[mid], nums[rear]);
						a.add(list);
					}
				}
			}
		}
		for(int i = a.size()-1; i >= 0; i--){
			for(int ii = i - 1; ii >= 0; ii--){
				int s = i;
				if(a.get(ii).get(0) == a.get(s).get(0)){
					if(a.get(ii).get(1) == a.get(s).get(1) || a.get(ii).get(1) == a.get(s).get(2)){
						a.remove(s);
						s = ii;
						break;
					}
				}else if(a.get(ii).get(0) == a.get(s).get(1)){
					if(a.get(ii).get(1) == a.get(s).get(0) || a.get(ii).get(1) == a.get(s).get(2)){
						a.remove(s);
						s = ii;
						break;
					}
				}else if(a.get(ii).get(0) == a.get(s).get(2)){
					if(a.get(ii).get(1) == a.get(s).get(1) || a.get(ii).get(1) == a.get(s).get(0)){
						a.remove(s);
						s = ii;
						break;
					}
				}
			}
			
		}
        return a;
    }
}

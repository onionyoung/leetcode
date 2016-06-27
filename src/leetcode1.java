
public class leetcode1 {
	public static void main(String[] args) {
		int[] a = new int[3];
		a[0]=2;
		a[1]=5;
		a[2]=3;
		int b[] = new int[2];
		b = twoSum(a,5);
		System.out.println(b[0]+" "+ b[1]);
    }
	public static int[] twoSum(int[] nums, int target) {
        int a[] = new int[2];
        for(int header=0; nums.length > header+1; header++){
            for(int footer=header+1; nums.length > footer; footer++){
                if(nums[header]+nums[footer] == target){
                    a[0]=header;
                    a[1]=footer;
                    return a;
                }
            }
        }
        a[0]=0;
        a[1]=0;
		return a;
    }
}

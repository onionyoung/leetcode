
public class leetcode4 {
	public static void main(String[] args) {              
		int[] nums1={5,8};
		int[] nums2 ={};//8
		System.out.println("1. " + findMedianSortedArrays(nums1,nums2) + " //5");
		
		nums1 = new int[]{};
		nums2 = new int[]{6};
		System.out.println("2. " + findMedianSortedArrays(nums1,nums2) + " //6");
		
		nums1 = new int[]{1,2};
		nums2 = new int[]{1,2};
		System.out.println("3. " + findMedianSortedArrays(nums1,nums2) + " //");
		nums1 = new int[]{1,4};
		nums2 = new int[]{2,3};
		System.out.println("4. " + findMedianSortedArrays(nums1,nums2) + " //");
		
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m1 = nums1.length / 2;
		int m2 = nums2.length / 2;
		int mid = nums1.length + nums2.length;
		mid = mid / 2;
		if(nums1.length == 0){
			if(nums2.length % 2 == 1)return nums2[m2];
			else return ( nums2[m2] + nums2[m2-1] ) / 2.0 ;
		}else if(nums2.length == 0){
			if(nums1.length % 2 == 1)return nums1[m1];
			else return ( nums1[m1] + nums1[m1-1] ) / 2.0 ;
		}
		int num1=0,num2=0;
		m1 = 0;
		m2 = 0;
		while(m1 + m2 <= mid){
			num2 = num1;
			if(m1 == nums1.length){
				num1 = nums2[m2];
				m2++;
			}else if(m2 == nums2.length){
				num1 = nums1[m1];
				m1++;
			}else{
				num1 = nums1[m1] <= nums2[m2] ? nums1[m1] : nums2[m2];
				int a = num1 == nums1[m1] ? m1++ : m2++;
			}
			
		}
		if((nums1.length + nums2.length) % 2 == 0)return (num1 + num2) / 2.0;
		return num1;
		
	}
	
}

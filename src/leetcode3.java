
public class leetcode3 {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("aaab"));
	}
	public static int lengthOfLongestSubstring(String ss) {
		String str ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ ";
		int[] num = new int[97];
		int goalnumber = 0;
		int count1 = 0,count2 = 0;
		int a;
		while(count1 < ss.length()){
			while(count1 < ss.length() && num[str.indexOf(ss.substring(count1,count1+1))] == 0){
				num[str.indexOf(ss.substring(count1,count1+1))]=count1+1;
				count1++;
			}
			if(goalnumber<(count1-count2))goalnumber = (count1-count2);
			if(count1 == ss.length())return goalnumber;
			a = num[str.indexOf(ss.substring(count1,count1+1))];
			while(count2 < a){
				num[str.indexOf(ss.substring(count2,count2+1))]=0;
				count2++;
			}
		}
        return goalnumber;
    }
} 

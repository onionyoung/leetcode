
public class leetcode7 {
	public static void main(String[] args) {
		System.out.println(reverse(0));
		System.out.println(reverse(-214783648));
    }
	public static int reverse(int x) {
		int i = 0;
		int sum = 0;
		if(x == 0)return x;
		for(;;){
			if(2147483647 < (long)sum * 10 + x % 10)return 0;
			if(-2147483647 > (long)sum * 10 + x % 10)return 0;
			sum = sum * 10 + x % 10;
			x = x / 10;
			if(x == 0)break;
		}
		return sum;
    }
}

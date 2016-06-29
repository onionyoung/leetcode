
public class leetcode11 {
	public static void main(String[] args) {
		//String str = "asd*asd*asd";
		int[] height = new int[]{1,5,1};
		System.out.println(maxArea(height));
    }
	public static int maxArea(int[] height) {
		int front = 0, rear = height.length - 1;
		int sum = 0;
		
		while(true){
			if(front == rear)break;
			if(height[front] < height[rear]){
				if(sum == 0)sum = height[front] * ( rear - front);
				if(sum < height[front] * ( rear - front)){
					sum = height[front] * ( rear - front);
				}
				front++;
			}else if(height[front] >= height[rear]){
				if(sum == 0)sum = height[rear] * ( rear - front);
				if(sum < height[rear] * ( rear - front)){
					sum = height[rear] * ( rear - front);
				}
				rear--;
			}
		}
		return sum;
        
    }
}

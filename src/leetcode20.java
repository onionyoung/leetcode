import java.util.Stack;

public class leetcode20 {
	public static void main(String[] args) {
		System.out.println(isValid(""));
	}
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		if(s.isEmpty())return false;
		for(int count = 0; s.length() > count; count ++){
			if(s.charAt(count)==')'){
				if(stack.isEmpty() || stack.pop() != '(')return false;
			}
			else if(s.charAt(count)==']'){
				if(stack.isEmpty() || stack.pop() != '[')return false;
			}
			else if(s.charAt(count)=='}'){
				if(stack.isEmpty() || stack.pop() != '{')return false;
			}
			else if(s.charAt(count)=='(' || s.charAt(count)=='[' || s.charAt(count)=='{'){
				stack.add(s.charAt(count));
			}
		}
		if(stack.isEmpty())return true;
		else return false;
    }
}

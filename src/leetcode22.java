import java.util.ArrayList;
import java.util.List;

public class leetcode22 {
	
	public static void main(String[] args) {
		generateParenthesis(3);
		
	}
	public static List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<String>();
		generateParenthesis(n, n, "", ' ');
		return null;
	
    }
	
	public static String generateParenthesis(int nL, int nR, String str, char ch){
		List<String> strList = new ArrayList<String>();
		char RParentheses = ')';
		char LParentheses = '(';
		String ss;
		if(str.isEmpty()){
			str = str + LParentheses;
			nL--;
		}else if(ch == LParentheses){
			str = str + LParentheses;
			nL--;
		}else if(ch == RParentheses){
			str = str + RParentheses;
			nR--;
		}
		ss=str;
		if(nL != 0){
			str = generateParenthesis(nL, nR, str, LParentheses);
		}
		if(nR != 0 && nL < nR){
			str = ss;
			str = generateParenthesis(nL, nR, str, RParentheses);
		}
		if(nL == 0 && nR == 0){
			System.out.println(str);
			return str;
		}
			return str;
	}
	
}

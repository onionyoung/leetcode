import java.util.ArrayList;
import java.util.List;

public class leetcode22 {
	
	static List<String> strList = new ArrayList<String>();
	public static void main(String[] args) {
		generateParenthesis(3);
		
	}
	public static List<String> generateParenthesis(int n) {
		
		generateParenthesis(n, n, "", ' ');
		return strList;
	
    }
	
	public static String generateParenthesis(int nL, int nR, String str, char ch){
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
			strList.add(str);
			return str;
		}
			return str;
	}
	
}

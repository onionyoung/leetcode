
public class leetcode6 {
	public static void main(String[] args) {
		String str = "";
		//convert(str, 3);
		System.out.println(convert(str, 3));
		/*
		 * P   A   H   N
		 * A P L S I I G
		 * Y   I   R
		 * 
		 * */
		/*
		 * P     I     N
		 * A   L S   I G
		 * Y A   H R
		 * P	 I
		 * */
    }
	public static String convert(String s, int numRows) {
		if(s.length() == 0 || s.length() == 1)return s;
		if(numRows == 1)return s;
		int count = 1;
		int len = (s.length() - 1) / (numRows -1) +1;
		char[][] s1 = new char[len][numRows];
		count = 1;
		// - , 0 , 0 , 0 , 0 , 
		for(int col = 0; ; ){
			for(int i = 1; i < numRows; i++){
				s1[col][i] = s.charAt(count);
				count++;
				if(count == s.length())break;
			}
			if(count == s.length())break;
			col++;
			for(int j = numRows-2; j >= 0; j--){
				s1[col][j] = s.charAt(count);
				count++;
				if(count == s.length())break;
			}
			if(count == s.length())break;
			col++;
		}
		
		//s1[0][1] = 'a';
		/*System.out.println(s1[0][0]);
		System.out.println(s1[0][1]);
		System.out.println(s1[0][2]);
		System.out.println(s1[1][0]);
		System.out.println(s1[1][1]);
		System.out.println(s1[1][2]);
		System.out.println(s1[2][0]);
		System.out.println(s1[2][1]);
		System.out.println(s1[2][2]);*/
		char  ch ;
		String a = "" + s.charAt(0);
		
		for(int i = 0, j = 0; j < numRows; j++){
			for(i = 0; i < len ;i++){
				ch = s1[i][j];
				if(ch != '\0')
					a = a + s1[i][j];
			}
			//System.out.println();
		}
		
        return a;
    }
}

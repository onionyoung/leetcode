
public class leetcode5 {
	public static void main(String[] args) {
		//System.out.println(longestPalindrome("aatttvvtttaa"));
		//System.out.println(longestPalindrome("aaaaaa"));
		System.out.println(longestPalindrome("aaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllmmmmmmmmmmnnnnnnnnnnooooooooooppppppppppqqqqqqqqqqrrrrrrrrrrssssssssssttttttttttuuuuuuuuuuvvvvvvvvvvwwwwwwwwwwxxxxxxxxxxyyyyyyyyyyzzzzzzzzzzyyyyyyyyyyxxxxxxxxxxwwwwwwwwwwvvvvvvvvvvuuuuuuuuuuttttttttttssssssssssrrrrrrrrrrqqqqqqqqqqppppppppppoooooooooonnnnnnnnnnmmmmmmmmmmllllllllllkkkkkkkkkkjjjjjjjjjjiiiiiiiiiihhhhhhhhhhggggggggggffffffffffeeeeeeeeeeddddddddddccccccccccbbbbbbbbbbaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllmmmmmmmmmmnnnnnnnnnnooooooooooppppppppppqqqqqqqqqqrrrrrrrrrrssssssssssttttttttttuuuuuuuuuuvvvvvvvvvvwwwwwwwwwwxxxxxxxxxxyyyyyyyyyyzzzzzzzzzzyyyyyyyyyyxxxxxxxxxxwwwwwwwwwwvvvvvvvvvvuuuuuuuuuuttttttttttssssssssssrrrrrrrrrrqqqqqqqqqqppppppppppoooooooooonnnnnnnnnnmmmmmmmmmmllllllllllkkkkkkkkkkjjjjjjjjjjiiiiiiiiiihhhhhhhhhhggggggggggffffffffffeeeeeeeeeeddddddddddccccccccccbbbbbbbbbbaaaa"));
		//System.out.println(longestPalindrome("jglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdttxfqmgksrkyvopwprsgoszftuhawflzjyuyrujrxluhzjvbflxgcovilthvuihzttzithnsqbdxtafxrfrblulsakrahulwthhbjcslceewxfxtavljpimaqqlcbrdgtgjryjytgxljxtravwdlnrrauxplempnbfeusgtqzjtzshwieutxdytlrrqvyemlyzolhbkzhyfyttevqnfvmpqjngcnazmaagwihxrhmcibyfkccyrqwnzlzqeuenhwlzhbxqxerfifzncimwqsfatudjihtumrtjtggzleovihifxufvwqeimbxvzlxwcsknksogsbwwdlwulnetdysvsfkonggeedtshxqkgbhoscjgpiel"));
		//System.out.println(longestPalindrome("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"));
	}
	public static String longestPalindrome(String s) {
		int length = s.length();
        if(length>2){
        	String a = find(s);
        	if(a != null)return a;
        }else if(length == 2){
        	if(s.charAt(0) == s.charAt(1))return s;
        	else return null;
        }else if(length == 1) return s;
        for(int count = 0; count + 1 < length ;count++){
        	if(s.charAt(count) == s.charAt(count + 1))return s.substring(count,count+2);
        }
        return null;
    }
	public static String find(String s){
		int length = s.length();
		int ii = 0;
		String goal = "";
		if(s.charAt(0) == s.charAt(1)){
    		if(s.charAt(1) != s.charAt(2))goal = s.substring(0,2);
    	}
		//caaba aa aaaac 11
		for(int count = 1;count + 1 < length ;count++){
			for(int i = 0;i + count + 1< length;i++){
				if(s.charAt(i + count) != s.charAt(i + count + 1) ){
					if(i == 0)break;
					else {
						ii = (i-1) / 2 ;
						System.out.println(ii);
						count = count + (i-1) / 2 ;
					}
					break;
				}
			}
			///    <-aa->
			
				
			if(s.charAt(count) == s.charAt(count + 1)){
				String str;
				str= s.substring(count,count+2);
				if(str.length() > goal.length())goal = str;
				for(int n = 1;count - n >= 0 && count + n + 1< length; n++){
					if(ii != 0){
						n = ii ;
						ii = 0;
					}
					if(s.charAt(count - n ) == s.charAt(count + n + 1)){
						str = s.substring(count-n,count + n + 2);
						if(str.length() > goal.length())goal = str;
					}else break;
				}
			}
			///    <-a->
			for(int n = 1;count - n >= 0 && count + n < length; n++){
				if(ii != 0){
					n = ii;
					ii = 0;
				}
				if(s.charAt(count - n ) == s.charAt(count + n)){
					String str;
					str = s.substring(count-n,count+n+1);
					//System.out.println(count +" "+ n + "**" + str);
					if(str.length() > goal.length()){
						goal = str;
						//System.out.println(goal);
					}
				}else break;
			}
			if(ii!=0){
				count = count + ii ;
				ii = 0;
			}
			
		}
		if(goal != null)return goal;
		s = null;
		return s;
	}
}

package general;

public class deleteContinueSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "China     space  apple       orange pear";
		String res = deleteSpaces(s);
		
		//for (char c : res) {
			System.out.print(res);
		//}
	}
	
	public static String deleteSpaces(String s) {
		char[] res = s.toCharArray();
		
		int idx = 0;
		for (int i = 0; i < res.length; i++) {
			if (res[i] == ' ' && res[i + 1] == res[i]) {
				while (res[i] == ' ') {
					i++;
				}
				i--;
			}
			
			res[idx++] = res[i];
		}
		
		return String.copyValueOf(res, 0, idx);
	}

}

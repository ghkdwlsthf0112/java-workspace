package quiz;

public class C01_FunctionQuiz2 {
	
	 //	1. 실행하면 영어 대문자만으로 이루어진 4자리 임시 비밀번호를 생성하여 반환해주는 함수
		public static String getRandompassWord () {
			String pwd = "";
			
			for (int i = 0; i < 4; ++i) {
				pwd += (char)(Math.random() * 26 + 'A');
			}
			return pwd;
		}
	
	 //	2. 문자열을 전달하면 해당 문자열을 마구 뒤섞은 문자열을 반환해주는 함수
		public static String shuffleText(String text) {
			// "", text.toCharArray() : 
			char[] arr = text.toCharArray();
			
			for (int i = 0; i < 1000; ++i) {
				int ranIndex = (int)(Math.random() * (arr.length - 1) + 1);
				
				char temp = arr[0];
				arr[0] = arr[ranIndex];
				arr[ranIndex] = temp;
			}
			
			// char[]을 재료로 전달하여 새 문자열을 생성한다
			// new String(arr);
			String shuffled = "";
			
			for (int i = 0; i < arr.length; ++i) {
				shuffled += arr[i];
			}
			return shuffled;
		}
	
	 //	3. 문장열을 전달하면 해당 문자열의 대소문자를 반전시킨 문자열을 반환해주는 함수
	 	public static String inverse(String text) {
	 		String result = "";
	 		
	 		for (int i = 0; i < text.length(); ++i) {
	 			char ch = text.charAt(i);
	 			
	 			if (ch >= 'A' && ch <= 'Z') {
	 				result +=  (char)(ch + ('a' - 'A'));
	 			} else if (ch >= 'a' && ch <= 'z') {
	 				result +=  (char)(ch - ('a' - 'A'));
	 			} else {
	 				result += ch;
	 			}
	 		}
	 		return result;
	 	}
		
	 //	4. 문자열 전달하묜 해당 문자열이 숫자로만 이루어져있는지 여부를 알려주는 함수
	 	public static boolean isNumeric(String text) {
	 		// 숫자가 아닌게 하나라도 나오면 바로 return false
	 		for (int i = 0; i < text.length(); ++i) {
	 			char ch = text.charAt(i);
	 			if(ch < '0' || ch > '9') {
	 				return false;
	 			}
	 		}
	 		return true;
	 	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; ++i) {
			System.out.println(getRandompassWord());
		}	
		
		System.out.println(shuffleText("고르곤졸라피자"));
		
		System.out.println(inverse("Hello, world!!"));
		System.out.println(inverse("Godd Morning!!"));
		
		System.out.println(inverse("숫자로만 되어있나요? " + isNumeric("1234567")));
		System.out.println(inverse("숫자로만 되어있나요? " + isNumeric("1234567a")));
	}
}

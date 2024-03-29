package quiz;

import java.util.Scanner;

public class B08_Numeric {
	
	/*
	 	사용자가 입력한 문자열이 모두 숫자로만 구성된 문자열인지
	 	판별하는 프로그램을 만들어보세요
	 	
	 	>> a1234
	 	-> 모두 숫자인 문자열이 아닙니다
	 	
	 	>> 4123532890
	 	-> 모두 숫자인 문자열입니다
	 	
	 	방법1 : 숫자의 개수를 센다, 문자열의 길이와 숫자의 개수가 같으면 모두 숫자
	 	
	 	방법2 : 하나씩 보면서 숫자가 아닌게 하나라도 등장하면 모두 숫자가 아님(검사 그만)
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">>");
		String str = sc.next();
		
		String reult = "";
		
		boolean onlyNumber = true;
		
		// 한 문자씩 검사하다가 숫자가 아닌것이 발견되면 onlyNumber를 false로 바꾼다
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			
			
			if ( ch < '0' || ch > '9') {
				onlyNumber = false;
				break;
			}
		}
		
		if (onlyNumber) {
			System.out.println("숫자로만 이루어진 문자열입니다");
		} else {
			System.out.println("숫자로만 이루어지지 않았습니다");
		}
		
		
	}

}

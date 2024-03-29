
public class A02_Variable {

	/*
	  #변수 : 값을 넣어놓는 공간
	  
	  -프로그래밍 언어에서 데이터를 저장해 둘 수 있는 공간
	  -변수에 어떤 데이터를 보관할 것 인지 타입을 지정해야 한다
	 */
	public static void main(String[] args) {
		/* 
		 
		  # 변수의 선언
		  
		  -타입과 변수명을 적어 앞으로 해다 변수를 사용하겠다고 선언한다
		  -타입은 저장하고 싶은 타입을 지정하고 변수명은 사용하고 싶은 이름을 적는다
		  -한 {}안에서는 같은 이름의 변수를 여러번 선언할 수 없다
		  
		  # 대입 연산 (=)
		  
		  -원래 알고 있던 =의 의미: 왼쪽과 오른쪽의 값이 같다
		  -왼쪽에 있는 변수에 오른쪽에 있는 값에 넣어라  
		  
		 */
	//변수명은 num이고, 숫자만 넣겠다
		int num;
		
		num = 123;
		
		// () 안에 전달한 것을 콘솔에 출력
		System.out.println(num);
		
		String food; // 변수 선언
		food = "햄버거"; //변수에 값을 대입
		food = "짜장면"; //추가로 대입하면 원래 있던 값은 사라진다
		
		// int : 나는 정수를 지정하겠다 (타입 지정)
		int age = 30; // 변수 선언과 동시에 값을 대입
		
		// String : 나는 문자열을 지정하겠다
		String name ="김철수"; // 변수 선언과 동시에 값을 대입
		
		System.out.println(age);
		System.out.println(name);
		
		System.out.println(age - 10);
		System.out.println(age);
		System.out.println(age + 10);
		
		//값을 한번도 넣은적 없는 변수는 사용할 수 없다
		//선언한 변수에 최초로 값을 넣는 것을 초기화한다
		//int apple
		int apple;
		
		System.out.println("사과는 총 " + (apple = 7) + "개 입니다");
		
		// 변수를 선언히는 방식
		
		// (1) 선언만 하는 경우 (초기화 x)
		int x;
		
		// (2) 선언과 동시에 초기화
		int y = 10;
				
	    // (3) 같은 타입 변수를 한번에 여러개 선언하는 경우 (초기화 x)
		int a, b, c;
		String snack1, snack2, snack3;
		
		// (4) 같은 타입 변수를 여러개 선언하면서 동시에 초기화
		String snack4 = "쿠크다스" , snack5 = "초코파이" , snack6 = "초코하임";
		
	}
}

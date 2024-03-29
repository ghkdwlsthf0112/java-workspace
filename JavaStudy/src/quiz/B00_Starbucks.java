package quiz;

import java.util.Scanner;

public class B00_Starbucks {

	public static void main(String[] args) {

		/*
		 - 커피 3개의 개수를 입력받고 각 메뉴를 몇 잔 시켰는지 총 가격은 얼마인지 출력해주는 프로그램을 만들어보세요
		 - 아메리카노 - 1600원, 카페라떼 - 2700원, 카페모카 - 3300원
		*/

		Scanner sc = new Scanner(System.in);

		int CANO_PRICE = 1600;
		int LATTE_PRICE = 2700;
		int MOCHA_PRICE = 3300;

		System.out.println("아메리카노 몇 잔? ");
		int canoCount = sc.nextInt();
		System.out.println("카페라떼 몇 잔? ");
		int latteCount = sc.nextInt();
		System.out.print("카페모카 몇 잔? ");
		int mochaCount = sc.nextInt();

		String format = "아메리카노 - %d잔\n" + "카페라떼 - %d잔\n" + "카페모카 - %d잔\n" + "-----------------\n" + "총합\t%d￦\n";

		int totalPrice = canoCount * CANO_PRICE + latteCount * LATTE_PRICE + mochaCount * MOCHA_PRICE;

		System.out.printf(format, canoCount, latteCount, mochaCount, totalPrice);
	}

}

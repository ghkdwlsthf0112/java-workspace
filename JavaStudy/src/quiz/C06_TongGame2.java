package quiz;

import java.util.Scanner;

import myobj.tong.TongGame;

public class C06_TongGame2 {
	
	/*
	 	통아저씨 게임을 만들어보세요
	 	
	 	(1) 게임이 시작되면 꽝 자리가 정해진다
	 	
	 	(2) 플레이어는 아저씨가 발사될때까지 계속 자리를 선택해야 한다
	 	
	 	(3) 칼을 찌를 수 있는 홈은 20개가 있고 그 중 4개가 꽝이 된다
	 		(꽝의 위치는 매 판마다 랜덤으로 재설정되어야 한다)
	 		
	 		1. 폭탄인 경우(찌르면 터짐)
	 		2. 폭탄이 아닌 일반 구멍인 경우 (지르ㅕㅁㄴ 다음 턴으로 넘러감)
	 		3. 찔렀던 구멍인 경우 (다시 찌르면 안됨)
	 		
	 	(4) 아저씨가 발사되면 몇 번 만에 발사되었는지 알려주는 메세지가 나온다
	*/
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			TongGame g1 = new TongGame();
			g1.play();
			
			System.out.println("더 하시겠습니까? (Y/N) ");
			if (sc.next().charAt(0) == 'N') {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다");
	}

}

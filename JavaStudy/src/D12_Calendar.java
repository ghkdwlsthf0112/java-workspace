import java.util.Calendar;
import java.util.Date;

public class D12_Calendar {

	/*
	 	# java.utul.Calender
	 	
	 	- 달력을 구현한 클래스
	 	- 날짜 및 시간을 손쉽게 계산할 수 있는 기능들이 많이 있다
	 	- 추상클래스이기 때문에 생성자를 사용할 수 없고
	 	  getInstance()라는 스태틱 메서드에서 현재 시간의 인스턴스를 받아올 수 없다	 	
	 */
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		System.out.println(now);
		
		// get(fieldNumber) : 헤당 캘린더 인스턴스로부터 원하는 항목의 값을 가져온다
		
		// 필드에 해당하는 번호는 캘린더 클래스의 상수로 지정되어있다
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.HOUR));
		System.out.println(now.get(Calendar.HOUR_OF_DAY));
		System.out.println(now.get(Calendar.MILLISECOND));
		
		// MINTH는 1감소된 값으로 나오므로 주의해야 한다
		System.out.println(now.get(Calendar.MONTH));
		
		// MINTH 상수가 1감소되어 있다 (1월이 0)
		System.out.println(now.get(Calendar.JANUARY));
		System.out.println(now.get(Calendar.SEPTEMBER));
		System.out.println(now.get(Calendar.OCTOBER));

		// DAY_OF_WEEK : 요일
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
		
		// 요일 관련 상수 (일요일 1, 토요일 7)
		System.out.println(now.get(Calendar.SUNDAY));
		System.out.println(now.get(Calendar.MONDAY));
		System.out.println(now.get(Calendar.SATURDAY));
		
		// calendar.getTime() ; Calendar에서  Date타입 인스턴스를 꺼내기
		Date date = now.getTime();
		System.out.println(date);

		// cal.set(fieldNumber, value) :
		// 캘린더 인스턴스 시간 변경하기, 
		now.set(Calendar.HOUR, 35);
		
		System.out.println(now.getTime());

		
		// cal.add(fieldNumber, value) : 캘린더 인스턴스에 시간 추가하기
		// : 캘린더 인스턴스에 시간 추가하기, 다른 필드들도 알맞게 수정된다
		now.add(Calendar.HOUR, 300);

		System.out.println(now.getTime());
		
		// 헷갈려서
		now = Calendar.getInstance();

		// 캘린더의 필드들
		System.out.println("년: " + now.get(Calendar.YEAR));
		System.out.println("월: " + now.get(Calendar.MONTH));
		System.out.println("일: " + now.get(Calendar.DATE));
		
		System.out.println("이번달의 며칠인가: "
				+ now.get(Calendar.DAY_OF_MONTH));
		System.out.println("이번년의 며칠인가: " 
				+ now.get(Calendar.DAY_OF_YEAR));
		System.out.println("이번주의 며칠인가(요일): " 
				+ now.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("이번달의 몇 주인가: " 
				+ now.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이번달의 몇 번째 요일인가: " 
				+ now.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println("오전/오후: " + now.get(Calendar.AM_PM));
		System.out.println("시: " + now.get(Calendar.HOUR));
		System.out.println("시(24): " + now.get(Calendar.HOUR_OF_DAY));
		System.out.println("분: " + now.get(Calendar.MINUTE));
		System.out.println("초: " + now.get(Calendar.SECOND));
		System.out.println("밀리초: " + now.get(Calendar.MILLISECOND));
	}
}

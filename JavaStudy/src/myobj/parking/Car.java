package myobj.parking;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Car {
	String carNum;
	String carType;
	LocalDateTime entryTime;
	LocalDateTime exitTime;

	// SimpleDateFormat - java
//	private static SimpleDateFormat parkTimeFomat =
//			new SimpleDateFormat ("MM-dd(e)/HH:mm");
	
	private static DateTimeFormatter parkTimeFomat =
			DateTimeFormatter.ofPattern ("MM-dd(E)/HH:mm");
	
	public Car(String carNum, String carType, 
			LocalDateTime entryTime, LocalDateTime exitTime) {
		this.carNum = carNum;
		this.carType = carType;
		this.entryTime = entryTime;
		this.exitTime = exitTime;
	}
	
	@Override
	public String toString() {
		return String.format("[%s/%s/%s/%s]",
				carNum,
				carType,
				entryTime.format(parkTimeFomat),
				exitTime.format(parkTimeFomat));
	}
}

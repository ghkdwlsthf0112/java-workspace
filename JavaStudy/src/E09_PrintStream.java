import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class E09_PrintStream {

	/*
	 	#
	 	
	 	- 문자를 훨씬 편리하게 출력할 수 있는 기능을 가지고 있는 클래스
	 	- println(), printf() print() 등을 사용할 수 있다
	 	- BufferedOutputStream, BufferedWriter -> 성능 증가
	 	- PrintStream, PrintWriter -> 편리함 증가
	 */
	public static void main(String[] args) {
		// PrintWriter에 출력하기
		try (
			FileWriter fout = new FileWriter(new File("mtfiles/print.txt"));
			BufferedWriter bout = new BufferedWriter(fout);
			PrintWriter out = new PrintWriter(bout);	
		) {
			out.printf("%s는 %d원입니다. \n", 000);
			out.println("Hello, world!");	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

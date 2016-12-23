package testJavaf;

import java.time.LocalDate;

public class LocalDateTest {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = today.plusDays(1);
		
		System.out.println("today="+today+", tomorrow="+tomorrow);
		
		System.out.println(today.compareTo(tomorrow));
		
		
	}
}

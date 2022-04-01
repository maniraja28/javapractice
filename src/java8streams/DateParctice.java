package java8streams;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateParctice {

	public static void main(String[] args) {

		// one of the java 8 feature Date API application programing interface

		LocalDate date = LocalDate.now();//LocalDate date = new LocalDate.now();

		System.out.println(date);//System.out.println(date);

		LocalTime time = LocalTime.now();//LocalTime time = new LocalTime();
		

		System.out.println(time);//System.out.println(time);

		LocalDateTime ldt = LocalDateTime.now();//LocalDateTime ldt = new LocalDateTime.now();

		System.out.println(ldt);//sout(ldt);
		LocalTime Time = LocalTime.now();
		System.out.println();
	}
}

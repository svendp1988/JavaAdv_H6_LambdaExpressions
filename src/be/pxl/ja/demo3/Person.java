package be.pxl.ja.demo3;

import java.time.LocalDate;
import java.time.Period;

public class Person {

	private String name;
	private LocalDate dateOfBirth;

	public Person(String name, LocalDate dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {

		class PersonHelper {

			public int getAge() {
				return Period.between(dateOfBirth, LocalDate.now()).getYears();
			}
		}
		return new PersonHelper().getAge();
	}


}


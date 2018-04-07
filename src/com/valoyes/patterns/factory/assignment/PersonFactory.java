package com.valoyes.patterns.factory.assignment;

public class PersonFactory {

	public static Person create(PersonTypeEnum type) {
		
		Person person = null;
		
		if(PersonTypeEnum.MALE == type) {
			person = new Male();
		}else {
			person = new Female();
		}
		
		person.wish();
		
		return person;
	}
}

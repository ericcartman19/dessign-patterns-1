package com.valoyes.patterns.factory.assignment;

public class PersonStore {

	public static void main(String[] args) {
		PersonFactory.create(PersonTypeEnum.MALE);
	}
}

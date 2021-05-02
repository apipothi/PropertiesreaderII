package com.apipothi.propertiesreader.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Bookservice {

	
	
	@Value("${apipothi.bookdescription : My Default API POTHI VALUE }")
	private String defaultbookDescription;

	@Value("${apipothi.bookid : 11 , 12 , 13 , 14 , 15 , 16 , 17 }")
	private int[] bookid;

	@Value("${apipothi.bookprice : 100 , 200 , 300 , 400 , 500}")
	private List<Integer> bookprice;

	@Value("${apipothi.booksname : APIPOTHIJAVA , APIPOTHIJAVA9 , APIPOTHIREST , APIPOTHISPRING , APIPOTHIPYTHON}")
	private Set<String> bookname;

	@Value("#{${apipothi.bookswithprice : {APIPOTHIJAVA: '90', APIPOTHIJAVA9: '91', APIPOTHISPRING: '92', APIPOTHIPYTHON:'93'}}}")
	Map<String, Integer> bookswithprice;

	@Value("${apipothi.booknotabalable : false}")
	private boolean booknotabalable;

	public void getDefaultDataFromProperties() {

		System.out.println("START***-Bookservice-getDefaultDataFromProperties() -***");

		System.out.println("Book Description As String -> " + defaultbookDescription);
		System.out.println("Book Id As int Array -> " + Arrays.toString(bookid));
		System.out.println("Book Price As int List -> " + bookprice);
		System.out.println("Book Name As int Set -> " + bookname);

		System.out.println("Book Name with Price As MAP -> " + bookswithprice);
		System.out.println("Book is there as Boolean -> " + booknotabalable);

		System.out.println("END***-Bookservice-getDefaultDataFromProperties() -***");
	}

}

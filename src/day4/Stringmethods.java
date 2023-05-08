package day4;

public class Stringmethods {

	public static void main(String[] args) {
		// types of string methods
		//length;returns length of string
		//concat;join 2 0r more the strings
		//equals;comapre the string
		//equalsignorecase;compare string values without case sensitivity
		//contains;check a string contains in another string-bollen value
		//substring;extracting substring from main string
		//replace;replacing char/string
		//examples
		//1.length
	//	String s="manasa";
//System.out.println(s.length());
		//2.concatenation
		String s1="Manasa";
		String s2="manasa";
	//	System.out.println(s1+s2);oneway
		//System.out.println("manasa"+"sadasiva");otherway
		//System.out.println(s1.concat(s2));otherway
		//System.out.println("manasa".concat("sadasiva"));
		//3.equals
		//System.out.println(s1.equals(s2));false
		//4.equalsignorecase
	//	System.out.println(s1.equalsIgnoreCase(s2));//true
		//5.contains
	//	System.out.println(s1.contains("Ma"));//case sensitive boolenvalue
	//	System.out.println(s1.contains("xy"));
	//	6.substring staring index ending index
	//	System.out.println(s1.substring(0,3));
		//7.Replace
		System.out.println(s2.replace("manasa", "sadasiva"));
	}

}


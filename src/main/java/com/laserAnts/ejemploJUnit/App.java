package com.laserAnts.ejemploJUnit;

/**
 * Hello world!
 *
 */
public class App {
	
	public static String returnGrades(final Integer nota) {
		if(nota < 60) {
			return "F";
		}else if(nota < 70) {
			return "D";
		}else if(nota < 80) {
			return "C";
		}else if(nota < 90) {
			return "B";
		}else if(nota < 100) {
			return "A";
		}
		return "";
	}
	
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
    }
}

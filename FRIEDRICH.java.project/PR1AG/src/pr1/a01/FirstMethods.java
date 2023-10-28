package a01;

import java.io.PrintWriter;

public class FirstMethods {

	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		
		printDecorated(out, "20.10.: Aufgabe 1");
		
		value(1);						//Aufruf eventuell hier nicht benötigt, da diese Methode in der Folge-Methode verwendet wird.
		printValue(out, 1);
		
		flaecheSiebeneck(1);			//Aufruf eventuell hier nicht benötigt, da diese Methode in der Folge-Methode verwendet wird.
		printFlaecheSiebeneck(out, 1);
		
		out.flush();
	}
	
	public static void printDecorated(PrintWriter out, String textA01) {
		out.println("***************");
		out.println(textA01);
		out.println("***************");
	}
	
	public static int value(int a) {
		int calc = (a+1+5+7)*9-a;
		return calc;
	}
	
	public static void printValue(PrintWriter out, int a) {
		out.println(value(1));
	}
	
	//Quelle der Formel: https://rechneronline.de/pi/siebeneck.php
	public static double flaecheSiebeneck(double a) {
		double calcSiebenenck = (7*a*a)/(4*Math.tan(Math.PI/7));
		return calcSiebenenck;
	}
	
	public static void printFlaecheSiebeneck(PrintWriter out, double a) {
		out.println(flaecheSiebeneck(a));
	}
}















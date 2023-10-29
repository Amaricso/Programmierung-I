package test;

import java.io.PrintWriter;

public class FirstMehtodCallExamples {
	
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		out.println("Start");
		out.println("......");
		printGruss();
		out.println("......");
		numberPlay();
		out.println("......");
		double m = mittelwert(5.2, 10.4);
		out.print("mittelwert(5.2, 10.4) ist: ");
		out.println(m);
		out.println("ENDE");
		out.flush();
	}
	
	public static void printGruss() {
		PrintWriter out = new PrintWriter(System.out);
		out.println("Mit freundlichen Grüßen");
		out.println("Herbert Hufeisen");
		out.flush();
	}
	
	public static void numberPlay() {
		PrintWriter out = new PrintWriter(System.out);
		double a = 3.0;
		double b = 4.0;
		double c = Math.sqrt(a*a+b*b);
		out.println("rechtwinkliges Dreieck: ");
		out.print(a);
		out.print(", ");
		out.print(b);
		out.print(", ");
		out.print(c);
		out.println();
		out.flush();
	}
	
	public static double mittelwert(double a, double b){
		double meanvalue = (a+b)/2;
		return meanvalue;
	}
		
	
}

	


package uebungen;

import java.io.PrintWriter;

public class ErsteEinfacheRechnungen {

	public static void main(String[] args) {
		intDemo();
		doubleDemo();
	}
	
	public static void intDemo() {
		PrintWriter out = new PrintWriter(System.out);
		out.println("IntDemo Start: ");
		
		int a = 9;
		out.print("a: ");
		out.println(a);
		
		int b = 4;
		out.print("b: ");
		out.println(b);
		
		double teilen = (double) a/b;
		out.print("a/b: ");
		out.println(teilen);
		
		int modulo = a%b;
		out.print("a%b: ");
		out.println(modulo);
		
		int berechnung = (103*b+74/9)*(7%3);	
		out.print("(103*b+74/9)*(7%3): ");
		out.println(berechnung);
		
		out.println("IntDemo End");
		out.println();
		
		out.flush();
	}
	public static void doubleDemo() {
		PrintWriter out = new PrintWriter(System.out);
		out.println("DoubleDemo Start:");
		
		double a = 9.9;
		out.print("a: ");
		out.println(a);
				
		double b = 4.4;
		out.print("b: ");
		out.println(b);
		
		double teilen = a/b;
		out.print("a/b: ");
		out.println(teilen);
		
		double formel1 = Math.sqrt(a*b+74.9);
		out.print("Math.sqrt(a*b+74.9): ");
		out.println(formel1);
		
		double formel2 = a*Math.sin(2*Math.PI*b);
		out.print("a*Math.sin(2*Math.PI*b): ");
		out.println(formel2);
		
		out.println("DoubleDemo End");
		
		out.flush();
	}
}

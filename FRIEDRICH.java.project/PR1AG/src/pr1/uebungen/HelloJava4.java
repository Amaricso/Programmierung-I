package test;

import java.io.PrintWriter;

public class HelloJava4 {

	public static void main(String[] args) {
		printGreeting();
	}
	
	public static void printGreeting() {
		PrintWriter out = new PrintWriter(System.out);
		System.out.println("Hello Java");
		System.out.println("4. Version");
		out.flush();
	}
}

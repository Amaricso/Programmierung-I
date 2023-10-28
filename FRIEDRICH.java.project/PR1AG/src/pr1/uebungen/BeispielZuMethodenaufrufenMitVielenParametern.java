package test;

import java.io.PrintWriter;

public class BeispielZuMethodenaufrufenMitVielenParametern {

	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		
		out.println("START");
		out.println("---------------");
		gruesse(out, "Mit freundlichen Gruessen", "Herbert Hufeisen");
		out.println("---------------");
		
		dreieck(out, 3, 4);
		out.println("---------------");
		
		printMittelwert(out, 5.2, 10.4);
		
		out.print("ENDE");
		
		out.flush();
	}	
		public static void gruesse (PrintWriter out, String mfg, String name) {
			
			out.println(mfg);
			out.println(name);
		}
		
		public static void dreieck(PrintWriter out, double a, double b) {
			out.println("rechtwinkliges Dreieck:");
			out.print(a);
			out.print(", ");
			out.print(b);
			out.print(", ");
			out.println(Math.sqrt(a*a+b*b));
		}
		
		public static double mittelwert(double a, double b) {
			double meanvalue = (a+b)/2;
			return meanvalue;
		}
		public static void printMittelwert(PrintWriter out, double a, double b) {
			out.print("mittelwert(");
			out.print(a);
			out.print(", ");
			out.print(b);
			out.print(") ist: ");
			out.println(mittelwert(a, b));
		}
}

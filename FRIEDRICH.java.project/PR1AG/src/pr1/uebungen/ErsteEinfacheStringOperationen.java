package test;

import java.io.PrintWriter;

public class ErsteEinfacheStringOperationen {
	static public void main(String[] args) {
		stringBuildingDemo();
		stringMutationDemo();
	}
	
	static public void stringBuildingDemo() {
		PrintWriter out = new PrintWriter(System.out);
		
		//using other strings
		out.println("building a String using other strings:");
		String gruss = "Sehr geehrte";
		String gender = "Frau";
		String name = "Maier,";
		String text = gruss + " " + gender + " " + name;
		out.println(text);
		
		//using StringBuilder
		StringBuilder sb = new StringBuilder();
		String BLANK = " ";
		sb.append("Sehr");
		sb.append(BLANK);
		sb.append("geehrte");
		sb.append(BLANK);
		sb.append("Frau");
		sb.append(BLANK);
		sb.append("Maier");
		out.println();
		out.println("building a String using StringBuilder:");
		out.println(sb.toString());
		
		//using characters
		sb = new StringBuilder();
		for (char c='a'; c < 'z'; c++) {
			sb.append(c);
			sb.append(BLANK);
		}
		out.println();
		out.println("Alphabet:");
		out.println(sb.toString());
		
		out.flush();
	}
	static public void stringMutationDemo() {
		PrintWriter out  = new PrintWriter(System.out);
		
		String muchSpace = ("The    implementation    was    adapted    from    ...");
		out.print("muchSpace: ");
		out.println(muchSpace);
		
		String stripped = muchSpace.strip();
		out.print("stripped: ");
		out.println(stripped);
		
		String condensed = stripped.replaceAll("[\s]+", " ");
		out.print("condensed: ");
		out.println(condensed);
		
		String firstLetters = condensed.substring(0, 18);
		out.print("davon die 18 Zeichen: ");
		out.println(firstLetters);
		
		String replace = firstLetters.replace("implementation", "neu");
		out.print("ersetzt: ");
		out.println(replace);
		
		out.flush();
	}
}






















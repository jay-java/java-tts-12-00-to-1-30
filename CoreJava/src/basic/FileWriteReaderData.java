package basic;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteReaderData {
	public static void main(String[] args) throws IOException {
		FileWriter fr = new FileWriter("t2.txt");
		String s = "this msg will stored in file";
		fr.write(s);
		fr.flush();
		fr.close();
		System.out.println("done");
		
		FileReader f = new FileReader("t2.txt");
		int i;
		while(( i = f.read())!=-1) {
			System.out.print((char)i);
		}
		
	}
}

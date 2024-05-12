package tp582;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ex1 {
	public static void main(String[] args) throws IOException {
		File inputFile = new File("D:\\fichiers\\in.txt");
		File outputFile = new File("D:\\fichiers\\out.txt");
		FileReader in=new FileReader(inputFile) ;
		FileWriter out=new FileWriter(outputFile);
		BufferedReader br=new BufferedReader(in);
		BufferedWriter bw=new BufferedWriter(out);
		String line;
		while((line= br.readLine())!=null)
		{
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
		}
	
}

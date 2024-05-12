package tp582;

import java.io.BufferedReader;
import java.io.File; 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class TestCopy {
public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Entrez le login : ");
    String login = scanner.nextLine();
    System.out.print("Entrez le mot de passe : ");
    String password = scanner.nextLine();



    try {
        BufferedReader bf= new BufferedReader(new FileReader("C:\\fichiers\\in.txt"));
        String line;
       while ((line=bf.readLine())!=null) 
       {
           String [] s=line.split("/");
           if(s.length==2 && s[0].equals(login)&&s[1].equals(password))
           {
               System.out.println("validee");
               return ;
           }
       }
       System.out.println("non validee");

    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
import java.io.*;
public class FileEx1 {

	public static void main(String[] args) throws IOException {
	File f=new File ("C://Z.java");
	PrintWriter pw=new PrintWriter(f);
	pw.println("class Student");
	pw.print("ok");
	pw.close();
	FileReader obj=new FileReader (f);
	BufferedReader bf=new BufferedReader (obj);
	String s=bf.readLine();
	while (s!=null)
	{
		System.out.println(s);
		s=bf.readLine();
	}

	}

}

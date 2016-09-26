package ioexam;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ioexam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File filename1;
		File filename2;
		
		FileReader fr;
		FileWriter fw;
		
		try{
			filename1=new File("prac01.txt");
			filename2=new File("afterpract01.txt");
			fr=new FileReader(filename1);
			fw=new FileWriter(filename2);
			//String a="";
			int data;
			
			while((data=fr.read())!=-1)
			{
				fw.write((char)data);
				//a=a+(char)fr.read();
			}
			
			fr.close();
			fw.close();
			
		}catch(IOException ex)
		{
			ex.printStackTrace();
			System.out.println("오류입니다");
		}

	}

}

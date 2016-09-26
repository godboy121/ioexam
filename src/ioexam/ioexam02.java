package ioexam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ioexam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		FileOutputStream fow=null;
		InputStreamReader isr=null;
		OutputStreamWriter isr1=null;
		try{
			fis=new FileInputStream("./src/ioexam/prac02.txt");
			fow=new FileOutputStream("afterprac0101.txt");
			isr=new InputStreamReader(fis,"MS949");
			isr1=new OutputStreamWriter(fow, "MS949");
			int data;
			while((data=isr.read())!=-1)
			{
				System.out.print((char)data);
				fow.write((char)data);
			}
		}catch(IOException ex)
		{
			System.out.println("오류입니다");
		}finally{
			try{
				isr.close();
				isr1.close();
			}catch(IOException e)
			{
				System.out.println("오류입니다");
			}
		}
		

	}

}

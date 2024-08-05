package com.techlabs.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadingTest {

	public static void main(String[] args) throws IOException {

     FileInputStream fileInputStream=new FileInputStream("D:\\My Batches\\Aurion Pro CM + Lending 2024\\Assignments\\05-stream-app\\src\\com\\techlabs\\test\\myfile");

        int ch;
        
    FileOutputStream fileOutputStream=new FileOutputStream("D:\\My Batches\\Aurion Pro CM + Lending 2024\\Assignments\\05-stream-app\\src\\com\\techlabs\\test\\myfile2");   
       
    while( (ch=fileInputStream.read())!=-1)
       {
    	   fileOutputStream.write(ch);
    	   
       }
    
       System.out.println("File copied successfully");
       fileInputStream.close();
	}

}

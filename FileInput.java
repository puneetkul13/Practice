package JavaBasics;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileInput {

	public static void main(String[] args) {
		File file = new File("myfileee.txt");
		
		try(FileReader new_file = new FileReader(file); BufferedReader new_buffer = new BufferedReader(new_file);) {
			String line = new_buffer.readLine();
			while(line!=null) {
				System.out.println(line);
				line = new_buffer.readLine();
		}}
		catch(FileNotFoundException e) {
			System.out.println("File not found...");
		}
		catch(IOException e) {
			System.out.println("File not readable..");
		}
//		Multiplier a  = new Multiplier();
//		try {
//			System.out.println(a.Multiply(1000));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		

	}

}


package SerialisationDeserialisation;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Person person = new Person("Punit", 40,15000);
		
//		byte [] res = convertObjectToBytes(person);
//		
//
//		Person p = (Person) convertBytesToObject(res);
//				
//		System.out.println(person);
//		System.out.println(p);
		String filename = "Punit.txt";
		writeObjectToFile(person, filename);
		Person p = (Person) readFileToObject(filename);
		System.out.println(p);
		
		
		
		
		
		
		
		
		

	}
	public static byte[] convertObjectToBytes(Object o) throws Exception {
		ByteArrayOutputStream baos =  new ByteArrayOutputStream();
		try {
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(o);
			return baos.toByteArray();
		}
		catch(Exception e) {
			throw new Exception();
		}
		
//	public static Object convert

}
	public static Object convertBytesToObject(byte[] bytes) throws Exception{
		InputStream is = new ByteArrayInputStream(bytes);
		try {
			ObjectInputStream ois = new ObjectInputStream(is);
			return ois.readObject();
		}
		catch(Exception e) {
			throw new Exception();
		}
	}
	public static void writeObjectToFile(Object o, String filename) {
		try {
			FileOutputStream fis  = new FileOutputStream(filename);
			ObjectOutputStream oos  = new ObjectOutputStream(fis);
			oos.writeObject(o);
			oos.flush();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Object readFileToObject(String filename) throws Exception {
		Object result = null;
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			result  = ois.readObject();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	}


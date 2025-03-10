package ioStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Bai_1 {
	public static void main(String[] args) {
		String inputFile = "input.txt";
		String outputFile = "output.txt";
		
		try {
			FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos = new FileOutputStream(outputFile);
			int data;
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
			fis.close();
			fos.close();
			System.out.println("Success");
		} catch (IOException e) {
			System.out.println("Fail " + e.getMessage());
		}
	}
}

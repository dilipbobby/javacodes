package TechHill.javacodes;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;


public class BufferedReaderExampleJva7 {

	
	
	/**
	 * @author DilipBobby
	 */
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader("/home/Test")))
		{

			String CurrentLine;

			while ((CurrentLine = br.readLine()) != null) {
				System.out.println(CurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 

	}
}
package TechHill.javacodes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author DilipBobby
 *
 */

/*In Java, there are many ways to read a file, 
here we show you how to use the simplest and most
common-used method – BufferedReader.*/


public class BufferedReaderExample {

	public static void main(String[] args) {

		BufferedReader br = null;

		try {

			String CurrentLine;

			br = new BufferedReader(new FileReader("/home/Test"));

			while ((CurrentLine = br.readLine()) != null) {
				//LINE
				System.out.println(CurrentLine);
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
}


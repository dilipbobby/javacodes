package ExamplesCodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindDuplicates {
	
public static void main(String[] args) {
	FindDuplicates n=new FindDuplicates();
			BufferedReader br = null;

			try {

				String sCurrentLine;
				   Map<String, Integer> unique = new TreeMap<String, Integer>();
				br = new BufferedReader(new FileReader("/home/Desktop/datecount.txt"));

				while ((sCurrentLine = br.readLine()) != null) {
					//System.out.println(sCurrentLine);
					String string2[]=sCurrentLine.split(";");
					for (int i=0; i<string2.length; i++) 
//add
			         {
			            String string=string2[i];
			            unique.put(string,(unique.get(string) == null?1:(unique.get(string)+1)));

			          }

			      // System.out.println(unique);

				}
				 System.out.println(unique);
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
	
	
/*public static Map findDuplicateString(String str) {
	    String[] stringArrays = str.split(";");
	    Map<String, Integer> map = new HashMap<String, Integer>();
	    Set<String> words = new HashSet<String>(Arrays.asList(stringArrays));
	    int count = 0;
	    for (String word : words) {
	        for (String temp : stringArrays) {
	            if (word.equals(temp)) {
	                ++count;
	            }
	        }
	        map.put(word, count);
	        count = 0;
	    }

	    return map;

	}*/

}


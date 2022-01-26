package finalPracticalExam2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class QuestionNumber2 {
	static String path = ".\\src\\finalPracticalExam2\\Dictionary.txt";
	public static void main(String[] args) throws IOException {
		System.out.println(doesFileExist(path));
		printDictionary(File.createTempFile(path, null));
		System.out.println();
	}
	
	public static boolean doesFileExist(String path)
	
	
	{
		File file = new File(path);
		
		if (!file.exists() || !file.isFile())
		{
			return false;
		}
		else 
		{
			return true;
		}
	
	}
	public static void printDictionary(File f) 
	{
		try
		{
			Scanner sc = new Scanner(f);
			String line;
			int i =1;

			while (sc.hasNextLine())
			{
				line = sc.nextLine();
        
				String[] splitLine = line.split("-");
       	 		String[] meaning = splitLine[1].split(",");
        		System.out.println("Word" + i + ": " + splitLine[0].trim());
				i++;
		
        		for(int j=0; j < meaning.length; j++)
				{
            		System.out.println("Meaning" + (j + 1) + ": " + meaning[j].trim());
        		}
		
				System.out.println();
			}
			sc.close();			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}		


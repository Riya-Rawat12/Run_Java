package Unit_03;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List; 

public class P15_FileHandling {

	public static void main(String[] args) {
		
		
		FileHandlingInJava obj= new FileHandlingInJava();
		obj.takeInputFromAFileNotFromConsole();
		obj.saveOutputIntoFile();
		obj.createALogFile();
		

	}

}

class FileHandlingInJava
{
	
	
	
	void takeInputFromAFileNotFromConsole()
	{
		/*
		 * 
		 * The File class is an abstract representation of file and directory pathname. A pathname can be either absolute or relative.
	     * The File class have several methods for working with directories and files such as creating new directories or files, 
		 * deleting and renaming directories or files, listing the contents of a directory etc.
		 * 
		 * 
		 * Java FileReader class is used to read data from the file. It returns data in byte format like FileInputStream class.
		 * It is character-oriented class which is used for file handling in java. 
		 * 
		 *  Java BufferedReader class is used to read the text from a character-based input stream. 
		 *  It can be used to read data line by line by readLine() method. 
		 *  It makes the performance fast. 
		 *  It inherits Reader class.
		 * 
		 */
		
		String path="E:\\vsc_4th_sem\\Java_practice\\learning__java\\src\\unit_03\\input";
		File file=new File(path);
		try 
		{
			FileReader fr= new FileReader(file);
			BufferedReader br= new BufferedReader(fr);
			
			/*String st;
			while((st=br.readLine())!=null)
			{
				System.out.println(st);
			}*/
			
			 List<String> listOfStrings= new ArrayList<String>();
			 
			 String line= br.readLine();
			 
			/*
			 * Reads a line of text. 
			 * A line is considered to be terminated by any oneof a line feed ('\n'), 
			 * a carriage return ('\r'), a carriage return
			 * followed immediately by a line feed, or by reaching the end-of-file(EOF).
			 * Returns:A String containing the contents of the line, 
			 * not including any line-termination characters, or null if the end of thestream 
			 * has been reached without reading any charactersThrows:IOException - 
			 * If an I/O error occurs
			 */
			 
			 while (line!=null)
			 {
				 listOfStrings.add(line);
				 line=br.readLine();
			 }
			 
			 for(String str: listOfStrings)
			 {
				 System.out.println(str);
			 }
			 System.out.println();
			 br.close();
			 fr.close();
			 
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
		
	}
	
	void saveOutputIntoFile()
	{
		/*
		 * Java FileWriter class is used to write character-oriented data to a file
		 * It is character-oriented class which is used for file handling in java
		 * 
		 * Java BufferedWriter class is used to provide buffering for Writer instances. 
		 * It makes the performance fast. It inherits Writer class. The buffering characters are used 
		 * for providing the efficient writing of single arrays, characters, and strings.
		 *
		 */
		
		try 
		{
			FileWriter fw= new FileWriter("E:\\vsc_4th_sem\\Java_practice\\learning__java\\src\\unit_03\\output");
			BufferedWriter bw= new BufferedWriter(fw);
			String text="Hey this would store in Output File";
			
			bw.write(text);
			bw.close();
			fw.close();
			 
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
	}
	
	void createALogFile()
	{
		/*
		 * Saving Output to file with time and Date
		 * 
		 * 
		 */
		
		
		LocalTime lTime= LocalTime.now();
		LocalDate lDate= LocalDate.now();
		
		
		try 
		{
			FileWriter fw= new FileWriter("E:\\vsc_4th_sem\\Java_practice\\learning__java\\src\\unit_03\\log",true);
			BufferedWriter bw= new BufferedWriter(fw);
			
			
			bw.write("Program Exceuted at: "+lTime.toString()+" "+lDate.toString()+"\n");
			
			bw.close();
			fw.close();
			 
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
	}
}






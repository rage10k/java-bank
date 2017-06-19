/*#########################################################################
##                                                                       ##
##  #######     ####     ######   ########     ##     ####     ##   ###  ##
##  ##    ##   ##  ##   ##    ##  ##         ####    ##  ##    ##  ##    ##
##  ##    ##  ##    ##  ##        ##           ##   ##    ##   ## ##     ##
##  ##   ###  ##    ##  ##        ##           ##   ##    ##   ####      ##
##  #######   ########  ##  ####  #######      ##   ## ## ##   ##        ##
##  ##   ##   ##    ##  ##    ##  ##           ##   ##    ##   #####     ##
##  ##    ##  ##    ##  ##    ##  ##           ##   ##    ##   ## ##     ##
##  ##    ##  ##    ##  ##    ##  ##           ##    ##  ##    ##  ##    ##
##  ##    ##  ##    ##   ######   ########    ####    ####     ##   ###  ##
##                                                                       ##
##  Date :    27.05.17                                                   ##
##  Event :   <>                                                         ##
##  Author :  R.Emmanuel                                                 ##
##  Email :   rage10@hotmail.co.uk                      	         ##
##  Version : v0.1                                                       ##
##  Source :  Java 1.8                                                   ## 
#########################################################################*/
/**
 * This is been created to practice the work necessary for the university
 * course that I have enrolled on. I am going to cover reader and write 
 * streams.
 */

import java.util.*;
import java.lang.*;
import ou.*;


class FileReader
{
   public FileReader()
   {
      OUFileChoooser.SetPath(“/User/Xavier/Desktop/“);  // This library is not commonly available has it constructed by the OU "OUFileChooser".
      String pathname = OUFileChooser.getFilename(“emmanuel.txt”);
      File aFile =  new File(pathname);
      
      try
      {
         FileReader fileRead = new FileReader(aFile);
         String ch = FileReader.read();
	
   	 while(!ch = -1)
	 {
	    System.out.println((Char) ch);
            ch = fileReader.read();
         }  // end while loop.
         fileReader.close();
      }
      catch(Exception ex)
      {
         System.out.print(“Error msg: ” + ex);
      }   // end of the try-catch statement.
   }   // end of Constructor.
}   // end of FileReader.



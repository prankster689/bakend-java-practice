
package yogesh;
import java.util.*;
import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
	  public void findFile(String name,File file)
	    {
	        File[] list = file.listFiles();
	        if(list!=null)
	        for (File fil : list)
	        {
	            if (fil.isDirectory())
	            {
	                findFile(name,fil);
	            }
	            else if (name.equalsIgnoreCase(fil.getName()))
	            {
	                System.out.println(fil.getParentFile());
	            }
	        }
	    }
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println( "Hello World!" );
        System.out.println("1.display all files in dir \n 2.add file \n 3.delete file \n 4.search file \n5.close app");
        int ch=0;
       System.out.println("Enter your choice");
       ch=sc.nextInt();
       System.out.println(ch);
       switch(ch)
       {
       	case 1:
       		App ff = new App();
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the file to be searched.. " );
       String name = scan.next();
       System.out.println("Enter the directory where to search ");
       String directory = scan.next();
       ff.findFile(name,new File(directory));
       }
    }
}

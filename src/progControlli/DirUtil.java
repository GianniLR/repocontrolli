package progControlli;

import java.io.File;
import java.util.Arrays;
import java.util.Enumeration;
//CIAO
public class DirUtil {

	public static void main(String[] args) {
		if(args==null && args.length==0) {
			System.out.println("Nessun parametro");
		}
		else {
			if (args[0].equals("-d")) {
				for (int i = 1; i < args.length; i++) 
				{
					File dir = new File(args[i]);
					if (dir.exists()) {
						dir.delete();
						System.out.println("Directory " + dir + " cancellata.");
					} else {
						System.out.println(dir + " inesistente");
					}

				}
			}

			else {
				for (int i = 0; i < args.length; i++) 
				{
					File dir = new File(args[i]);
					dir.mkdir();
					System.out.println("Directory " + dir + " creata");
				}
			}
				
			
		}
//		Enumeration<Object> en =System.getProperties().keys();
//		
//		while(en.hasMoreElements()) {
//			String key=(String)en.nextElement();
//			System.out.println(key+"__val__"+System.getProperties().getProperty(key));
//		}
		System.out.println("java.class.path"+"__val__"+System.getProperties().getProperty("java.class.path"));
		
		File dir_curr= new File(".");//è una directory
		File filet= new File("filet.txt");//è un file
		
		
		System.out.println(filet.getAbsolutePath());
		System.out.println(Arrays.toString(dir_curr.list()));
		System.out.println(Arrays.toString(filet.list()));
		System.out.println(filet.isFile());
		System.out.println(dir_curr.isFile());

	}

}

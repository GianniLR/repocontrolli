package progControlli;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferLettore {

	public static void main(String[] args) {
		System.out.println("java.class.path"+"__val__"+System.getProperties().getProperty("java.class.path"));
		FileReader file=null;
		try {
			file= new FileReader("filet.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader  br=new BufferedReader(file);
		
		String s = null;
		do {
			try {
				s=br.readLine();
				if(s!=null)
				{System.out.println(s);}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}while(s!=null);
		
		//Oggetto scrittore
		BufferedWriter brw=null;
		FileWriter filew=null;
		
		try {
			filew=new FileWriter("ris.txt",true);
			brw= new BufferedWriter(filew);
			for(int i=0; i<10000; i++) 
			{
				brw.append("Ciao"+i+"\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}

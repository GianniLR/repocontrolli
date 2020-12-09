package progControlli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class LettoreWeb {

	public static void main(String[] args) {
		URL url;
		URLConnection uRLConnection=null;
		try {
			url = new URL("https://www.google.it/");
			uRLConnection = url.openConnection();//apro la connessione
			uRLConnection.connect();//mi connetto
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			InputStream risp=uRLConnection.getInputStream();
			BufferedReader br= new BufferedReader(new InputStreamReader(uRLConnection.getInputStream()));
			String riga=null;
			do {
				riga=br.readLine();
				System.out.println(riga);
			}while(riga!=null);
			
			br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}

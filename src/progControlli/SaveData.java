package progControlli;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Item implements Serializable{
	private double num;
	private String str;
	public Item(double num, String str) {
		this.num = num;
		this.str = str;
	}
	public double getNum() {
		return num;
	}
	public void setNum(double num) {
		this.num = num;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	@Override
	public String toString() {
		return "Item [num=" + num + ", str=" + str + "]";
	}
	
	
}

public class SaveData {

	public static void main(String[] args) {
		Item it1=new Item(3.65, "ciao");
		Item it2=new Item(5.55, "Luca");
		//Scrittura
		/*
		try {
			DataOutputStream out=new DataOutputStream(new BufferedOutputStream(
					new FileOutputStream("conti.data")));
			
			out.writeUTF(it1.getStr());
			out.writeDouble(it1.getNum());
			
			out.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Lettura
		try {
			DataInputStream in=new DataInputStream(
					new BufferedInputStream(
					new FileInputStream("conti.data")));
			String str1=in.readUTF();
			double num=in.readDouble();
			Item it4= new Item(num, str1);
			System.out.println(it4);
			in.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		List<Item> list= new ArrayList<Item>();
		list.add(it1);
		list.add(it2);
		//Scrittura di un oggetto
		try {
			ObjectOutputStream out=new ObjectOutputStream(
					new BufferedOutputStream(
					new FileOutputStream("oggetti_conti.data")));
			
			//Caricamento singoli oggetti
//			System.out.println("Salvo l'oggetto: "+it1);
//			out.writeObject(it1);
//			System.out.println("Salvo l'oggetto: "+it2);
//			out.writeObject(it2);
			System.out.println("Salvo la lista: "+list);
			out.writeObject(list);
			
			
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Lettura di un oggetto
		try {
			ObjectInputStream in=new ObjectInputStream(
					new BufferedInputStream(
					new FileInputStream("oggetti_conti.data")));
			//Leggo oggetti singoli
//			Item it3= (Item) in.readObject();
//			System.out.println("Ho caricato l'oggetto: "+it3);
//			Item it4= (Item)in.readObject();
//			System.out.println("Ho caricato l'oggetto: "+it4);
			
			List<Item> list_saved=(List<Item>)in.readObject();
			System.out.println("Ho caricato la lista: "+list_saved);
			in.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}

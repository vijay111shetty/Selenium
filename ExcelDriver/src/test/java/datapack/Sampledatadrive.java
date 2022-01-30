package datapack;

import java.io.IOException;
import java.util.ArrayList;
import datapack.datadriven;
public class Sampledatadrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		datadriven w=new datadriven();
		ArrayList data=w.dataDrivenmethod("Login");
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		datadriven1 u=new datadriven1();	
		ArrayList data1=u.dataget("Add Profile");
		System.out.println(data1.get(0));
		System.out.println(data1.get(1));
		System.out.println(data1.get(2));
		System.out.println(data1.get(3));
		}
	

}

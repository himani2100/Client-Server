/*
Trial run for client
*/

import java.util.*;
import java.io.*;
import java.net.*;


public class trialClient //trial for client server
{
   public static void main(String[] args) throws IOException
   {
	   try
	   {
		   Scanner scan = new Scanner(System.in);
		      Socket client = new Socket("127.0.0.1",55); //random remember port number
		      //error here. Throw exception
		     
		     DataInputStream dis = new DataInputStream(client.getInputStream());
		     DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		     
		     String recieved = dis.readUTF();
		     System.out.println(recieved);
		     int number = scan.nextInt();
		     dos.writeUTF(Integer.toString(number));
		      
		      System.out.println(dis.readUTF());
		      
		      
		      client.close();
		      scan.close();
		   
	   }
	   
	   catch (Exception e)
	   {
		   e.printStackTrace();
	   }
     
   }
}

/*
Trial run for client handler
*/


import java.net.*;
import java.io.*;



public class trialClientHandler extends Thread
{
	int num;
	final DataInputStream dis;
	final DataOutputStream dos;
	final Socket server;

	public trialClientHandler(Socket server, DataInputStream dis, DataOutputStream dos) 
	{
		this.dis = dis;
		this.dos = dos;
		this.server = server;
	}
	
	public void run()
	{
		int recieved;
		int returned;
		
		try 
		{
			dos.writeUTF("Enter a number : ");
			recieved = Integer.parseInt(dis.readUTF());
			returned = recieved * 2;
			dos.writeUTF(Integer.toString(returned));
			
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	

}

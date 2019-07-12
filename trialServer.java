/*
Trial run for server
*/


import java.io.*;
import java.net.*;



public class trialServer
{
   public static void main(String[] args) throws IOException
   {
      ServerSocket server = new ServerSocket(55); //server socket
      //makes sure the above one is server
      Socket server_1 = server.accept(); //to accept client's request
      System.out.println("A new client was connected " + server_1 + "\nAssigning new thread to it.");
     
      DataInputStream dis = new DataInputStream(server_1.getInputStream());
      DataOutputStream dos = new DataOutputStream(server_1.getOutputStream());
     
      Thread t = new trialClientHandler(server_1, dis, dos); 
      t.start();
     
      
      server_1.close();
      server.close();
   }
}

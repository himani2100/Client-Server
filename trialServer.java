/*
Trial run for server
*/

import java.util.*;
import java.io.*;
import java.net.*;
import java.text.*;


public class trialServer
{
   public static void main(String[] args) throws IOException
   {
      ServerSocket server = new ServerSocket(55); //server socket
      //makes sure the above one is server
      Socket server_1 = server.accept(); //to accept client's request
      Scanner scan = new Scanner(server_1.getInputStream()); //gain number from client
      int num_rec = scan.nextInt();
      int temp = num_rec * 2;
      
      PrintStream print = new PrintStream(server_1.getOutputStream());
      print.println(temp);
      
      print.close();
      scan.close();
      server_1.close();
      server.close();
   }
}

/*
Trial run for client
*/

import java.util.*;
import java.io.*;
import java.net.*;
import java.text.*;


public class trialClient //trial for client server
{
   public static void main(String[] args) throws IOException
   {
      Scanner scan = new Scanner(System.in);
      Socket client = new Socket("127.0.0.1",55); //random remember port number
      //error here. Throw exception
      Scanner scan_1 = new Scanner(client.getInputStream()); //to accept result from server
      System.out.printf("Enter number : ");
      int number = scan.nextInt();
      PrintStream send_print = new PrintStream(client.getOutputStream()); //to send number to server
      send_print.println(number);
      int server_num = scan_1.nextInt(); //save the number responded by server
      System.out.println(server_num);
      scan_1.close();
      client.close();
      scan.close();
   }
}

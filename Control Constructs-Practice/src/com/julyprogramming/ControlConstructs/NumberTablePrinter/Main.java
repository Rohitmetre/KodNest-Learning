package com.julyprogramming.ControlConstructs.NumberTablePrinter;

import java.util.Scanner;

public class Main {
	public static void printTable(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"x"+i+"="+(num*i));
		}
	}

	public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter the number");
     int num=scan.nextInt();
     printTable(num);
     
	}

}

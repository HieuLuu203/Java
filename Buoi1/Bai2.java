package Buoi1;

import java.util.Scanner;

public class Bai2 {
	
	public static String[] do2 (String s)
	{
		String[] res = s.trim().toLowerCase().split("\\s++");
		return res;
	} 
	
	public static void outp (String s, int check)
	{
		System.out.print(String.valueOf(s.charAt(0)).toUpperCase());
		for (int i=1; i<s.length(); i++)
			System.out.print(s.charAt(i));
		if (check==0) System.out.print(" ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		
		String[] done = do2(s);
		String temp = "@ptit.edu.vn";
		
		System.out.print("2.");
		for (String ans : done)
		{
			outp (ans , 0);		}
		System.out.println("");
		
		System.out.print("3.");
		int n = done.length;
		for (int i=1; i< n; i++)
		{
			if (i<n-1) outp(done[i], 0);
			else 
				{
					outp(done[i],1);
					System.out.print(", ");
					outp(done[0],1);
					System.out.println("");
				}
			
		}
		
		System.out.print("4." + done[n-1]);
		for (int i = 0; i< n-1; i++)
			System.out.print(done[i].charAt(0));
		System.out.println(temp);
		

	}

}

package Buoi1;

import java.util.Scanner;

public class Bai1 {

	public static boolean ThuanNghich (String s)
	{
		for (int i=0; i<s.length()/ 2; ++i)
		{
			if (s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
		}
		return true;
	}
	
	public static boolean check2 (String s)
	{
		for (int i=0; i<(s.length()+1)/2;++i)
		{
			if ((s.charAt(i) - '0') % 2 == 1) return false;
		}
		return true;
	}
	
	public static boolean check3 (String s)
	{
		if (s.charAt(0)!='8' || s.charAt(s.length()-1)!='8') return false;
		int sum = 0;
		for (int i=0; i<s.length(); ++i)
		{
			sum+= s.charAt(i) - '0';
		}
		if (sum%2==0) return true;
		return false;
	}
	
	public static boolean check4 (String s)
	{
		for (int i=0; i<s.length(); ++i)
		{
			int tmp = s.charAt(i) - '0';
			if (tmp == 0 || tmp == 1 || tmp == 4 || tmp == 6 || tmp == 8 || tmp ==9)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if (ThuanNghich(s) == false)
		{
			System.out.println("2.false");
			System.out.println("3.false");
			System.out.println("4.false");
		}
		else
		{
			System.out.println("2." + check2(s));
			System.out.println("3." + check3(s));
			System.out.println("4." + check4(s));
		}
	}

}

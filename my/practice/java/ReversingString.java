package my.practice.java;

import java.util.Scanner;
import java.util.Stack;

public class ReversingString {

	
	private static boolean False;

	public static void main(String[] args) {
		int i;
		Scanner n = new Scanner(System.in);
	    System.out.println("Enter a word : ");
		String s = n.nextLine();
	    Stack<Character> stacks = new Stack<Character>();
		
		for(i = 0; i < s.length(); i++)
		{
			stacks.push(s.charAt(i));
		}
		
		System.out.println("Reverse of entered word : ");
		
        if(stacks.empty()==False)
        {
		while(stacks.empty()==False)
		{
			System.out.println(stacks.pop());
		}
		System.out.println("Reverse operation is performed.");
        }

		
		if(stacks.empty())
		{
			System.out.println("Hence not performed.");
		}
		
	}

}

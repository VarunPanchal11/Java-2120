import java.io.IOException;
import java.util.Scanner;

public class BracketMatch {

	public static void bracketMatch(String input) throws Exception
	{
		CharacterStack b = new CharacterStack(input.length());
		int count = 0;
		int i;
		for(i=0;i<input.length();i++)
		{
			if(input.charAt(i)=='('){
				b.push(input.charAt(i));
				count++;

			}
			 else if(input.charAt(i)==')'){
				if(!b.isEmpty())
				{
					b.pop();
					count--;
				}
				else
				{
					System.out.println("Missmatch at " + (i+1));
					return;
				}

			}

		}

		if(b.isEmpty())
		{
			System.out.println("All bracket Match");
		}
		else{
			System.out.println("Mismatch at "+ i);
		}
	}
	public static void main(String[] args) throws Exception {
		bracketMatch("()");
		bracketMatch("()()()()()()() ");
		bracketMatch("((((((((())))))))");
		bracketMatch("(()((()()())(())))");
		bracketMatch(")(");
		bracketMatch("((()()())))");
		bracketMatch("(((((((()))))))");
		bracketMatch("()()())()()()");

		
		

	}
	
}

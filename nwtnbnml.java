import java.util.Scanner;
import java.lang.Math;

public class nwtnbnml
{
	static int factorial(int n)
	{
		int f;
		for (f = 1; n > 1; n--)
		{
			f*= n;
		}

		return f;
	}

	static int nCp(int n, int p)
	{
	
		return factorial(n) / (factorial(n - p) * factorial(p));
	}

	public static void main (String[]args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Newton Binomial Calculator\n\r");
		System.out.println("Input the Binomial!");
		System.out.print("\nEnter the operator (+ or -): ");
		String operator = reader.nextLine();
		System.out.print("\n 'ax' value: ");
		int ax = reader.nextInt();
		
		System.out.print("\n 'a' value: ");
		int a = reader.nextInt();
		
		System.out.print("\nExponent : ");
		int n = reader.nextInt();
		
		System.out.println("\n[*] Developing all (n + 1) terms...");
		System.out.println("("+ax+"x "+ operator +" "+ a +")^"+n+": ");
		System.out.print("= ");
		
		
		int i;
		String joiner;
		String ii= "";
		int j = n;
		String ert = "";
		
		for (i = 0; i <= n; i++)
		{
			joiner = n+"C"+i+" * ("+ax+"x)^"+j+" * "+a+"^"+i;
			
			if (i == i)
			
			{
				if (i == 0)
				{
					ii = joiner;
				}
				else
				{
					ii += "   " + operator+"   " + joiner;
				}
				
				if (i == n)
				{
					System.out.println(ii);
				}
			}
			j--;
		}

		System.out.print("= ");
		j = n;
		for (i = 0; i <= n; i++)
		{
			joiner = nCp(n, i)+" * "+(int)Math.pow(ax, j)+"x^"+j+" * "+ Math.pow(a, i);

			if (i == i)

			{
				if (i == 0)
				{
					ii = joiner;
				}
				else
				{
					ii += "  "+ operator + "  " + joiner;
				}

				if (i == n)
				{
					System.out.println(ii);
				}
			}
			j--;
		}

		System.out.print("= ");
		j = n;
		for (i = 0; i <= n; i++)
		{
			if (j == 0)
			{
				joiner = (nCp(n, i) * (int)Math.pow(ax, j) * (int)Math.pow(a, i)) + " ";
			}
			else if (j == 1)
			{
				joiner = (nCp(n, i) * (int)Math.pow(ax, j) * (int)Math.pow(a, i)) + "x";
			}
			else
			{
				joiner = (nCp(n, i) * (int)Math.pow(ax, j) * (int)Math.pow(a, i)) + "x^"+j;
			}

			if (i == i)
			{
				if (i == 0)
				{
					ii = joiner;
				}
				else
				{
					ii += " "+ operator + " " + joiner;
				}

				if (i == n)
				{
					System.out.print(ii);
				}
			}
			j--;
		}

	}
}

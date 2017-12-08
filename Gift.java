
import java.util.Scanner;
public class Gift {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		int NP = scan.nextInt();
		Account[] friends = new Account[NP]; //makes array of names
		for (int i = 0; i < NP; i++) //sets element of array to input
		{
			friends[i] = new Account(scan.nextLine());
		}
		/* The following loops through array of names, gets the line names are on sees if
		 * the next input name is equal to the element at that index. Then it gives money
		 * while having other accounts receive money.
		 */
		for (int i = 0; i < friends.length; i++)
		{
			if (scan.nextLine() == friends[i].getName())
			{
				int a = scan.nextInt();
				int b = scan.nextInt();
				int c = friends.length;
				friends[i].giveMoney(a, b);
				for (int j = 1; j <= b; j++)
				{
					if (i + j > c)
					{
						b = b - j;
						j = 0;
					}
					friends[i + j].receiveMoney(friends[i + j]);
				}
			}
		}
		for (int i = 0; i < friends.length; i++)
		{
			System.out.println(friends[i].getName() + " " + friends[i].getBalance());
		}
		
	}

}

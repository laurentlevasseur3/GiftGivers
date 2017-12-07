import java.util.Scanner;
public class Main {

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
				int q = 0;
				while (q < b) {
				  for (int h = 0; h < friends.length; h++) {
				    if (scan.nextLine() == friends[i].getName()) {
				      friends[h].receiveMoney();
				      q++;
				    }
				  }
				}
			}
		}
		for (int i = 0; i < friends.length; i++)
		{
			System.out.println(friends[i].getName() + " " + friends[i].getBalance()); //prints result
		}
		
	}
}
	
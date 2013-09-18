import java.awt.Label;


public class Bleh {

	public static void main(String... args) {
		int a = (int)(Math.random()*101);
		int b = (int)(Math.random()*101);
		int c = (int)(Math.random()*101);
		
		int temp = 0;
		
		if (b > a) {
			temp = a;
			a = b;
			b = temp;
		}
		if (c > b) {
			temp = b;
			b = c;
			c = temp;
		}
		if (b > a) {
			temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
		System.out.println(" c = " + c);
		
		outer:
		for (int i = 1 ; i < 20; i++) {
			if (i % 7 == 0 ) 
			{
				System.out.println("Boom");
				continue;
			} 
			else 
			{
				temp = i;
				while ( temp != 0) 
				{
					if (temp % 10 == 7) 
					{
						System.out.println("Boom");
						continue outer;
					}
					temp/=10;
				}
			
			}
			System.out.println(i);
		}
	}
}

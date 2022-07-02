
public class desmod001C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A");
		int x = 10;
		int y=20;
		System.out.println(x);
		System.out.println(y);
		
		/*Resultado en consola A:
		x = 10
		y = 20
		 */
		
		System.out.println("B");
		 x =x+y;
		 y =y+x;
		System.out.println(x);
		System.out.println(y);
		
		/*Resultado en consola B:
		x = 30
		y = 50
		 */
		
		System.out.println("C");
		x=x-y ;
		y=y-x ;
		System.out.println(x);
		System.out.println(y);
		
		/*Resultado en consola C:
		x = -20
		y = 70
		 */
		
		System.out.println("D");
		x=x*y;
		y=x*x;
		System.out.println(x);
		System.out.println(y);
		
		/*Resultado en consola D:
		x = -1400
		y = 1960000
		 */
		
		System.out.println("E");
		x=y/x ;
		y=x/y ;
		System.out.println(x);
		System.out.println(y);
		
		/*Resultado en consola E:
		x = -1400
		y = 0
		 */
		
	}

}

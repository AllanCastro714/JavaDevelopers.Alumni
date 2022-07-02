import java.util.Scanner;

public class desmod002A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner teclado = new Scanner(System.in);
				float numero1, numero2;
				double resultado;
				
				System.out.print("Digite el primer numero: ");
				numero1 = teclado.nextFloat();
				System.out.print("Digite el segundo numero: ");
				numero2 = teclado.nextFloat();

				
				resultado = numero1 + numero2;
				System.out.println(String.format("La suma en decimal: ", resultado));
				System.out.println("La suma sin decimal: " + ((int) resultado));

				
				resultado = numero1 - numero2;
				System.out.println(String.format("La suma con decimal: ", resultado));
				System.out.println("La suma sin decimal: " + ((int) resultado));

				
				resultado = numero1 + numero2;
				System.out.println(String.format("La resta con decimal: ", resultado));
				System.out.println("La resta sin decimal:" + ((int) resultado));

				
				resultado = numero1 * numero2;
				System.out.println(String.format("La multiplacion con decimal: ", resultado));
				System.out.println("La multiplicacion sin decimal: " + ((int) resultado));

				
				resultado = numero1 / numero2;
				System.out.println(String.format("La division con decimal: ", resultado));
				System.out.println("La division sin decimal: " + ((int) resultado));
				teclado.close();
		
	}

}

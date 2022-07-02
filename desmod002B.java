import java.util.Scanner;

	public class desmod002B {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

				Scanner desk = new Scanner(System.in);
				int cantidadDecimal;
				float base, exponente;
				double result;
				System.out.println("Digite un numero base: ");
				base = desk.nextFloat();
				System.out.println("Digite el exponente: ");
				exponente = desk.nextFloat();
			
				System.out.println("Digite cuantos decimales quiere ver: ");
				cantidadDecimal = desk.nextInt();

				result = Math.pow(base, exponente);
				System.out.println(String.format(
			
					"La potencia con " + cantidadDecimal + " decimales: %." + cantidadDecimal + "f ", result));
			
			desk.close();
		}
		
	}

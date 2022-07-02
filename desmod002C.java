import java.util.Scanner;
public class desmod002C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner desk = new Scanner(System.in);
		String letraA, letraB;
		char caracterA, caracterB;
		int asciiA, asciiB;
		System.out.print("Digite la primera letra: ");
		letraA = desk.next();

		System.out.print("Digite la segunda letra: ");
		letraB = desk.next();

		caracterA = letraA.toLowerCase().charAt(0);
		asciiA = caracterA;
		caracterB = letraB.toLowerCase().charAt(0);
		asciiB = caracterB;

		System.out.println("Minusculas...");
		System.out.println("La letra " + caracterA + " en ascii es " + asciiA);
		System.out.println("La letra " + caracterB + " en ascii es " + asciiB);

		caracterA = letraA.toUpperCase().charAt(0);
		asciiA = caracterA;
		caracterB = letraB.toUpperCase().charAt(0);
		asciiB = caracterB;

		System.out.println("Mayusculas...");
		System.out.println("La letra " + caracterA + " en ascii es " + asciiA);
		System.out.println("La letra " + caracterB + " en ascii es " + asciiB);

		desk.close();
		
	}

}

package ST20;
import java.util.Scanner;



public class Input {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Geben Sie irgendetwas ein: ");
		String eingabe = in.next();
		System.out.print("Ihre Eingabe ist: " + eingabe + "\n" + "Danke für Ihre Eingabe. Bye Bye" + "\n");
		in.close();

	}

}

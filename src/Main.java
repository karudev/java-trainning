import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) throws IOException{

		char response = 'O';
		String data[] = {"","",""};
		FileWriter fw = new FileWriter(new File("data/persons.txt"));
	
		
		Scanner sc = new Scanner(System.in);
		
		while (response == 'O') {
			System.out.println("Veuillez saisir une nouvelle personne :");

			data = sc.nextLine().split(" ");
			
			Person person = new Person();
			person.setGender(data[0]);
			person.setFirstame(data[1]);
			person.setLastname(data[2]);
		
			
			System.out.println("Bienvenue " + person);
			fw.write(person + "\n");
			
			
			System.out.println("Voulez vous réassayer ? (O/N)");
			
			response = sc.nextLine().charAt(0);
		}
		fw.close();
		System.out.println("Fin du programme");
		
	}
}

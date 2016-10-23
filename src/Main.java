import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JFrame;



public class Main {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main (String[] args) throws IOException{

		try { //Class.forName("com.mysql.jdbc.Driver").newInstance();
		System.out.println("DRIVER OK ! ");
		try {
		String url = "jdbc:mysql://db:3306/test";
		Connection conn = DriverManager.getConnection(url, "test","123456");
		Statement stm = conn.createStatement();
		ResultSet result = stm.executeQuery("select * from person");
		while (result.next()) {
			System.out.println(result.getString("name"));
		}
		result.close();
		stm.close();
		} catch (SQLException ex) {
		// la connection a la base de données n'a pas pu etre établi
		// voici les codes erreurs retournés
		System.out.println("SQLException: " + ex.getMessage());
		System.out.println("SQLState: " + ex.getSQLState());
		System.out.println("VendorError: " + ex.getErrorCode());
		}
		} catch (Exception ex) {
		// Le driver n'a pas pu être chargé
		// vérifier que la variable CLASSPATH est bien renseignée
		System.out.println("Echec de chargement du driver");
		} 
	    
		
		/*char response = 'O';
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
		System.out.println("Fin du programme");*/
		
	}
}

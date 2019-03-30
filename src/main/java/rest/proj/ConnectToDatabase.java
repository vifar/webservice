package rest.proj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ConnectToDatabase implements ApplicationListener<ApplicationReadyEvent> {

	public static Connection CONNECTION = null;

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		
		try {
			
			Scanner in = new Scanner(System.in);
			System.out.println("Please enter the path of the db file : ");
			String dbPath = in.nextLine();
			in.close();
			
			// db parameters
			String url = "jdbc:sqlite:" + dbPath;
			// create a connection to the database
			CONNECTION = DriverManager.getConnection(url);

			System.out.println("Connection to SQLite has been established.");

		} catch (SQLException e) {
			System.out.println("Could not locate the db, please try again.");
			System.out.println(e.getMessage());
			System.exit(0);
		} 
		
	}

}

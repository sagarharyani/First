import java.time.LocalDate;
import java.util.Scanner;

import org.bson.Document;

import com.globalpayex.lib.DbConnect;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;

public class AddPlubicationHouse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter ratings: ");
		float ratings = sc.nextFloat();
		
		System.out.println("Enter establishment date: ");
		String date = sc.nextLine();
		String[] tokens = date.split("/");
		
		
		System.out.println(name);
		System.out.println(ratings);
		System.out.println(date);
		
		
		sc.close();
		
		try(MongoClient mongoClient = DbConnect.getConnection()){
			MongoCollection<Document> publicationCollection = mongoClient
				.getDatabase("library_db")
				.getCollection("publications");
			publicationCollection.insertOne(
					new Document()
						.append("name", name)
						.append("ratings", ratings)
						.append("estDate",
								LocalDate.of(
											Integer.parseInt(tokens[0]),
											Integer.parseInt(tokens[1]),
											Integer.parseInt(tokens[2])))
				

			);
		
		}
	}
}
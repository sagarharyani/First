import java.util.Scanner;

import org.bson.Document;

import com.globalpayex.lib.DbConnect;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.*;

public class UpdateMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the roll");
		int roll = sc.nextInt();
		System.out.println("Enter the pcm marks");
		int pcm = sc.nextInt();
		
		sc.close();
		
		try(MongoClient mongoClient = DbConnect.getConnection()){
			MongoCollection<Document> studentCollection = mongoClient
					.getDatabase("library_db")
					.getCollection("students");
			if(studentCollection
					.find(eq("roll",roll))
					.first() != null)//this returns the document, if not fount it will return null
			{	
				studentCollection
					.updateOne(
							eq("roll", roll),
							set("pcm", pcm)
					);
			}
			else {
				System.out.println("Student not found!");
			}
		}
	}
	
}

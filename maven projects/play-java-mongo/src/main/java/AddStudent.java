import java.util.Arrays;

import org.bson.Document;

import com.globalpayex.lib.DbConnect;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;

public class AddStudent {
	
	public static void main(String[] args) {
		
		int[] c = {647548584, 4647484};
		try(MongoClient mongoClient = DbConnect.getConnection()){
			MongoCollection<Document> studentCollection = mongoClient
					.getDatabase("library_db")
					.getCollection("students");
			
			studentCollection.insertOne(
				new Document()
				.append("name", "nirmal")
				.append("gender", "m")
				.append("roll", 11)
				.append("isNri", true)
				.append("contacts", Arrays.asList("456789765", "3456787654"))
				.append("address", new Document()
						.append("country", "IN")
						.append("state", "MH")
						.append("pincode", 34567)
						)
				);
		}
		
		
	}

}

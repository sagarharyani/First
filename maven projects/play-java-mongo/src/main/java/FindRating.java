import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.gt;
import static com.mongodb.client.model.Projections.excludeId;
import static com.mongodb.client.model.Projections.fields;
import static com.mongodb.client.model.Projections.include;
import static com.mongodb.client.model.Updates.set;

import java.util.Scanner;

import org.bson.Document;

import com.globalpayex.lib.DbConnect;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;

public class FindRating {
	

	public static void main(String[] args) {

		try(MongoClient mongoClient = DbConnect.getConnection()){
			MongoCollection<Document> pubCollection = mongoClient
					.getDatabase("library_db")
					.getCollection("publications");
			MongoCollection<Document> bookCollection = mongoClient
					.getDatabase("library_db")
					.getCollection("books");
			pubCollection.
			find(
					
						gt("ratings", 3.0)
			
			)

			.forEach(pubCollectionDoc -> {
				bookCollection
						.find(
								eq("pubHoId", pubCollectionDoc.get("_id"))
						 )
						.forEach(document -> System.out.println(document.toJson()));
			});
			
			
		}
	
	}
}

//try to import these static mehods in every mongodb class, because it includes very imp functions
import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.*;
import static com.mongodb.client.model.Projections.*;
import static com.mongodb.client.model.Sorts.*;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.globalpayex.lib.DbConnect;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
public class QueryData {
	
	public static void main(String[] args) {
		//name, gender, pcm
		try(MongoClient mongoClient = DbConnect.getConnection()){
			MongoCollection <Document> studentCollection = mongoClient
					.getDatabase("library_db")
					.getCollection("students");
			studentCollection.
					find(
							and(
								eq("gender", "m"),
								gt("pcm", 250)
							)
					
					)
					.projection(
							//include("name", "gender", "pcm")
							fields(include("name", "gender", "pcm"), excludeId())
					)
					.sort(
							descending("pcm")
					)
					.forEach(document -> System.out.println(document.toJson()));
		}
		
		
	}

}

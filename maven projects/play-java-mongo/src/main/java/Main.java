import com.globalpayex.lib.DbConnect;
import com.mongodb.client.MongoClient;

public class Main {
	
public Main() {
	// TODO Auto-generated constructor stub
	try(MongoClient mongoClient = DbConnect.getConnection()){
		//System.out.println(mongoClient);
		System.out.println("*****all databases*******");
		mongoClient
		.listDatabases()
		.forEach(document -> System.out.println(document.toJson()));
		System.out.println("*****collection int the library database******");
		mongoClient
				.getDatabase("library_db")
				.listCollectionNames()
				.forEach(System.out::println);	
	}
}	

}

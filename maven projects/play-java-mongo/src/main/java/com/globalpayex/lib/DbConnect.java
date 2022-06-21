package com.globalpayex.lib;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class DbConnect {
	
	public static MongoClient getConnection() {
		return MongoClients.create("mongodb://localhost:27017");
	}

}

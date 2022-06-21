package com.globalpayex;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Router;

public class SimpleHttpServer extends AbstractVerticle{
	
	//imagine one verticle as an one instance of server.
	//there is an cluster in in which one or more verticle communicate with each other.
	public static int port = 9091;
	public HttpServer server; //we are creating refrence of this same class, this is called as one verticle.
	
	
	@Override
	public void start(Promise<Void> startPromise) throws Exception{
		// start function always take promise as a parameter and you can pass any generic, class or Void(Class) as a parameter.
		//if promise is failing to run it will throw exception
		//promise is a future like object that is used as a placeholder for a result of asynchronous API.
		//(promise gives result according to future Result.)
		//there is a promise class which gets in 4 states
		//fulfilled, pending, settled, rejected <- according to JavaScript.
		server = vertx.createHttpServer();
		Router router = Router.router(vertx);// after getting port router class hits a url.
		
		router.route().handler(c -> { //route handles all requests
			HttpServerResponse response = c.response();
			response.putHeader("content-type", "text/plain");
			response.end("sagar"); //end gives content
		});			
		
		
		server.requestHandler(router).listen(port).onSuccess(s ->{
			System.out.println("Http server started on port :: "+ port);
			startPromise.complete();
		}).onFailure(e -> {
			e.printStackTrace();
			startPromise.fail(e);
		});
		
	}
	
	public static void main(String[] args) {
		Vertx.vertx().deployVerticle(
				new SimpleHttpServer(), deployHandler ->{
					if(deployHandler.succeeded()) {
						System.out.println("Verticle Deployed");
					}
					else {
						System.out.println(deployHandler.cause().getMessage());
					}
				});
	}
	

}

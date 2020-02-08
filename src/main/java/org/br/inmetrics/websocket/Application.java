package org.br.inmetrics.websocket;


import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;
import javax.websocket.DeploymentException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) throws DeploymentException, IOException, URISyntaxException {

		SpringApplication app = new SpringApplication(Application.class);
		app.run(args);

		new Scanner(System.in).nextLine();
		
	}

}

package hibernate.mapping.one.to.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hibernate.mapping.one.to.one.client.GeneratePassPort;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		new GeneratePassPort().issuePassPort();
	}

}

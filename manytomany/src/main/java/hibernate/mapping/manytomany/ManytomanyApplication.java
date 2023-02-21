package hibernate.mapping.manytomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hibernate.mapping.manytomany.client.SaveAuthoObject;
import hibernate.mapping.manytomany.client.SaveBookObject;

@SpringBootApplication
public class ManytomanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManytomanyApplication.class, args);
		//new SaveBookObject().saveBooks();
		new SaveAuthoObject().saveAuthor();
	}

}

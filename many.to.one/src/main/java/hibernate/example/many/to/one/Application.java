package hibernate.example.many.to.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hibernate.example.many.to.one.crud.ManyToOneCrudOpt;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		ManyToOneCrudOpt obj = new ManyToOneCrudOpt();
		obj.insertData();
	}

}

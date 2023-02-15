package hibernate_mapping.one_to_many;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OneToManyApplication {
	

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OneToManyApplication.class, args);
		SaveDoctorObject obj = context.getBean(SaveDoctorObject.class);
		//obj.createRecord();
		obj.readDocterObject();
	}

}

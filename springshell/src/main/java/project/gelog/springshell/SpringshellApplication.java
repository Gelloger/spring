package project.gelog.springshell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringshellApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringshellApplication.class, args);
	}

}

package osmnkya.IbanCheck.IbanCheckAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class IbanCheckApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbanCheckApiApplication.class, args);
	}
	
	@RestController
	public class HelloController {

		@RequestMapping("/")
		public String index() {
			return "Greetings from Spring Boot!";
		}
	}
}
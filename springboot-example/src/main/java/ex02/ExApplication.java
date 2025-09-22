package ex02;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ExApplication {

	@Bean
	public Map<?, ?> myMap() {
		return Map.of("greeting", "hello, world");
	}

	@RestController
	public static class MyController {
		@GetMapping("/hello")
		public String hello() {
			return "hello, world";
		}
	}

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac = SpringApplication.run(ExApplication.class, args)) {
		} catch (Exception ignore) {
		}

		SpringApplication.run(ExApplication.class, args);
	}


}

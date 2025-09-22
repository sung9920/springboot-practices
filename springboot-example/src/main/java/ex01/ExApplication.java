package ex01;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExApplication {

	@Bean
	public Map<?, ?> myMap() {
		return Map.of("greeting", "hello, world");
	}
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExApplication.class, args);
		System.out.println(applicationContext.getBean("myMap", Map.class).get("greeting"));
	}

}

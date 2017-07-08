package cn.project.gyl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
/**
 * 
 * @author Administrator
 *
 */
@SpringBootApplication
@PropertySources({
	@PropertySource("classpath:custom/custom.properties")
})
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}

package co.com.project.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
	scanBasePackages = {
		"co.com.project.management",
		"co.com.project.common"
	}
)
public class ServiceManagementApplication {

	public static void main(String... args) {
		SpringApplication.run(ServiceManagementApplication.class);
	}

}

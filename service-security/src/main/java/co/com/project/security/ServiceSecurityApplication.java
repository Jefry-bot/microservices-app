package co.com.project.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication(
    scanBasePackages = {
            "co.com.project.common",
            "co.com.project.security"
    }
)
public class ServiceSecurityApplication {

    public static void main(String... args) {
        SpringApplication.run(ServiceSecurityApplication.class);
    }

}

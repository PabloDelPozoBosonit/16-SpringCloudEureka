package FormacionBackendBosonit.EurekaNamingServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaBusesServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaBusesServerApplication.class, args);
	}

}

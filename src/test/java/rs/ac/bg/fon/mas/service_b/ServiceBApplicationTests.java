package rs.ac.bg.fon.mas.service_b;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"spring.cloud.config.enabled=false", "eureka.client.enabled=false"})
class ServiceBApplicationTests {

	@Test
	void contextLoads() {
	}

}

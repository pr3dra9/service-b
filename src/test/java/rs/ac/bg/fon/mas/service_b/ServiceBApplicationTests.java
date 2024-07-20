package rs.ac.bg.fon.mas.service_b;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;

@SpringBootTest(properties = {"spring.cloud.config.enabled=false", "eureka.client.enabled=false"})
@EmbeddedKafka
class ServiceBApplicationTests {

	@Test
	void contextLoads() {
	}

}

package in.pwskills.akash.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerApp {
	
	@JmsListener(destination = "${my.app.desti-name}")
	public void readDate(String data) {
		System.out.println("Consumer#3 ::"+data);
	}

}

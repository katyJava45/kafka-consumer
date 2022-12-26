package telran.java45;


import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;


@SpringBootApplication
public class KarafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarafkaConsumerApplication.class, args);
	}
//	
//	@Bean
//	public Function<String, String> uppercase() {
//	    return value -> {
//	    	System.out.println("hi");
//	        System.out.println("Received: " + value);
//	        return value.toUpperCase();
//	    };
//	}
//	@Bean
//	public Supplier<String> stringSupplier() {
//		return () -> "Hello from Supplier";
//	}

//	@Bean
//	public void printMessage() {
//		System.out.println("hi");
//	}

	@KafkaListener(topics = "wxezpqrb-default", groupId = "groupId")
	public void printMessage(String message){
		System.out.println(message);
	}

}

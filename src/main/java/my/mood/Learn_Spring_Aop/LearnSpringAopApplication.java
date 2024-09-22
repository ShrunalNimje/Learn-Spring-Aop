package my.mood.Learn_Spring_Aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import my.mood.Learn_Spring_Aop.example.business.BusinessService;

@SpringBootApplication
public class LearnSpringAopApplication implements CommandLineRunner {

	public Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private BusinessService businessService;
	
	public static void main(String[] args) {
		SpringApplication.run(LearnSpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Value is : " + businessService.CalculateMax());
	}

}

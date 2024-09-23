package my.mood.Learn_Spring_Aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import my.mood.Learn_Spring_Aop.example.business.BusinessService;
import my.mood.Learn_Spring_Aop.example.business.BusinessService1;

@SpringBootApplication
public class LearnSpringAopApplication implements CommandLineRunner {

	public Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private BusinessService businessService;
	
	@Autowired
	private BusinessService1 businessService1;
	
	public static void main(String[] args) {
		SpringApplication.run(LearnSpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("BusinessService Value is {}", businessService.CalculateMax());
		logger.info("BusinessService1 Value is {}", businessService1.CalculateMin());
	}

}

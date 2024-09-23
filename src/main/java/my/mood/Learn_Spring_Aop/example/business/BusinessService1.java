package my.mood.Learn_Spring_Aop.example.business;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import my.mood.Learn_Spring_Aop.example.data.DataService1;

@Service
public class BusinessService1 {

	@Autowired
	private DataService1 dataService1;
	
	public int CalculateMin() {
		int [] min = dataService1.RetrieveData1();
		// throw new RuntimeException("Something wrong going to happen!");
		return Arrays.stream(min).min().orElse(0);
	}
	
}

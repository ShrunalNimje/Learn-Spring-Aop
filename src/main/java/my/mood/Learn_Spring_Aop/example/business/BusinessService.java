package my.mood.Learn_Spring_Aop.example.business;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.mood.Learn_Spring_Aop.example.data.DataService;

@Service
public class BusinessService {

	@Autowired
	private DataService dataService;
	
	public int CalculateMax() {
		int [] max = dataService.RetrieveData();
		return Arrays.stream(max).max().orElse(0);
	}
	
}

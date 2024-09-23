package my.mood.Learn_Spring_Aop.example.business;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.mood.Learn_Spring_Aop.example.annotation.TrackTime;
import my.mood.Learn_Spring_Aop.example.data.DataService;

@Service
public class BusinessService {

	@Autowired
	private DataService dataService;
	
	@TrackTime
	public int CalculateMax() {
		
		int [] max = dataService.RetrieveData();
		// throw new RuntimeException("Something wrong going to happen!");
		return Arrays.stream(max).max().orElse(0);
	}
	
}

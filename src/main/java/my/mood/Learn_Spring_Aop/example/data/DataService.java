package my.mood.Learn_Spring_Aop.example.data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService {

	public int [] RetrieveData() {
		
		try {
			Thread.sleep(30);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return new int [] {12, 23, 34, 45, 56, 67, 78, 89, 90};
	}
}

package my.mood.Learn_Spring_Aop.example.data;

import org.springframework.stereotype.Repository;

import my.mood.Learn_Spring_Aop.example.annotation.TrackTime;

@Repository
public class DataService1 {

	@TrackTime
	public int [] RetrieveData1() {
		
		try {
			Thread.sleep(30);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return new int [] {112, 123, 134, 145, 156, 167, 178, 189, 190};
	}
}

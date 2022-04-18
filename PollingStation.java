package PollingStation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class PollingStation<T1,T2, T3> {
	
	private T1 name;
	private T2 voters_list;
	private int number_of_booths;
	private T3 polling_station_id;
	private List<List<String>> voters_list_divided_booths = new ArrayList<>();;
	public PollingStation(T1 name, T2 voters_list, int number_of_booths , T3 polling_station_id) {
		this.name = name;
		this.voters_list = voters_list;
		this.number_of_booths = number_of_booths;
		this.polling_station_id = polling_station_id;
		
	}
	private List<PollingBooth> polling_booths_running = new ArrayList<>();
	public void startWorking() {
		ArrayList<Integer> polling_booth_numbers_reference = new ArrayList<>();
		for(int i=0;i<number_of_booths;i++) {
			List<String> voters_list_assigned_booth = new ArrayList<String>();
			voters_list_divided_booths.add(voters_list_assigned_booth);
			polling_booth_numbers_reference.add(i);
		}
		ArrayList<Integer> polling_booth_numbers = new ArrayList<>(polling_booth_numbers_reference);
		for(int i=0;i<((List<List<String>>) voters_list).size();i++) {
			if(polling_booth_numbers.size()==0) {
				polling_booth_numbers = new ArrayList<>(polling_booth_numbers_reference);
			}
			int polling_station_number = new Random().nextInt(polling_booth_numbers.size()) ;
			voters_list_divided_booths.get(polling_booth_numbers.get(polling_station_number)).add((((List<String>)voters_list).get(i)));
			polling_booth_numbers.remove(polling_station_number);
		}
//		
		for(int i=0;i<number_of_booths;i++) {
			PollingBooth<Integer, List<String>, PollingStation> polling_booth = new PollingBooth<>(new ArrayBlockingQueue<Voter>(3),i+1,(voters_list_divided_booths).get(i),this);
			
			polling_booths_running.add(polling_booth);
			
		}
	}
	public T1 getName() {
		return name;
	}
	public void setName(T1 name) {
		this.name = name;
	}
	public T2 getVoters_list() {
		return voters_list;
	}
	public void setVoters_list(T2 voters_list) {
		this.voters_list = voters_list;
	}
	public int getNumber_of_booths() {
		return number_of_booths;
	}
	public void setNumber_of_booths(int number_of_booths) {
		this.number_of_booths = number_of_booths;
	}
	public T3 getPolling_station_id() {
		return polling_station_id;
	}
	public void setPolling_station_id(T3 polling_station_id) {
		this.polling_station_id = polling_station_id;
	}
	public List<List<String>> getVoters_list_divided_booths() {
		return voters_list_divided_booths;
	}
	public void setVoters_list_divided_booths(List<List<String>> voters_list_divided_booths) {
		this.voters_list_divided_booths = voters_list_divided_booths;
	}
	public List<PollingBooth> getPolling_booths_running() {
		return polling_booths_running;
	}
	public void setPolling_booths_running(List<PollingBooth> polling_booths_running) {
		this.polling_booths_running = polling_booths_running;
	}
	
	

}

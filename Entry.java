package PollingStation;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Entry<T1> extends Thread {
	
	private T1 room;
	private ArrayBlockingQueue<Object> persons;
	
	public Entry(T1 room, ArrayBlockingQueue<Object> persons) {
		this.room = room;
		this.persons = persons;
		
		start();
		
		
	}
	
	public ArrayBlockingQueue<Object> getPersons(){
		return this.persons;
	}
	public void setPersons(ArrayBlockingQueue<Object> persons) {
		this.persons = persons;
	}

	public T1 getRoom() {
		return room;
	}

	public void setRoom(T1 room) {
		this.room = room;
	}

	


	public void run() {
		if(room.toString().substring(0,12).equals("PollingBooth")) {
		synchronized(this) {
			
			while(((PollingBooth) room).getVoters_count()<((PollingBooth) room).getMax_voters_per_booth()) {
				
				int voter_count = ((PollingBooth) room).getVoters_count();
				ArrayList<String> temp = (ArrayList<String>)((PollingBooth)room).getVoterList();
//				String voter_name = ((ArrayList<>) ((PollingBooth)room).getVoterList()).get(voter_count);
				String voter_name = temp.get(voter_count);
				int index1 = voter_name.indexOf("[") +1 ;
				int index2 = voter_name.indexOf("]");
				int age = Integer.parseInt(voter_name.substring(index1,index2));
				PollingStation polling_station = (PollingStation) ((PollingBooth)room).getPollingStation();
				String polling_station_id = (String) polling_station.getPolling_station_id();
				Voter<String, String,Integer> voter = new Voter<>(voter_name, (((PollingBooth)room).getVoter_number()) + polling_station_id,age );
				
				
				
				
				
				int check=0;
				
				for(Object v:persons) {
					if((int)((Voter)v).getAge()==age) {
						check+=1;
						break;
					}
				}
				if(check==0) {
					try {
						persons.put(voter);
						
						PollingStation current_polling_station = (PollingStation) ((PollingBooth)room).getPollingStation();
						String current_polling_station_name = (String) current_polling_station.getName();
						System.out.println("Voter "+voter.getVoter_name()+" with voter id "+voter.getVoter_id()+" entered room number "+((PollingBooth)room).getRoom_number()+" of Polling Station "+current_polling_station_name+".");
						int new_voter_count = ((PollingBooth)room).getVoters_count()+1;
						((PollingBooth)room).setVoters_count(new_voter_count);
						((PollingBooth)room).setVoter_number(((PollingBooth)room).getVoter_number()+1);
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						
					}
					
			}
			}
			
			
		}
		}
		
		
	}

}

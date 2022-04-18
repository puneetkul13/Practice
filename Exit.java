package PollingStation;

import java.util.List;
import java.util.concurrent.BlockingQueue;

public class Exit<T1> extends Thread {
	private T1 room;
	private BlockingQueue<Object> persons;
	public Exit(T1 room, BlockingQueue<Object> persons) {
		this.room = room;
		this.persons = persons;
		start();
	}
	
	public T1 getRoom() {
		return room;
	}

	public void setRoom(T1 room) {
		this.room = room;
	}

	public BlockingQueue<Object> getPersons() {
		return persons;
	}

	public void setPersons(BlockingQueue<Object> persons) {
		this.persons = persons;
	}

	
	public void run() {
		if(room.toString().substring(0,12).equals("PollingBooth")) {
			synchronized(this) {
				while(((PollingBooth)room).getVoters_count()<=((PollingBooth)room).getMax_voters_per_booth() || persons.size()!=0) {
//					
					try {
						Thread.sleep(4000);
						Voter voter =  (Voter) persons.take();
						String modified_voter_name = ((String)voter.getVoter_name()).substring(0,((String)voter.getVoter_name()).length()-1) + "V";
						voter.setVoter_name(modified_voter_name);
						PollingStation current_polling_station = (PollingStation) ((PollingBooth)room).getPollingStation();
						String current_polling_station_name = (String) current_polling_station.getName();
						System.out.println("Voter "+voter.getVoter_name()+" with voter ID "+voter.getVoter_id()+" voted and exited from booth "+((PollingBooth)room).getRoom_number()+" of Polling Station "+current_polling_station_name+".");
						if(((PollingBooth)room).getVoters_count()==((PollingBooth)room).getMax_voters_per_booth() && persons.size()==0) {
							PollingStation polling_station = (PollingStation) ((PollingBooth)room).getPollingStation();
							String polling_station_id = (String) polling_station.getPolling_station_id();
							System.out.println("Voting done "+((PollingBooth)room).getRoom_number()+"-"+polling_station_id);
						}
					} catch (InterruptedException e) {
						
					}
					
				}
				
				
			}
			
		}
		
	}

}

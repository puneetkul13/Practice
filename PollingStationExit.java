package PollingStation;

import java.util.List;

public class PollingStationExit extends Thread {
	PollingStation polling_station;
	private List<Voter> voters;
	public PollingStationExit(PollingStation polling_station, List<Voter> voters) {
		this.polling_station = polling_station;
		this.voters = voters;
	}
	public void exitVoter() throws InterruptedException {
		synchronized(voters) {
			while(voters.size()==0) {
				if(polling_station.voters_count==polling_station.max_voters_per_booth) {
					System.out.println("Polling Booth "+polling_station.room_number +" Closed");
					
				}
				else {
					System.out.println("No voters there in the booth "+ polling_station.room_number);
					
					
				}
				voters.wait();
				
			}
		}
		synchronized(voters) {
			Thread.sleep(4000);
			System.out.println("Voter "+voters.get(0).voter_name+" "+" with voter id "+voters.get(0).voter_id+" voted and exited.");
			voters.remove(0);
			
			voters.notify();
		}
	}
	public void run() {
		synchronized(this) {
			while(true) {
				if(polling_station.voters_count<=polling_station.max_voters_per_booth) {
					try {
						exitVoter();
					} catch (InterruptedException e) {
						
					}
				}else {
					System.out.println("Polling station limit reached");
				}
				
			}
			
		}
	}

}

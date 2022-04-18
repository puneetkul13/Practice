package PollingStation;

import java.util.List;

public class PollingStationEntry extends Thread {
	PollingStation polling_station;
	private List<Voter> voters;
	public PollingStationEntry(PollingStation polling_station, List<Voter> voters) {
		this.polling_station = polling_station;
		this.voters = voters;
	}
	public void insertVoter(Voter voter) throws InterruptedException {
		synchronized(voters) {
			while(voters.size()==3) {
				System.out.println("Booth is fully Occupied. Please Wait...");
				voters.wait();
			}
			
		}
		synchronized(voters) {
			voters.add(voter);
			System.out.println("Voter "+voter.voter_name+" "+" with voter id "+voter.voter_id+" Entered in booth."+polling_station.room_number);
			polling_station.voters_count+=1;
			Thread.sleep(2000);
			voters.notify();
		}
		
	}
	public void run() {
		synchronized(this) {
			while(polling_station.voters_count<polling_station.max_voters_per_booth) {
				synchronized(this) {
					
				}
				polling_station.voter_number+=1;
				int age = polling_station.minAge + (int)(Math.random() * ((polling_station.maxAge - polling_station.minAge) + 1));
				String voter_name = "V "+(polling_station.voter_number) + " "+ age; 
				Voter voter = new Voter(voter_name, (polling_station.voter_number),age );
				int check=0;
				for(Voter v:voters) {
					if(v.age==age) {
						check+=1;
						break;
					}
				}
				if(check==0) {
					try {
						insertVoter(voter);
					} catch (InterruptedException e) {
						
					
					
				}
			}
			}
			
			
		}
		
		
	}

}

package PollingStation;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class PollingBooth<T2,T3,T5>{
	
	private T5 polling_station;
	private int max_voters_per_booth;
	private int voter_number=0;
	private ArrayBlockingQueue<Voter> voters = null;
	private T2 room_number;
	private int maxAge = 60;
	private int minAge = 18;
	private int voters_count=0;
	Entry<PollingBooth> p_entry = null;
	Exit<PollingBooth> p_exit = null;
	
	private T3 voters_list;
	
	
 	public PollingBooth(ArrayBlockingQueue<Voter> voters, T2 room_number, T3 voters_list, T5 polling_station) {
 		this.max_voters_per_booth = ((List<String>)voters_list).size();
 		this.polling_station = polling_station;
		this.voters = voters;
		this.room_number = room_number;
		this.voter_number = max_voters_per_booth*((int)room_number-1);
		this.voters_list = voters_list;
		
		p_entry = new Entry(this, voters);
		p_exit = new Exit(this, voters);
		
		
		
		
		
		
	}
 	public T5 getPollingStation() {
 		return this.polling_station;
 	}
 	public T3 getVoterList(){
 		return (this.voters_list);
 	}
 	public void setVotersList(T3 voters_list) {
 		this.voters_list = voters_list;
 	}
 	public int getMax_voters_per_booth() {
		return max_voters_per_booth;
	}
	public void setMax_voters_per_booth(int max_voters_per_booth) {
		this.max_voters_per_booth = max_voters_per_booth;
	}
	public int getVoter_number() {
		return voter_number;
	}
	public void setVoter_number(int voter_number) {
		this.voter_number = voter_number;
	}
	public ArrayBlockingQueue getVoters() {
		return voters;
	}
	public void setVoters(ArrayBlockingQueue voters) {
		this.voters = voters;
	}
	public T2 getRoom_number() {
		return room_number;
	}
	public void setRoom_number(T2 room_number) {
		this.room_number = room_number;
	}
	public int getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}
	public int getMinAge() {
		return minAge;
	}
	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}
	public int getVoters_count() {
		return voters_count;
	}
	public void setVoters_count(int voters_count) {
		this.voters_count = voters_count;
	}
	@Override
	public String toString() {
		return "PollingBooth [max_voters_per_booth=" + max_voters_per_booth + ", voter_number=" + voter_number
				+ ", voters=" + voters + ", room_number=" + room_number + ", maxAge=" + maxAge + ", minAge=" + minAge
				+ ", voters_count=" + voters_count + ", voters_list=" + voters_list + "]";
	}
	
	
	


}

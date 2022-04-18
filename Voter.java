package PollingStation;

public class Voter<T1,T2,T3> {
	private T1 voter_name;
	private T2 voter_id;
	private T3 age;
	public Voter(T1 voter_name,T2 voter_id, T3 age) {
		this.voter_name = voter_name;
		this.voter_id = voter_id;
		this.age = age;
		
	}
	public T1 getVoter_name() {
		return voter_name;
	}
	public void setVoter_name(T1 voter_name) {
		this.voter_name = voter_name;
	}
	public T2 getVoter_id() {
		return voter_id;
	}
	public void setVoter_id(T2 voter_id) {
		this.voter_id = voter_id;
	}
	public T3 getAge() {
		return age;
	}
	public void setAge(T3 age) {
		this.age = age;
	}
	

}

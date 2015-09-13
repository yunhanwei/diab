package diab.model;

import java.time.LocalDateTime;

public class DataMaster{
	private int masterId;
	private Users user;
	private LocalDateTime timeEntered;
	private LocalDateTime time;
	private int datatype;


	//Get set functions
	public int getMasterId(){
		return this.masterId;
	}
	public void setMasterId(int masterId){
		this.masterId = masterId;
	}

	public Users getUser(){
		return this.user;
	}
	public void setUser(Users user){
		this.user = user;
	}

	public LocalDateTime getTimeEntered(){
		return this.timeEntered;
	}
	public void setTimeEntered(LocalDateTime timeEntered){
		this.timeEntered = timeEntered;
	}

	public LocalDateTime getTime(){
		return this.time;
	}
	public void setTime(LocalDateTime time){
		this.time = time;
	}

	public int getDatatype(){
		return this.datatype;
	}
	public void setDatatype(int datatype){
		this.datatype = datatype;
	}


}

package diab.model;

import java.time.LocalDateTime;

public class dataMaster{
	private int id;
	private LocalDateTime timeEntered;
	private LocalDateTime time;
	private int datatype;


	//Get set functions
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
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
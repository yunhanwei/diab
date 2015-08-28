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
	private void setId(int id){
		this.id = id;
	}

	public LocalDateTime getTimeEntered(){
		return this.timeEntered;
	}
	private void setTimeEntered(LocalDateTime timeEntered){
		this.timeEntered = timeEntered;
	}

	public LocalDateTime getTime(){
		return this.time;
	}
	private void setTime(LocalDateTime time){
		this.time = time;
	}

	public int getDatatype(){
		return this.datatype;
	}
	private void setDatatype(int datatype){
		this.datatype = datatype;
	}


}
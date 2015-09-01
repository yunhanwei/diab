package diab.model;

import java.time.LocalDateTime;
import java.lang.String;
import java.lang.Float;

public class BG{
	private int id;
	private LocalDateTime timeEntered;
	private Float value;
	private String note;


	//Get and set functions
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

	public Float getValue(){
		return this.value;
	}
	public void setValue(Float value){
		this.value = value;
	}

	public String getNote(){
		return this.note;
	}
	public void setNote(String note){
		this.note = note;
	}

}
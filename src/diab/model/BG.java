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
	private void setId(int id){
		this.id = id;
	}

	public LocalDateTime getTimeEntered(){
		return this.timeEntered;
	}
	private void setTimeEntered(LocalDateTime timeEntered){
		this.timeEntered = timeEntered;
	}

	public Float getValue(){
		return this.value;
	}
	private void setValue(Float value){
		this.value = value;
	}

	public String getNote(){
		return this.note;
	}
	private void setNote(String note){
		this.note = note;
	}

}
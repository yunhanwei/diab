package diab.model;

import java.time.LocalDateTime;
import java.lang.String;
import java.lang.Float;

public class insulin{
	private int id;
	private LocalDateTime timeEntered;
	private Float carbDose;
	private Float correctionDose;
	private Float hourlyBasalDose;
	private String type;
	private String note;


	//get and set functions
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

	public Float getCarbDose(){
		return this.carbDose;
	}
	private void setCarbDose(Float carbDose){
		this.carbDose = carbDose;
	}

	public Float getCorrectionDose(){
		return this.correctionDose;
	}
	private void setCorrectionDose(Float correctionDose){
		this.correctionDose = correctionDose;
	}

	public Float getHourlyBasalDose(){
		return this.hourlyBasalDose;
	}
	private void setHourlyBasalDose(Float hourlyBasalDose){
		this.hourlyBasalDose = hourlyBasalDose;
	}

	public String getType(){
		return this.type();
	}
	private void setType(String type){
		this.type = type;
	}

	public String getNote(){
		return this.note;
	}
	private void setNote(String note){
		this.note = note;
	}

}

package diab.model;

import java.time.LocalDateTime;
import java.lang.String;
import java.lang.Float;
import diab.model.DataMaster;

public class Insulin{
	@Expose private int dataId;
	private DataMaster dataMaster;
	@Expose private LocalDateTime timeEntered;
	@Expose private Float carbDose;
	@Expose private Float correctionDose;
	@Expose private Float hourlyBasalDose;
	@Expose private String type;
	@Expose private String note;


	//get and set functions
	public int getDataId(){
		return this.dataId;
	}
	public void setDataId(int dataId){
		this.dataId = dataId;
	}

	public DataMaster getDataMaster(){
		return this.dataMaster;
	}
	public void setDataMaster(DataMaster dataMaster){
		this.dataMaster = dataMaster;
	}

	public LocalDateTime getTimeEntered(){
		return this.timeEntered;
	}
	public void setTimeEntered(LocalDateTime timeEntered){
		this.timeEntered = timeEntered;
	}

	public Float getCarbDose(){
		return this.carbDose;
	}
	public void setCarbDose(Float carbDose){
		this.carbDose = carbDose;
	}

	public Float getCorrectionDose(){
		return this.correctionDose;
	}
	public void setCorrectionDose(Float correctionDose){
		this.correctionDose = correctionDose;
	}

	public Float getHourlyBasalDose(){
		return this.hourlyBasalDose;
	}
	public void setHourlyBasalDose(Float hourlyBasalDose){
		this.hourlyBasalDose = hourlyBasalDose;
	}

	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type = type;
	}

	public String getNote(){
		return this.note;
	}
	public void setNote(String note){
		this.note = note;
	}

}

package diab.model;

import java.time.LocalDateTime;
import java.lang.String;
import java.lang.Float;

public class BG{
	private int dataId;
	private DataMaster dataMaster;
	private LocalDateTime timeEntered;
	private Float value;
	private String note;


	//Get and set functions
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
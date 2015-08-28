package diab.model;

import java.io.Serialiable;
import java.lang.String;
import java.time.LocalDateTime;


public class Users{
	//
	private int id;
	private String email;
	private String password; //this is the hashed version don't worry


	//Get and set functions

	public int getId(){
		return this.id;
	}
	private void setId(int id){
		this.id = id;
	}

	public String getEmail(){
		return this.email;
	}
	private void setEmail(String email){
		this.email = email;
	}

	public String getPassword(){
		return this.password;
	}
	private void setPassword(String password){
		this.password = password;
	}

}
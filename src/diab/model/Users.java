package diab.model;

import java.lang.String;


public class Users{
	//
	private int id;
	private String email;
	private String password; //this is the hashed version don't worry


	//Get and set functions

	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}

	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}

	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password = password;
	}

}
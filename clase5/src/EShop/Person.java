package EShop;

import java.time.LocalDateTime;

public class Person {
	private String name;
	private String lastName;
	private LocalDateTime born;
	
	public Person(String name, String lastname, LocalDateTime born){
		this.name= name;
		this.lastName=lastname;
		this.born= born;
	}
	
	public String getFullName() {
		return this.getName()+" "+this.getLastname();
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getLastname() {
		return this.lastName;
	}
	
	public LocalDateTime getBorn() {
		return this.born;
	}
	
	public void setNombre(String name) {
		this.name = name;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setBorn(LocalDateTime born) {
		this.born = born;
	}
}

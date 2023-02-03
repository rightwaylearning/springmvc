package bcci.playing.teams;

public class Player {

	private String firstName;
	private String lastName;
	private Integer age;
	private String type;
	
	public Player(){}
	

	public Player(String firstName, String lastName, Integer age, String type) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.type = type;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}

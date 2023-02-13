package component.mapping.has_a_relationship.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class Address {

	@Column(name="home_no")
	private String line1;
	
	private String line2;
	
	private Integer pin;
	
	public Address() {}
	
	
	public Address(String line1, String line2, Integer pin) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.pin = pin;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}
	
}

package hibernate.example.many.to.one.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="docter")
public class Docter {

	@Id
	@Column(name="docter_number")
	private Integer docterNumber;
	
	@Column(name="docter_name")
	private String docterName;
	
	@Column(name="docter_qualification")
	private String docterQulification;
		
	
	public Docter() {}

	public Docter(Integer docterNumber, String docterName, String docterQulification) {
		super();
		this.docterNumber = docterNumber;
		this.docterName = docterName;
		this.docterQulification = docterQulification;
	}

	public Integer getDocterNuber() {
		return docterNumber;
	}

	public void setDocterNuber(Integer docterNumber) {
		this.docterNumber = docterNumber;
	}

	public String getDocterName() {
		return docterName;
	}

	public void setDocterName(String docterName) {
		this.docterName = docterName;
	}

	public String getDocterQulification() {
		return docterQulification;
	}

	public void setDocterQulification(String docterQulification) {
		this.docterQulification = docterQulification;
	}

	@Override
	public String toString() {
		return "Docter [docterNumber=" + docterNumber + ", docterName=" + docterName + ", docterQulification="
				+ docterQulification + "]";
	}

	
}

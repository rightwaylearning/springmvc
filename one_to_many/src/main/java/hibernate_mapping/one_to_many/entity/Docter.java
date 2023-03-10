package hibernate_mapping.one_to_many.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	
	@OneToMany(targetEntity = Patient.class,
			   orphanRemoval = true
			  )
	@JoinColumn(name="fk_docter_no",referencedColumnName = "docter_number")
	private List<Patient> patients;
	
	public Docter() {}

	public Docter(Integer docterNumber, String docterName, String docterQulification, List<Patient> patients) {
		super();
		this.docterNumber = docterNumber;
		this.docterName = docterName;
		this.docterQulification = docterQulification;
		this.patients = patients;
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

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	
}

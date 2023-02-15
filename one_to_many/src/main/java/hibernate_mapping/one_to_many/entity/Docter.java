package hibernate_mapping.one_to_many.entity;

import java.util.Set;

import javax.persistence.Table;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
@Table(name="docter")
public class Docter{

	@Id
	@Column(name="docter_number")
	private Integer docterNumber;
	
	@Column(name="docter_name")
	private String docterName;
	
	@Column(name="docter_qualification")
	private String docterQulification;
	
	@OneToMany(targetEntity = Patient.class,
			   cascade = CascadeType.ALL,
			   fetch = FetchType.EAGER,
			   orphanRemoval = true
			  )
	@JoinColumn(name="fk_docter_no",referencedColumnName = "docter_number")
	private Set<Patient> patients;
	
	public Docter() {}

	public Docter(Integer docterNumber, String docterName, String docterQulification, Set<Patient> patients) {
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

	public Set<Patient> getPatients() {
		return patients;
	}

	public void setPatients(Set<Patient> patients) {
		this.patients = patients;
	}
	
}

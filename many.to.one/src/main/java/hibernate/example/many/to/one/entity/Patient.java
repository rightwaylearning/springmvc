package hibernate.example.many.to.one.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient{

	@Id
	@Column(name="patient_id")
	private Integer patientId;
	
	@Column(name="patient_name")
	private String patientName;
	
	@Column(name="patient_age")
	private Integer patientAge;
	
	@ManyToOne( targetEntity = Docter.class,
			    cascade = CascadeType.ALL,
			    fetch = FetchType.LAZY
			)
	@JoinColumn(
			  name = "fk_dr_no",
			  referencedColumnName = "docter_number"
			)
	private Docter docter;
	
	public Patient() {}

	public Patient(Integer patientId, String patientName, Integer patientAge,Docter docter) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.docter = docter;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Integer getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(Integer patientAge) {
		this.patientAge = patientAge;
	}
	
	public Docter getDocter() {
		return docter;
	}

	public void setDocter(Docter docter) {
		this.docter = docter;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientAge=" + patientAge
				+ ", docter=" + docter + "]";
	}

}	

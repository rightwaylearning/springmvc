package hibernate.mapping.one.to.one.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="passport")
public class PassPort {
	
	@Id
	@Column(name="passport_number")
	Integer passPosrtNumber;
	
	@OneToOne(
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
			)
	@JoinColumn(
			 name = "fek_pId",
			 referencedColumnName = "person_id",
			 unique = true,
			 nullable = false
			)
	Person person;

	public Integer getPassPosrtNumber() {
		return passPosrtNumber;
	}

	public void setPassPosrtNumber(Integer passPosrtNumber) {
		this.passPosrtNumber = passPosrtNumber;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}

package hibernate.mapping.one.to.one.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {

	@Id
	@Column(name="person_id")
	private Integer persinId;
	
	@Column(name="person_name")
	private String personName;

	public Integer getPersinId() {
		return persinId;
	}

	public void setPersinId(Integer persinId) {
		this.persinId = persinId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
		
}

package hibenate_inheritance_types.inheritance_object_save.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "cheque_pay")
public class Cheque extends Payment {
	
	@Column(name="cheque_number")
	private Integer chequeNumber;
	
	@Column(name="cheque_type")
	private String chequeType;

	public Integer getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(Integer chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public String getChequeType() {
		return chequeType;
	}

	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}
	
	

}

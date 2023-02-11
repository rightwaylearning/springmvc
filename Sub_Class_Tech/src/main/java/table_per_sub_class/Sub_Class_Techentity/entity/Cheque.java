package table_per_sub_class.Sub_Class_Techentity.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="cheque_data")
@PrimaryKeyJoinColumn(name="txId")
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

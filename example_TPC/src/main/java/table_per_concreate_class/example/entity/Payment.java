package table_per_concreate_class.example.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="payment")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="pmode", discriminatorType = DiscriminatorType.STRING,length = 20 )
abstract public class Payment {
   
	@Id
	@Column(name="txId")
	private Integer transectioId;
	
	@Column(name="amount ")
	private Double amount;
	
	@Column(name="tx_date")
	private String date;
	
	public Payment() {}

	public Payment(Integer transectioId, Double amount, String date) {
		super();
		this.transectioId = transectioId;
		this.amount = amount;
		this.date = date;
	}

	public Integer getTransectioId() {
		return transectioId;
	}

	public void setTransectioId(Integer transectioId) {
		this.transectioId = transectioId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
		
}

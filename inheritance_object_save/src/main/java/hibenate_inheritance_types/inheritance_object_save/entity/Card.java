package hibenate_inheritance_types.inheritance_object_save.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "card_pay")
public class Card extends Payment{

	@Column(name="card_number")
	private Integer cardNumber;
	
	@Column(name="card_type")
	private String cardType;

	public Integer getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	
}

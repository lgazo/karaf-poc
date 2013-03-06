package sk.seges.fis.customer.server.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private Long id;
	private String street;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

}

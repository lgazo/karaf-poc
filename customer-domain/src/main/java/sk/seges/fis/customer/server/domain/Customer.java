/**
 * 
 */
package sk.seges.fis.customer.server.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ladislav.gazo
 */
@Entity
@Table(name = "customers")
public abstract class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private Address address;
	private List<Address> deliveryAddress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Address> getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(List<Address> deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

}

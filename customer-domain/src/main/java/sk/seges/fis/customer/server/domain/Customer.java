/**
 * 
 */
package sk.seges.fis.customer.server.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author ladislav.gazo
 */
@Entity
@Table(name = "customers")
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "customertype")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@ManyToOne
	private Address address;
	@ManyToMany
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

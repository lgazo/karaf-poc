/**
 * 
 */
package sk.seges.fis.event.server.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sk.seges.fis.customer.server.domain.Customer;

/**
 * @author ladislav.gazo
 */
@Entity
@Table(name = "events")
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private Date startDate;
	private Date endDate;
	@ManyToOne(cascade = {CascadeType.ALL})
	private Customer customer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date start) {
		this.startDate = start;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date end) {
		this.endDate = end;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}

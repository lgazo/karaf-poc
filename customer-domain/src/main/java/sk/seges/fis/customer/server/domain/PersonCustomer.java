/**
 * 
 */
package sk.seges.fis.customer.server.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;

/**
 * @author ladislav.gazo
 */
@Entity
@DiscriminatorValue("person")
public class PersonCustomer extends Customer {
	@Embedded
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}

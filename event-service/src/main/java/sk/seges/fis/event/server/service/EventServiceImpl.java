package sk.seges.fis.event.server.service;

import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import sk.seges.fis.customer.server.domain.Customer;
import sk.seges.fis.customer.server.domain.Person;
import sk.seges.fis.customer.server.domain.PersonCustomer;
import sk.seges.fis.event.server.domain.Event;

public class EventServiceImpl implements EventService {
	private final Logger log = Logger.getLogger(EventServiceImpl.class.getName());
	
	private EntityManager entityManager;
	
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public void createEvent(Date from, Date to) {
//		PersonCustomer c = new PersonCustomer();
//		Person person = new Person();
//		person.setFirstName("jozef");
//		person.setLastName("mrkvicka");
//		c.setPerson(person);
//		entityManager.persist(c);
		
		Customer c = new Customer();
		
		Event event = new Event();
		event.setCustomer(c);
		event.setStartDate(from);
		event.setEndDate(to);
		entityManager.persist(event);
//		entityManager.flush();
		log.log(Level.SEVERE, "stored 13 " + event.getId() + ", " + entityManager);
	}

	@Override
	public List<Event> findAll() {
		return entityManager.createQuery("from Event", Event.class).getResultList();
	}
}

/**
 * 
 */
package sk.seges.fis.event.server.service;

import java.util.Date;
import java.util.List;

import sk.seges.fis.event.server.domain.Event;

/**
 * @author ladislav.gazo
 */
public interface EventService {
	void createEvent(Date from, Date to);
	List<Event> findAll();
}

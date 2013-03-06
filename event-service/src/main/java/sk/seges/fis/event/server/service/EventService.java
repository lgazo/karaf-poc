/**
 * 
 */
package sk.seges.fis.event.server.service;

import java.util.Date;

/**
 * @author ladislav.gazo
 */
public interface EventService {
	void createEvent(Date from, Date to);
}

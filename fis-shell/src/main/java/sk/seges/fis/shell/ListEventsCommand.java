/**
 * 
 */
package sk.seges.fis.shell;

import java.util.List;

import org.apache.felix.service.command.CommandSession;
import org.apache.karaf.shell.commands.Action;
import org.apache.karaf.shell.commands.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sk.seges.fis.event.server.domain.Event;
import sk.seges.fis.event.server.service.EventService;

/**
 * @author ladislav.gazo
 */
@Command(scope = "fis", name = "eventlist", description = "List events")
public class ListEventsCommand implements Action {
	private static final Logger log = LoggerFactory.getLogger(ListEventsCommand.class);
	private EventService eventService;

	public void setEventService(EventService eventService) {
		this.eventService = eventService;
	}

	@Override
	public Object execute(CommandSession arg0) throws Exception {
		List<Event> all = eventService.findAll();
		StringBuilder b = new StringBuilder();
		for(Event e : all) {
			b.append(e.getId());
			b.append(",");
		}
		log.error("All events = " + b.toString());
		return all;
	}

}

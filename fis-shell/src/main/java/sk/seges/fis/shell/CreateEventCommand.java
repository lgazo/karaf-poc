/**
 * 
 */
package sk.seges.fis.shell;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.felix.gogo.commands.Action;
import org.apache.felix.gogo.commands.Argument;
import org.apache.felix.gogo.commands.Command;
import org.apache.felix.service.command.CommandSession;

import sk.seges.fis.event.server.service.EventService;

/**
 * @author ladislav.gazo
 */
@Command(scope = "fis", name = "eventadd", description = "Adds event")
public class CreateEventCommand implements Action {
	@Argument(index = 0, name = "From", required = true)
	String from;
	@Argument(index = 1, name = "To", required = true)
	String to;
	
	private EventService eventService;
	
	public void setEventService(EventService eventService) {
		this.eventService = eventService;
	}
	
	@Override
	public Object execute(CommandSession arg0) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		eventService.createEvent(sdf.parse(from), sdf.parse(to));
		return null;
	}

}

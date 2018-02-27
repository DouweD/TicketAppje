package tutapp.ticket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TicketService {
	
	Ticket tick = new Ticket();
	
	private List<Ticket> tickets = new ArrayList<> (Arrays.asList(
			new Ticket("Team1", "Marten Stooker", "Gekkie"),
			new Ticket("Team2", "Douwe Dijkink", "25 jaar"),
			new Ticket("Team3", "Yvonne Berfelo", "24 jaar"),
			new Ticket("Team4", "Liesbeth Berfelo", "24 jaar")
			));
	
	public List<Ticket> getAllTickets(){
		return tickets;
	}
	
	public Ticket getTicket(String id) {
		return tickets.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}

	public void updateTicket(String id, Ticket ticket) {
		for(int i = 0; i < tickets.size(); i++) {
			Ticket t = tickets.get(i);
			if(t.getId().equals(id)) {
				tickets.set(i, ticket);
				return;
			}
		}
	}

	public void deleteTicket(String id) {
		tickets.removeIf(t -> t.getId().equals(id));		
	}
}

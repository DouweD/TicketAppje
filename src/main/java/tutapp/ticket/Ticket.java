package tutapp.ticket;

//import java.util.Random;

public class Ticket {
	
	//Random BezoekersId = new Random();
	
	private String id; //= BezoekersId.nextInt(40000);
	private String name;
	private String description;
	
	public Ticket() {
	}
	
	public Ticket(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}

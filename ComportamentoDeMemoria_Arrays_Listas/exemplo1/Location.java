package exemplo1;


/*just to see stuff */


public class Location {

	private String name;
	private String email;

	public Location() {

	}

	public Location(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {

			return name + ", " + email;

	}
}

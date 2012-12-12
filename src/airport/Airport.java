public class Airport {
	private String id;
	private String name;
	private String city;
	private double altitude;
	private double longditude;

	public Airport(String id, String name, String city, double altitude, double longditude) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.altitude = altitude;
		this.longditude = longditude;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String toString() {
		return id + " " + name + " " + city;
	}

	public double getAltitude() {
		return altitude;
	}

	public double getLongditude() {
		return longditude;
	}

	public double getDistanceTo(Airport airport) {
		return Math.hypot(altitude-airport.getAltitude(), longditude-airport.getLongditude());
	}
}

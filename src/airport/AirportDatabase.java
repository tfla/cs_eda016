import java.util.ArrayList;

public class AirportDatabase {
	private ArrayList<Airport> airports;
	
	public AirportDatabase() {
		airports = new ArrayList<Airport>();
	}

	public boolean add(Airport airport) {
		boolean added = false;
		for (int i = 0; i < airports.size(); i++) {
			if (i != airports.size()) {
				return false;
			}
		}
		airports.add(airport);
		return true;
	}
	
	public Airport get(String id) {
		Airport a = null;
		for (int i = 0; i < airports.size(); i++) {
			if (airports.get(i).getId().equals(id)) {
				a = airports.get(i);
			}
		}
		return a;
	}

	public ArrayList<Airport> findWithin(Airport airport, double dist) {
		ArrayList<Airport> result = new ArrayList<Airport>();
		for (int i = 0; i < airports.size(); i++) {
			if (airports.get(i).getDistanceTo(airport) < dist) {
				result.add(airports.get(i));
			}
		}
		return result;
	}

	public Airport findClosest(Airport airport) {
		double dist = Double.MAX_VALUE;
		Airport closest = null;
		for (int i = 0; i < airports.size(); i++) {
			Airport a = airports.get(i);
			if (!a.getId().equals(airport.getId()) && airport.getDistanceTo(a) < dist) {
				dist = airport.getDistanceTo(a);
				closest = a;
			}
		}
		return closest;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < airports.size(); i++) {
			sb.append(airports.get(i).getId());
			sb.append(' ');
			sb.append(airports.get(i).getCity());
			sb.append('\n');
		}
		return sb.toString();
	}
}

package TaskStationery;

import java.util.ArrayList;
import java.util.List;

public class Worker {

	private String name;
	private List<Stationery> stationaries = new ArrayList<Stationery>();

	public List<Stationery> getStationaries() {
		return stationaries;
	}

	public void setStationaries(List<Stationery> stationaries) {
		this.stationaries = stationaries;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	boolean empty = stationaries.isEmpty();

	public void addStationary(Stationery stationery) {
		if (empty = true) {
			stationaries.add(stationery);
		} else {
			for (Stationery item : stationaries) {
				if (item.getTitle().equals(stationery.getTitle())) {
					int itemCount = item.getCount();
					int stationeryCount = stationery.getCount();
					itemCount += stationeryCount;
					item.setCount(itemCount);
				} else {
					stationaries.add(stationery);
				}
			}

		}
	}

}

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

	public void addStationary(Stationery stationery) {
		if (stationaries.isEmpty()) {
			stationaries.add(stationery);
		} else {
			boolean addStationary = true;
			for (Stationery item : stationaries) {
				boolean isTitleEqual = item.getTitle().equals(stationery.getTitle());
				if (isTitleEqual) {
					int itemCount = item.getCount();
					int stationeryCount = stationery.getCount();
					itemCount += stationeryCount;
					item.setCount(itemCount);
					addStationary = false;
				}
			}
			if (addStationary) {
				stationaries.add(stationery);
			}
		}
	}
}

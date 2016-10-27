package TaskStationery;

import java.util.Comparator;

public class SortingByPrice implements Comparator<Stationery> {

	public int compare(Stationery obj1, Stationery obj2) {

		double price1 = obj1.getPrice();
		double price2 = obj2.getPrice();

		if (price1 > price2) {
			return 1;
		} else if (price1 < price2) {
			return -1;
		} else {
			return 0;
		}
	}
}

package TaskStationery;

import java.util.Comparator;

public class SortingByTitle implements Comparator<Stationery> {

	public int compare(Stationery obj1, Stationery obj2) {
		
		String str1 = obj1.getTitle();
		String str2 = obj2.getTitle();

		return str1.compareTo(str2);
	}
}
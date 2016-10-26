package TaskStationery;

import java.util.List;

public class CalculateServiceImpl implements CalculateService {

	public double calculateAllStationeryCost(Worker worker) {
		List<Stationery> stationaries = worker.getStationaries();
		double sum = 0;
		for (Stationery sta : stationaries) {
			sum += sta.getPrice() * sta.getCount();
		}
		return sum;

	}

}

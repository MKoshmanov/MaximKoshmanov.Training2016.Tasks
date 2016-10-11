package TaskStationery;



public class Worker extends Pencil {
	public static void main(String[] args) {
		double totalSum1;
		double totalSum2;
		Worker Ivanov = new Worker();
		System.out.println("The worker Ivanov\n");
		Ivanov.addPen(5);
		Ivanov.addMarker(4);
		Ivanov.addPencil(3);
		Ivanov.addMarker(2);
		Ivanov.addPen(5);
		Ivanov.cashPen();
		
		totalSum1 = Ivanov.getTotalPriceMarker() + Ivanov.getTotalPricePen() + Ivanov.getTotalPricePencil();
		System.out.println("The sum of all stationery: " + totalSum1 + " BLR");
		System.out.println();
		
		Worker Petrov = new Worker();		
		System.out.println("The worker Petrov\n");
		Petrov.addPen(8);
		Petrov.addPencil(3);
		Petrov.addPencil(4);
		Petrov.cashPencil();
		Petrov.addMarker(0);
		totalSum2 = Petrov.getTotalPriceMarker() + Petrov.getTotalPricePen() + Petrov.getTotalPricePencil();
		System.out.println("The sum of all stationery: " + totalSum2 + " BLR");
		System.out.println();
	}
	}
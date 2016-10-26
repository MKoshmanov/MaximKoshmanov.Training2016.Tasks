package TaskStationery;

public class Application {

	public static void main(String[] args) {

		CalculateService calculateService = new CalculateServiceImpl();

		WritingProduct pencil = new WritingProduct("pencil", 0.17, 1, "grey");
		WritingProduct gelPen = new WritingProduct("gel pen", 0.78, 1, "black");
		WritingProduct ballpen = new WritingProduct("ballpen", 0.36, 1, "blue");
		PaperProduct notebook = new PaperProduct("notebook", 5.3, 1, 160);
		PaperProduct paperForPrinter = new PaperProduct("paper for printer", 7.3, 1, 500);

		Worker engineer = new Worker();
		engineer.setName("engineer");

		engineer.addStationary(gelPen);
		engineer.addStationary(notebook);
		engineer.addStationary(ballpen);
		engineer.addStationary(paperForPrinter);
		engineer.addStationary(gelPen);
		engineer.addStationary(pencil);
		engineer.addStationary(paperForPrinter);

		double sumOfStationery = calculateService.calculateAllStationeryCost(engineer);

		System.out.println("Total cost " + engineer.getName() + "'s" + " stationery = " + sumOfStationery);

	}
}

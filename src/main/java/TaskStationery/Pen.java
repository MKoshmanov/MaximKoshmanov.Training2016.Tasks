package TaskStationery;

import java.util.ArrayList;

class Pen {
	private int index = 0;
	private int pen;
	private boolean firstAdd = true;
	private boolean calculated = false;
	private double pricePen = 0.58;
	private double totalPricePen;
		
	ArrayList<Integer> workerList = new ArrayList<Integer>();
	
	protected void addPen(int p) {
		pen = p;
		if (firstAdd == true) {
			workerList.add(pen);
			index = workerList.indexOf(pen);
			System.out.println("The worker has " + workerList.get(index) + " pens");
			firstAdd = false;
			calculated = true;
			}
		else {
			System.out.print("The worker take " +  pen + " pens ");
			workerList.set(index, workerList.get(index) + pen);
			System.out.println("and now he has " + workerList.get(index) + " pens");
			}
		}

	public double getTotalPricePen() {
		totalPricePen = workerList.get(index) * pricePen;
		return totalPricePen;
		}
	public void setTotalPricePen(double totalPricePen) {
		this.totalPricePen = totalPricePen;
	}
	
	protected double cashPen () {
		if (calculated == true) {
			totalPricePen = workerList.get(index) * pricePen;
			System.out.println("Pens price " + totalPricePen + " BLR");
			}
		else {
			System.out.println("The worker hasn't pen");
			}
		return totalPricePen;
	}
}
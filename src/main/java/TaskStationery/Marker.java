package TaskStationery;

class Marker extends Pen {
	private int index = 1;
	private int marker = 0 ;
	private boolean firstAdd = true;
	private boolean calculated = false;
	private double priceMarker = 1.22;
	protected double totalPriceMarker;
		
	protected void addMarker(int m) {
		marker = m;
		if (firstAdd == true) {
			workerList.add(marker);
			index = workerList.indexOf(marker);
			System.out.println("The worker has " + workerList.get(index) + " markers");
			firstAdd = false;
			calculated = true;
			}
		else {
			System.out.print("The worker take " +  marker + " markers ");
			workerList.set(index, workerList.get(index) + marker);
			System.out.println("and now he has " + workerList.get(index) + " markers");
			calculated = true;
			}
		}
	public double getTotalPriceMarker() {
		totalPriceMarker = workerList.get(index) * priceMarker;
		return totalPriceMarker;
	}
	public void setTotalPriceMarker(double totalPriceMarker) {
		this.totalPriceMarker = totalPriceMarker;
	}
	
	protected double cashMarker () {
		if (calculated == true) {
			totalPriceMarker = workerList.get(index) * priceMarker;
			System.out.println("Markers price " + totalPriceMarker + " BLR");
			}
		else {
			System.out.println("The worker hasn't marker");
			}
		return totalPriceMarker;
		}
	}

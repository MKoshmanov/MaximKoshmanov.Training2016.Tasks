package TaskStationery;

class Pencil extends Marker {
	private int index = 2;
	private int pencil;
	private boolean firstAdd = true;
	private boolean calculated = false;
	private double pricePencil = 0.29;
	protected double totalPricePencil;
	
	
	protected void addPencil(int pen) {
		pencil = pen;
		if (firstAdd == true) {
		workerList.add(pencil);
		index = workerList.indexOf(pencil);
		System.out.println("The worker has: " + workerList.get(index) + " pencils");
		firstAdd = false;
		calculated = true;
		} 
		else {
			System.out.print("The worker take " +  pencil + " pencils ");
			workerList.set(index, workerList.get(index) + pencil);
			System.out.println("and now he has: " + workerList.get(index) + " pencils");
			calculated = true;
		} 
		}
	public double getTotalPricePencil() {
		totalPricePencil = workerList.get(index) * pricePencil;
		return totalPricePencil;
	}
	public void setTotalPricePencil(double totalPricePencil) {
		this.totalPricePencil = totalPricePencil;
	}
	protected double cashPencil () {
		if (calculated == true) {
			totalPricePencil = workerList.get(index) * pricePencil;
			System.out.println("Pencils price " + totalPricePencil + " BLR");
			}
		else {
			System.out.println("The worker hasn't pencil");
			}
		return totalPricePencil;
		}
	}

	
	

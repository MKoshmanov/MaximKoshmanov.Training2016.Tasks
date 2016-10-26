package TaskStationery;

class WritingProduct extends Stationery {
	private String color;

	public WritingProduct(String title, double price, int count, String color) {
		super(title, price, count);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

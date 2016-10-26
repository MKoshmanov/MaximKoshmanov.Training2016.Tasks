package TaskStationery;

public abstract class Stationery {
	private String title;

	private double price;

	private int count;

	public Stationery(String title, double price, int count) {
		this.title = title;
		this.price = price;
		this.count = count;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}

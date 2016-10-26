package TaskStationery;

class PaperProduct extends Stationery {
	private int pageCount;

	public PaperProduct(String title, double price, int count, int pageCount) {
		super(title, price, count);
		this.pageCount = pageCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

}

package ItemNameAndCount;

public class ItemNameAndCount {
	private String itemname;
	private int count = 0;

	/** 商品名・個数の設定 */
	public ItemNameAndCount(String name) {
		this.itemname = name;
		this.count++;
	}

	/** 個数の加算 */
	public void count() {
		this.count++;
	}

	/** Getter */
	public String getItemname() {
		return itemname;
	}
	public int getCount() {
		return count;
	}

}

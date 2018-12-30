package Item;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="item")
public class Item {

	/** 商品ID・商品名・価格 */
	@XmlElement(name="itemid")
	private String itemid;
	@XmlElement(name="itemname")
	private String itemname;
	@XmlElement(name="price")
	private int price;

	/** Getter */
	public String getItemid() {
		return itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public int getPrice() {
		return price;
	}

}

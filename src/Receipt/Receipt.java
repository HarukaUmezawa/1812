package Receipt;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import Item.Item;

@XmlRootElement(name="receipt")
public class Receipt {

	/** 商品リスト */
	@XmlElementWrapper(name="items")
	@XmlElement(name="item")
	private List<Item> itemsList;

	/** Getter */
	public List<Item> getItemsList() {
		return itemsList;
	}
}

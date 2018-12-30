package Main;

import java.io.File;
import java.util.TreeMap;

import javax.xml.bind.JAXB;

import Item.Item;
import ItemNameAndCount.ItemNameAndCount;
import Receipt.Receipt;

public class Main {

	public static void main(String[] args) {
		int sum = 0;
		TreeMap<String, ItemNameAndCount> map = new TreeMap<>();

		/** listFiles()でファイル一覧を配列として読み込む
		 *  ファイル一覧をループで回して処理 */
		File files = new File("※ディレクトリ※");
		File[] filelist = files.listFiles();

			/** NullPointerExceptionチェック */
			if(filelist != null) {

				/** test_00xファイルを1つ取り出して処理
				 *  XMLファイルからインスタンスを生成 */
				for(int i=0; i<filelist.length; i++){
					Receipt xmlreceipt = JAXB.unmarshal(filelist[i] , Receipt.class);

					/** 商品ID・商品名・価格の取得
					 *  個数の加算
					 *  合計金額の加算 */
					for(Item item : xmlreceipt.getItemsList()){
						String id = item.getItemid();
						String name = item.getItemname();
						int price = item.getPrice();

						if(!map.containsKey(id)) {
							map.put(id,new ItemNameAndCount(name));
						}else {
							map.get(id).count();
						}
					sum += price;
					}
				}
			}else{
				System.out.println("null");
			}

		/** 出力 */
		for(String key : map.keySet()) {
			System.out.println("商品名："+ map.get(key).getItemname() +"購入個数"+map.get(key).getCount());
		}
		System.out.println("合計金額"+ sum +"円");
	}
}

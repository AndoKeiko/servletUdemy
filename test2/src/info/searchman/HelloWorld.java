package info.searchman;

import java.util.ArrayList;

public class HelloWorld {

	public static void main(String[] args) {

		ItemBean item1 = new ItemBean();
		ItemBean item2 = new ItemBean();		
		
		item1.setId(1010);
		item1.setName("商品１");
		item1.setPrice(800);
		
		item2.setId(102);
		item2.setName("商品２");
		item2.setPrice(700);
		
		ArrayList<ItemBean> itemList = new ArrayList<>();
		itemList.add(item1);
		itemList.add(item2);
		
		for (ItemBean item : itemList) {
			System.out.println(item.getId()+item.getName()+item.getPrice());
		}
		
	}

}

package com.gildedrose;

import com.gildedrose.item.Item;

class GildedRose {
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {

			items[i].decrementItemQuality();
			items[i].addQuality();
			
			items[i].decrementSellin();

			if (items[i].sellIn < 0) {
				items[i].decrementItemQuality();
				items[i].addQuality();
			}
		}
	}
}
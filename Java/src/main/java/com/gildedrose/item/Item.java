package com.gildedrose.item;

public class Item {

	public String name;
	public int sellIn;
	public int quality;

	public Item(String name, int sellIn, int quality) {
		this.name = name;
		this.sellIn = sellIn;
		this.quality = quality;
	}
	
	public boolean qualityIsPositive() {
		return this.quality > 0;
	}

	public void decrementItemQuality() {
		if (this.qualityIsPositive()) {
			this.quality = this.quality - 1;
		}
	}
	
	public void decrementSellin() {
		this.sellIn = this.sellIn -1;
	}
	
	public void addQuality() {
		this.quality = verifyQuality(this.quality + 1);
	}
	
	public int verifyQuality(int quality) {
		return quality > 50 ? 50:quality;
	}


	@Override
	public String toString() {
		return this.name + ", " + this.sellIn + ", " + this.quality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSellIn() {
		return sellIn;
	}

	public void setSellIn(int sellIn) {
		this.sellIn = sellIn;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

}

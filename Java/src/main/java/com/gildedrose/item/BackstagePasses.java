package com.gildedrose.item;

public class BackstagePasses extends Item {

	private boolean sold;

	@Override
	public void addQuality() {
		if (this.sellIn > 10) {
			this.quality = this.verifyQuality(this.quality + 1);
		}
		if (this.sellIn <= 10) {
			this.quality =  this.verifyQuality(this.quality + 2);
		}
		if (this.sellIn <= 5) {
			this.quality =  this.verifyQuality(this.quality + 3);
		}
	}
	
	@Override
	public void decrementItemQuality() {
		quality = this.sellIn <= 0 ? 0:quality;
	}

	public BackstagePasses(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		this.sold = false;
	}

	public boolean isSold() {
		return sold;
	}

	public void setSold(boolean sold) {
		this.sold = sold;
	}

}

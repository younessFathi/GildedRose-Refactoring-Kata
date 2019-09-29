package com.gildedrose.item;

public class Sulfuras extends AgedBrie {
	public Sulfuras(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		this.quality = this.quality > 80 ? 80 : this.quality;
	}

	@Override
	public void decrementSellin() {
	}
}

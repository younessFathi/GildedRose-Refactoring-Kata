package com.gildedrose.item;

public class AgedBrie extends Item{
	
	public AgedBrie(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}
	
	@Override
	public void decrementItemQuality() {
		
	}
	
}

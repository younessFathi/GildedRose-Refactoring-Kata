package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.gildedrose.item.AgedBrie;
import com.gildedrose.item.BackstagePasses;
import com.gildedrose.item.Item;
import com.gildedrose.item.Sulfuras;

public class GildedRoseTest {

	private Item itemTest;
	private Item[] items;

	@Before
	public void init() {
		itemTest = new Item("test", 20, 10);
		items = new Item[] { new Item("+5 Dexterity Vest", 10, 20), //
				new AgedBrie("Aged Brie", 0, 0), //
				new Item("Elixir of the Mongoose", 5, 7), //
				new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80), //
				new Sulfuras("Sulfuras, Hand of Ragnaros", -1, 80),
				new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 15, 20),
				new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 10, 49),
				new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 5, 49),
				// this conjured item does not work properly yet
				new Item("Conjured Mana Cake", 3, 6) };
	}

	@Test
	public void verifyQualityContentTest() {
		itemTest.addQuality();
		assertEquals(11, itemTest.quality);
	}

	@Test
	public void updateQualityTest() {
		GildedRose gildedRose = new GildedRose(items);
		gildedRose.updateQuality();
		// le cas normal Sellin value == 15
		assertTrue(items[5].quality == 21);
		// la "Quality value" s'augmante par 2 si "Sellin value" <= à 10
		// Sellin value == 10
		assertTrue(items[6].quality == 50);
		// la "Quality value" s'augmante par 3 si "Sellin value" <= à 5.
		assertTrue(items[7].quality == 50);
		assertTrue(items[1].quality == 2);
	}

}

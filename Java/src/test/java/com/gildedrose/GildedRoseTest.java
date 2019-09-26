package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GildedRoseTest {
	
	private Item itemTest;
	
	@Before
	public void init() {
		itemTest = new Item("test", 20, 10);
	}

    @Test
    public void qualityIsPositiveTest() {
    	boolean isPositive = GildedRose.qualityIsPositive(itemTest);
    	assertTrue(isPositive);
    }
    
    @Test
    public void qualityIsNegativeTest() {
    	itemTest.setQuality(-2);
    	boolean isNegative = GildedRose.qualityIsPositive(itemTest);
    	assertFalse(isNegative);
    }

    @Test
    public void reduceQualityValueBySellinValueUnitTest() {
    	itemTest.setQuality(-2);
    	boolean isNegative = GildedRose.qualityIsPositive(itemTest);
    	assertFalse(isNegative);
    }
    
    @Test
    public void decrementItemQualityTest() {
    	GildedRose.decrementItemQuality(itemTest);
    	assertEquals(9, itemTest.getQuality());
    }

}

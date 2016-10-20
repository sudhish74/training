package com.htcinc.entity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by peris on 10/19/16.
 */
public class HoldingsTest {
    @Test
    public void newObject() throws Exception {
        Holdings holdings = new Holdings();
        assertNotNull(holdings);
    }

    @Test
    public void testId() throws Exception {
        Holdings holdings = new Holdings();
        holdings.setId(2);
        holdings.getId();
        assertNotNull(holdings);
        assertTrue(holdings.getId() == 2);
    }

    @Test
    public void testContent() throws Exception {
        Holdings holdings = new Holdings();
        holdings.setContent("Test Holding");
        holdings.getContent();
        assertNotNull(holdings);
        assertTrue(holdings.getContent().equalsIgnoreCase("Test Holding"));
    }

    @Test
    public void holdingsItem() throws Exception {
        Holdings holdings = new Holdings();
        List<Item> itemList = new ArrayList();
        holdings.setItem(itemList);
        List<Item> itemHolding = holdings.getItem();
        assertNotNull(itemHolding);
    }
}

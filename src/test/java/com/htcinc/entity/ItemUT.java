package com.htcinc.entity;

import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by sudhishk on 20/10/16.
 */
public class ItemUT {

    /*
        Test new Object
     */
    @Test
    public void newBib() throws Exception {
        Item item = new Item();
        assertNotNull(item);
    }

    @Test
    public void testId() throws Exception {
        Item item = new Item();
        item.setId(2);
        item.getId();
        assertNotNull(item);
        assertTrue(item.getId() == 2);
    }

    @Test
    public void testContent() throws Exception {
        Item item = new Item();
        item.setContent("Test");
        item.getContent();
        assertNotNull(item);
        assertTrue(item.getContent().equalsIgnoreCase("test"));
    }
}

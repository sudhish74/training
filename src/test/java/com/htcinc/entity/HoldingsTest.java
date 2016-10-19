package com.htcinc.entity;

import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by peris on 10/19/16.
 */
public class HoldingsTest {
    @Test
    public void newObject() throws Exception {
        Holdings holdings = new Holdings();
        assertNotNull(holdings);
    }
}

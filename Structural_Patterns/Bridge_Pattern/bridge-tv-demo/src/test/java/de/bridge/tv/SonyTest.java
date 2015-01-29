package de.bridge.tv;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SonyTest {

    private static Sony mySony = null;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        if (mySony == null) {
            mySony = new Sony();
            assertNotNull(mySony);
        }
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        if (mySony != null) {
            mySony = null;
        }
        assertNull(mySony);

    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void SonyOff() {
        mySony.off();
    }

    @Test
    public void SonyOn() {
        mySony.on();
    }

    @Test
    public void SonyTuneChannel() {
        mySony.tuneChannel(3);
    }

}

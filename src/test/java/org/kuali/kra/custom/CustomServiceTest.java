package org.kuali.kra.custom;

import org.junit.Assert;
import org.junit.Test;

public class CustomServiceTest {
    @Test
    public void testCustomTest() throws Exception {
        
        CustomService service  = new CustomServiceImpl();
        
        
        service.customTest();

        Assert.assertTrue(true);
        
    }

}

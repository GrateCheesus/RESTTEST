package controllerTests;

import org.junit.jupiter.api.*;
import mm.controllers.mmController;

import javax.ws.rs.core.Response;

public class MaintenanceTests {
    @Test
    public void testDefaultOnStartup(){
        mmController mcDefault = new mmController();
        //arrange/expected value
        String expected = ("-");
        // act
        mcDefault.PostSample("-");
        Response actual = mcDefault.GetStatus();
        // assert
        Assertions.assertEquals(expected, actual.getEntity().toString());
    }
    @Test
    public void testSampleValue(){
        mmController mcDefault = new mmController();
        //Arrange
        String expected = ("!2345");
        //act
        mcDefault.PostSample("!2345");
        Response actual = mcDefault.GetStatus();
        //assert
        Assertions.assertEquals(expected, actual.getEntity().toString());
    }
    @Test
    public void testResetFunction(){
        mmController mcDefault = new mmController();
        //Arrange
        String expected = ("-");
        //act
        mcDefault.PreSample("reset");
        Response actual = mcDefault.GetStatus();
        //assert
        Assertions.assertEquals(expected, actual.getEntity().toString());
    }
}

package test;


import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class JoogiTest{

    @Test
    public void Test(){
      String vastus= ("Õlu mass: 0.75 ja hind: 0.55");
      assertEquals("Õlu mass:",vastus.substring(0,9));
      assertEquals(0.75, Double.parseDouble(vastus.substring(11,13)),0.1);
      assertEquals(0.55, Double.parseDouble(vastus.substring(25,27)),0.1);

    }
}

/*Õlu mass: 0.75 ja hind: 0.55*/
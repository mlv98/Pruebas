import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RestaTest {
    
    @Test
    public void restaPositivos(){
        System.out.println("Restando dos numeros positivos");

        Resta r = new Resta(5, 2);
        assertTrue ("El resultado de la resta es 3", r.restar() == 3);


    }


}

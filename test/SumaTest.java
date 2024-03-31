import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SumaTest {

    @Test

    public void sumaPositivos() {
        System.out.println("Sumando dos numeros positivos");

        Suma s = new Suma(2, 3);

        assertTrue(s.sumar() == 5);

    }

}

import org.junit.Assert;
import org.junit.Test;

public class TestCoche {
    @Test
    public void test_crearCoche(){
        Coche nuevoCoche = new Coche();
    }
    @Test
    public void test_AlCrearCoche_SuVelocidad_esCero(){
        Coche nuevoCoche = new Coche();
        Assert.assertEquals(0,nuevoCoche.velocidad);
    }
    @Test
    public void test_AlAcelerar_UnCoche_SuVelocidad_Aumenta(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar(30);
        Assert.assertEquals(30,nuevoCoche.velocidad);
    }
}

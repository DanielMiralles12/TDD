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
}

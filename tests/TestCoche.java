import org.junit.Assert;
import org.junit.Test;

public class TestCoche {
    @Test
    public void test_crearCoche_DanielMiralles() {
        Coche nuevoCoche = new Coche();
    }

    @Test
    public void test_AlCrearCoche_SuVelocidad_esCero_DanielMiralles() {
        Coche nuevoCoche = new Coche();
        Assert.assertEquals(0, nuevoCoche.velocidad);
    }

    @Test
    public void test_AlAcelerar_UnCoche_SuVelocidad_Aumenta_DanielMiralles() {
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar(30);
        Assert.assertEquals(30, nuevoCoche.velocidad);
    }
    @Test
    public void test_AlDecelerar_UnCoche_SuVelocidad_Disminuye_NoPuedeSer_MenorQue0_DanielMiralles() {
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.deacelerar(80);
        Assert.assertEquals(0, nuevoCoche.velocidad);
    }

}
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CE015 {
    Avaliacao avaliacao = new Avaliacao();
   @Test
    public void CT018(){
       Assertions.assertEquals("Prova Extra.",
           avaliacao.avalia(3.00,3.00,16,64));
    }

    @Test
    public void CT019(){
        Assertions.assertEquals("Prova Extra.",
            avaliacao.avalia(3.01,3.00,16,64));
    }
    @Test
    public void CT020(){
        Assertions.assertEquals("Prova Extra.",
            avaliacao.avalia(3.00,3.01,16,64));
    }
    @Test
    public void CT021(){
        Assertions.assertEquals("Prova Extra.",
            avaliacao.avalia(5.99,6.00,16,64));
    }
    @Test
    public void CT022(){
        Assertions.assertEquals("Prova Extra.",
            avaliacao.avalia(6.00,5.99,16,64));
    }
}

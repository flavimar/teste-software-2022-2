import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CE013 {
    Avaliacao avaliacao = new Avaliacao();
   @Test
    public void CT013(){
       Assertions.assertEquals("Reprovado por Falta.",
               avaliacao.avalia(1.00,3.00,17,64));
    }
}

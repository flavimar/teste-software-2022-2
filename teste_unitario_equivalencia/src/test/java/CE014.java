import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CE014 {
    Avaliacao avaliacao = new Avaliacao();
   @Test
   public void CT014(){
           Assertions.assertEquals("Reprovado por Média.",
                   avaliacao.avalia(1.00,3.00,16,64));
   }
    @Test
    public void CT015(){
        Assertions.assertEquals("Reprovado por Média.",
            avaliacao.avalia(1.00,3.00,15,64));
    }
    @Test
    public void CT016(){
        Assertions.assertEquals("Reprovado por Média.",
            avaliacao.avalia(2.99,3.00,8,64));
    }
    @Test
    public void CT017(){
        Assertions.assertEquals("Reprovado por Média.",
            avaliacao.avalia(3.00,2.99,8,64));
    }
}

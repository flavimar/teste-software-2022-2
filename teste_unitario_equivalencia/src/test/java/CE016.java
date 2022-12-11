import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CE016 {
    Avaliacao avaliacao = new Avaliacao();
   @Test
    public void CT023(){
       Assertions.assertEquals("Aprovado.",
           avaliacao.avalia(6.00,6.00,8,64));
    }

    @Test
    public void CT024(){
        Assertions.assertEquals("Aprovado.",
            avaliacao.avalia(6.01,6.00,8,64));
    }

    @Test
    public void CT025(){
        Assertions.assertEquals("Aprovado.",
            avaliacao.avalia(6.00,6.01,8,64));
    }
}

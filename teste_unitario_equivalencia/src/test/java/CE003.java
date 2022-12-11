import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CE003 {
    Avaliacao avaliacao = new Avaliacao();
   @Test
    public void CT003(){
       Assertions.assertDoesNotThrow(()->{avaliacao.avalia(10.00,3.00,3,4);});
    }
}

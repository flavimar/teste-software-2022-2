import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CE006 {
    Avaliacao avaliacao = new Avaliacao();
   @Test
    public void CT006(){
       Assertions.assertDoesNotThrow(()->{
           avaliacao.avalia(3.00,10.00,3,4);
       });
    }
}

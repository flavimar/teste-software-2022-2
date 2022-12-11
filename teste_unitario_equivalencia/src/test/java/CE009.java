import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CE009 {
    Avaliacao avaliacao = new Avaliacao();
   @Test
    public void CT009(){
       Assertions.assertDoesNotThrow(()->{
           avaliacao.avalia(10.00,3.00,0,4);
       });
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CE008 {
   @Test
    public void CT008(){
       Assertions.assertDoesNotThrow(()->{
           Avaliacao avaliacao = new Avaliacao();
           avaliacao.avalia(10.00,3.00,1,4);
       });
    }
}

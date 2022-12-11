import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CE002 {
   @Test
    public void CT002(){
       Assertions.assertThrows(ValoresInvalidosException.class, ()->{
           Avaliacao avaliacao = new Avaliacao();
           avaliacao.avalia(10.01,3.00,3,4);
       });
    }
}

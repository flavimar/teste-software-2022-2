import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CE001 {
   @Test
    public void CT001(){
       Assertions.assertThrows(ValoresInvalidosException.class, ()->{
           Avaliacao avaliacao = new Avaliacao();
           avaliacao.avalia(-0.01,3.00,3,4);
       });
    }
}

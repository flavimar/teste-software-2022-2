import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CE009 {
   @Test
    public void CT009(){
       Assertions.assertThrows(ValoresInvalidosException.class, ()->{
           Avaliacao avaliacao = new Avaliacao();
           avaliacao.avalia(10.00,3.00,0,4);
       });
    }
}

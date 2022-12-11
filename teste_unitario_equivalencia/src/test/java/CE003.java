import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CE003 {
   @Test
    public void CT003(){
       Assertions.assertThrows(ValoresInvalidosException.class, ()->{
           Avaliacao avaliacao = new Avaliacao();
           avaliacao.avalia(10.00,3.00,3,4);
       });
    }
}

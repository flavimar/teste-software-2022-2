import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CE006 {
   @Test
    public void CT006(){
       Assertions.assertThrows(ValoresInvalidosException.class, ()->{
           Avaliacao avaliacao = new Avaliacao();
           avaliacao.avalia(3.00,10.00,3,4);
       });
    }
}

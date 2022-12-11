import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CE012 {
   @Test
    public void CT012(){
       Assertions.assertThrows(ValoresInvalidosException.class, ()->{
           Avaliacao avaliacao = new Avaliacao();
           avaliacao.avalia(10.00,3.00,2,0);
       });
    }
}

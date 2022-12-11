import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CE004 {
   @Test
    public void CT004(){
       Assertions.assertThrows(ValoresInvalidosException.class, ()->{
           Avaliacao avaliacao = new Avaliacao();
           avaliacao.avalia(3.00,-0.01,3,4);
       });
    }
}

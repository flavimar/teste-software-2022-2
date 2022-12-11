import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CE005 {
   @Test
    public void CT005(){
       Assertions.assertThrows(ValoresInvalidosException.class, ()->{
           Avaliacao avaliacao = new Avaliacao();
           avaliacao.avalia(3.00,-10.01,3,4);
       });
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CE012{
    Avaliacao avaliacao = new Avaliacao();
   @Test
    public void CT012(){
       Assertions.assertDoesNotThrow( ()->{
           avaliacao.avalia(10.00,3.00,0,0);
       });
    }
    @Test
    public void CT026(){
        Assertions.assertThrows(ValoresInvalidosException.class, ()->{
            avaliacao.avalia(10.00,3.00,1,0);
        });
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CE014 {
   @Test
   public void CT014(){
           Avaliacao avaliacao = new Avaliacao();
           avaliacao.avalia(1.00,3.00,17,64);
   }
    @Test
    public void CT015(){
            Avaliacao avaliacao = new Avaliacao();
            avaliacao.avalia(1.00,3.00,15,64);
    }
    @Test
    public void CT016(){
            Avaliacao avaliacao = new Avaliacao();
            avaliacao.avalia(2.99,3.00,8,64);
    }
    @Test
    public void CT017(){
            Avaliacao avaliacao = new Avaliacao();
            avaliacao.avalia(3.00,2.99,8,64);
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CE016 {
   @Test
    public void CT023(){
           Avaliacao avaliacao = new Avaliacao();
           avaliacao.avalia(6.00,6.00,8,64);
    }

    @Test
    public void CT024(){
            Avaliacao avaliacao = new Avaliacao();
            avaliacao.avalia(6.01,6.00,8,64);
    }

    @Test
    public void CT025(){
            Avaliacao avaliacao = new Avaliacao();
            avaliacao.avalia(6.00,6.01,8,64);
    }
}

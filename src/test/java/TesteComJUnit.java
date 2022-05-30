import org.junit.Assert;
import org.junit.Test;

public class TesteComJUnit {

    @Test
    public void primeiroTeste(){

        int soma = 1 + 2;
        int subtracao = 10 - 5;
        int divisao = 10 / 5;
        int multiplicacao = 10 * 10;

        Assert.assertEquals(3, soma);
        Assert.assertEquals(5, subtracao);
        Assert.assertEquals(2, divisao);
        Assert.assertEquals(100, multiplicacao);

    }

    @Test
    public void segundoTeste(){
        Assert.assertTrue(executaAcao());

    }

    private boolean executaAcao(){
        boolean ex = true;
        return ex;
    }
}

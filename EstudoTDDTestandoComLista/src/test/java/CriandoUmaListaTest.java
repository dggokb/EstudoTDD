import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CriandoUmaListaTest {
    @Test
    public void deveConseguirSomarDoisItensDeUmaLista() {
        int valorEsperadoDaSoma = 4;
        CriandoUmaLista criandoUmaLista = new CriandoUmaLista();

        int somaDeValoresDeUmaLista = criandoUmaLista.somaDeValoresDeUmaLista();

        Assert.assertEquals(valorEsperadoDaSoma, somaDeValoresDeUmaLista);
    }
}
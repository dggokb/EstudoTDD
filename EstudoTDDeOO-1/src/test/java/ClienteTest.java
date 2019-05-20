import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    String nomeDoCliente;
    Double valorDoPedido;
    String preferenciaDoCliente;

    @BeforeEach
    void setUp() {
        nomeDoCliente = "Carol";
        valorDoPedido = 650.00;
        preferenciaDoCliente = "Oriental";
    }

    @Test
    public void deveConseguirSerUmClienteNoRestaurante() {
        Cliente cliente = Cliente.criar(nomeDoCliente, valorDoPedido, preferenciaDoCliente);

        assertEquals(nomeDoCliente, cliente.getNome());
        assertEquals(valorDoPedido, cliente.getValorDoPedido());
        assertEquals(preferenciaDoCliente, cliente.getPreferencia());
    }

    @Test
    void deveConseguirPedirAConta() {
        Double valorTotalDoPedidoEsperado = 800.00;
        Cliente cliente = Cliente.criar(nomeDoCliente, valorDoPedido, preferenciaDoCliente);

        Double valorTotalDoPedido = cliente.getValorDaConta();

        Assertions.assertEquals(valorTotalDoPedidoEsperado, valorTotalDoPedido);
    }
}
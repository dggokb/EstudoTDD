import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    private String nomeDoCliente;
    private Double valorDoPedido;
    private String preferenciaDoCliente;

    @BeforeEach
    void setUp() {
        nomeDoCliente = "Carol";
        valorDoPedido = 650.00;
        preferenciaDoCliente = "Oriental";
    }

    @Test
    public void deveConseguirSerUmClienteNoRestaurante() {
        Cliente cliente = Cliente.criar(nomeDoCliente, valorDoPedido, preferenciaDoCliente);

        assertEquals(cliente.getNome(), nomeDoCliente);
        assertEquals(cliente.getValorDoPedido(), valorDoPedido);
        assertEquals(cliente.getPreferencia(), preferenciaDoCliente);
    }

    @Test
    void deveConseguirPedirAConta() {
        Double valorTotalDoPedido = 800.00;
        Cliente cliente = Cliente.criar(nomeDoCliente, valorDoPedido, preferenciaDoCliente);

        Double valorTotalDoPedidoEsperado = cliente.getValorDaConta();

        Assertions.assertEquals(valorTotalDoPedidoEsperado, valorTotalDoPedido);
    }
}
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RestauranteTest {

    private List<Funcionario> cheff;
    private List<Funcionario> garcon;
    private List<Cliente> cliente;
    private Double valorEmCaixa;
    private Restaurante restaurante;
    private String nomeDoCheffAContratar;
    private Double salarioDoCheffAContratar;
    private String linhaDeCozinhaDoCheffAContratar;

    @BeforeEach
    public void setUp() {
        cheff = new ArrayList<>();
        garcon = new ArrayList<>();
        cliente = new ArrayList<>();
        cheff.add(new CheffBuilder().criar());
        cheff.add(new CheffBuilder().criarComLinhaDeCozinha());
        garcon.add(new GarconBuilder().criar());
        cliente.add(new ClienteBuilder().criar());
        cliente.add(new ClienteBuilder().criarComPreferencia());
        valorEmCaixa = 10000.00;
        nomeDoCheffAContratar = "Juca";
        salarioDoCheffAContratar = 3000.00;
        linhaDeCozinhaDoCheffAContratar = "Oriental";
        restaurante = new Restaurante(cheff, garcon, cliente, valorEmCaixa);
    }

    @Test
    public void deveConseguirCriarUmRestaurante() {
        Restaurante umRestauranteDeveSerCriado = Restaurante.criar(cheff, garcon, cliente, valorEmCaixa);

        assertEquals(umRestauranteDeveSerCriado.getCheff(), cheff);
        assertEquals(umRestauranteDeveSerCriado.getGarcon(), garcon);
        assertEquals(umRestauranteDeveSerCriado.getCliente(), cliente);
        assertEquals(umRestauranteDeveSerCriado.getValorEmCaixa(), valorEmCaixa);
    }

    @Test
    public void deveConseguirRealizarOLevantamentoDoFaturamentoDoRestaurante() {
        Double faturamentoEperado = 7500.00;

        Double faturamentoObtidoDoRestaurante = restaurante.getFaturamento();

        assertEquals(faturamentoEperado, faturamentoObtidoDoRestaurante);
    }

    @Test
    void devoConseguirContratarUmCheffComLinhaDeCozinhaDefinida() {
        Boolean consigaContratarUmCheff = restaurante.contratarUmCheff(nomeDoCheffAContratar, salarioDoCheffAContratar, linhaDeCozinhaDoCheffAContratar);

        assertTrue(consigaContratarUmCheff);
    }

    @Test
    void devoConseguirContratarUmCheffSemLinhaDeCozinhaDefinida() {
        Boolean consigaContratarUmCheff = restaurante.contratarUmCheff(nomeDoCheffAContratar, salarioDoCheffAContratar);

        assertTrue(consigaContratarUmCheff);
    }

    @Test
    void devoConseguirContratarUmGarcon() {
        String nomeDoGarconAContratar = "Steban";
        Double salarioDoGarconAContratar = 500.00;

        Boolean consigaContratarUmGarcon = restaurante.contratarUmGarcon(nomeDoGarconAContratar, salarioDoGarconAContratar);

        assertTrue(consigaContratarUmGarcon);
    }

    @Test
    public void deveConseguirReceberUmNovoCliente() {
        String nomeDoNovoCliente = "Stuart";
        Double valorDoPedido = 300.00;

        Boolean consigaReceberUmNovoCliente = restaurante.receberUmCliente(cliente, nomeDoNovoCliente, valorDoPedido);

        assertTrue(consigaReceberUmNovoCliente);
    }
}
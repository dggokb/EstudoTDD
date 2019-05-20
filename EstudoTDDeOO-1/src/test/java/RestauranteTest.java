import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RestauranteTest {
    private List<Cheff> cheff;
    private List<Garcon> garcon;
    private List<Cliente> cliente;
    private Double valorEmCaixa;
    private Restaurante restaurante;
    private String nomeDoCheffAContratar;
    private Double salarioDoCheffAContratar;
    private String linhaDeCozinhaDoCheffAContratar;

    @BeforeEach
    public void setUp() {
        cheff = new ArrayList<Cheff>();
        garcon = new ArrayList<Garcon>();
        cliente = new ArrayList<Cliente>();
        cheff.add(new Cheff("Joao", 2000.00, "Vegetariano"));
        garcon.add(new Garcon("Antonio", 500.00));
        cliente.add(new Cliente("Gertrudis", 150.00));
        cliente.add(new Cliente("Nobrega", 200.00, "Vegetariano"));
        valorEmCaixa = 10000.00;
        nomeDoCheffAContratar = "Juca";
        salarioDoCheffAContratar = 3000.00;
        linhaDeCozinhaDoCheffAContratar = "Ocidental";
        restaurante = new Restaurante(cheff, garcon, cliente, valorEmCaixa);
    }

    @Test
    public void deveConseguirCriarUmRestaurante() {
        Restaurante umRestauranteDeveSerCriado = Restaurante.criar(cheff, garcon, cliente, valorEmCaixa);

        Assertions.assertEquals(umRestauranteDeveSerCriado.getCheff(), cheff);
        Assertions.assertEquals(umRestauranteDeveSerCriado.getGarcon(), garcon);
        Assertions.assertEquals(umRestauranteDeveSerCriado.getCliente(), cliente);
        Assertions.assertEquals(umRestauranteDeveSerCriado.getValorEmCaixa(), valorEmCaixa);
    }

    @Test
    public void deveConseguirRealizarOLevantamentoDoFaturamentoDoRestaurante() {
        Double faturamentoEperado = 7700.00;

        Double faturamentoObtidoDoRestaurante = restaurante.getFaturamento();

        Assertions.assertEquals(faturamentoEperado, faturamentoObtidoDoRestaurante);
    }

    @Test
    void devoConseguirContratarUmCheffComLinhaDeCozinhaDefinida() {
        Boolean consigaContratarUmCheff = restaurante.contratarUmCheff(nomeDoCheffAContratar, salarioDoCheffAContratar, linhaDeCozinhaDoCheffAContratar);

        Assertions.assertTrue(consigaContratarUmCheff);
    }

    @Test
    void devoConseguirContratarUmCheffSemLinhaDeCozinhaDefinida() {
        Boolean consigaContratarUmCheff = restaurante.contratarUmCheff(nomeDoCheffAContratar, salarioDoCheffAContratar);

        Assertions.assertTrue(consigaContratarUmCheff);
    }

    @Test
    void devoConseguirContratarUmGarcon() {
        String nomeDoGarconAContratar = "Steban";
        Double salarioDoGarconAContratar = 500.00;

        Boolean consigaContratarUmGarcon = restaurante.contratarUmGarcon(nomeDoGarconAContratar, salarioDoGarconAContratar);

        Assertions.assertTrue(consigaContratarUmGarcon);
    }

    @Test
    public void deveConseguirReceberUmNovoCliente() {
        String nomeDoNovoCliente = "Stuart";
        Double valorDoPedido = 300.00;

        Boolean consigaReceberUmNovoCliente = restaurante.receberUmCliente(cliente, nomeDoNovoCliente, valorDoPedido);

        Assertions.assertTrue(consigaReceberUmNovoCliente);
    }
}
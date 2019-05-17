import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RestauranteTest {
    List<Cheff> cheff;
    List<Garcon> garcon;
    List<Cliente> cliente;
    Double valorEmCaixa;
    Restaurante restaurante;
    String nomeDoCheffAContratar;
    Double salarioDoCheffAContratar;
    String linhaDeCozinhaDoCheffAContratar;

    @BeforeEach
    public void setUp() {
        cheff = new ArrayList<Cheff>();
        cheff.add(new Cheff("Joao", 2000.00, "Vegetariano"));
        garcon = Arrays.asList(new Garcon("Antonio", 500.00));
        cliente = Arrays.asList(new Cliente("Gertrudis", 150.00),
                new Cliente("Nobrega", 200.00, "Vegetariano"));
        valorEmCaixa = 10000.00;
        restaurante = new Restaurante(cheff, garcon, cliente, valorEmCaixa);
        nomeDoCheffAContratar = "Juca";
        salarioDoCheffAContratar = 3000.00;
        linhaDeCozinhaDoCheffAContratar = "Ocidental";
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
        Double faturamentoEperado = 7900.00;

        Double faturamentoObtidoDoRestaurante = restaurante.getFaturamento();

        Assertions.assertEquals(faturamentoEperado, faturamentoObtidoDoRestaurante);
    }

    @Test
    void devoConseguirContratarUmCheffComLinhaDeCozinhaDefinida() {
        Cheff contratandoUmCheff = Restaurante.contratar(nomeDoCheffAContratar, salarioDoCheffAContratar, linhaDeCozinhaDoCheffAContratar);

        Assertions.assertEquals(contratandoUmCheff.getNome(), nomeDoCheffAContratar);
        Assertions.assertEquals(contratandoUmCheff.getSalario(), salarioDoCheffAContratar);
        Assertions.assertEquals(contratandoUmCheff.getLinhaDeCozinha(), linhaDeCozinhaDoCheffAContratar);
    }

    @Test
    void devoConseguirContratarUmCheffSemLinhaDeCozinhaDefinida() {
        Boolean consigaContratarUmCheff = restaurante.contratar(nomeDoCheffAContratar, salarioDoCheffAContratar);

        Assertions.assertTrue(consigaContratarUmCheff);
    }
}
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.omg.PortableServer.POA;

import java.util.*;

class PokerTest {
    @Test
    public void deveEcontrarDuasCartasIguaisNoBaralho() {
        String encontrouDuasCartasIguaisValidacao = "Duas";
        Poker poker = new Poker();
        List<Integer> list = Arrays.asList(1, 2, 5, 2, 3);

        String encontrouDoisValores = poker.buscaDuasCartasIguais(list);

        Assert.assertEquals(encontrouDuasCartasIguaisValidacao, encontrouDoisValores);
    }

    @Test
    public void deveEncontrarTresCartasIguainsNoMesmoBaralho() {
        String encontrouTresCartasIguaisValidacao = "Tres";
        Poker poker = new Poker();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);

        String econtrouTresValores = poker.buscaTresCartasIguais(list);

        Assert.assertEquals(encontrouTresCartasIguaisValidacao, econtrouTresValores);
    }

    @Test
    public void deveEncontrarDoisParesDeCartasNoMesmoBaralho() {
        String encontraDoisParesIguaisValidacao = "DoisPares";
        Poker poker = new Poker();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        String encoutrouDoisPares = poker.buscaDeDoisParesIguaisOuFullHouse(list);

        Assert.assertEquals(encontraDoisParesIguaisValidacao, encoutrouDoisPares);
    }

    @Test
    public void deveEncontrarDuasCartasIguaisETresCartasIguais() {
        String encontraDoisParesIguaisValidacao = "FullHouse";
        Poker poker = new Poker();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);

        String econtrouFullHouse = poker.buscaDeDoisParesIguaisOuFullHouse(list);

        Assert.assertEquals(encontraDoisParesIguaisValidacao, econtrouFullHouse);
    }

    @Test
    public void deveEcontrarCartasEmSequencia() {
        String encontrarCartasEmSequenciaValidacao = "Flush";
        Poker poker = new Poker();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(5);

        String encontrouFlush = poker.buscaCartasEmSequencia(list);

        Assert.assertEquals(encontrarCartasEmSequenciaValidacao, encontrouFlush);
    }
}
package org.gabriel;

import org.gabriel.classesMecanicas.Item;
import org.gabriel.classesMecanicas.Loja;

public class Sessao {
    public static void main(String[] args) {
        Item pocaoCura = new Item("Poção de Cura", "Restaura uma parte da vida", "Consumível", 1, 15.0);
        Item espadaLendaria = new Item("Espada Lendária", "Arma inicial do herói", "Arma", 5, 250.0, 1, true);
        Item mochila = new Item("Mochila de Couro", "Aumenta a capacidade de carga", "Equipamento", 3, 80.0);

        Loja loja = new Loja();
        loja.adicionaItemEstoque(pocaoCura);
        loja.removeItemEstoque(5);
        System.out.println(loja.adicionaItemEstoque(pocaoCura).getNome() + " adicionado");
        System.out.println(loja.removeItemEstoque(1).getNome() + " removido");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hamburgueria;

import java.util.Arrays;
import java.util.List;

public class Pedido {
    private final List<String> cardapio = Arrays.asList("Cheddar Bacon", "X-Salada", "X-Burguer");

    public boolean verificarDisponibilidade(String nomeHamburguer) {
        return cardapio.contains(nomeHamburguer);
    }

    public String realizarPedido(String nomeHamburguer) {
        if (verificarDisponibilidade(nomeHamburguer)) {
            return "Pedido confirmado: " + nomeHamburguer;
        } else {
            return "Item não está disponível no cardápio";
        }
    }
}

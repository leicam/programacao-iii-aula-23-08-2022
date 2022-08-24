package br.edu.faculdadefacec;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Hashtable<String, Double> produtos =
                new Hashtable<String, Double>();

        produtos.put("pera", 1.59);
        produtos.put("maca", 2.99);

        System.out.println("Produto | Valor");

        for (Map.Entry<String, Double> produto
                : produtos.entrySet())
        {
            System.out.println(produto.getKey() +
                    " | " + produto.getValue());
        }

        System.out.println(produtos.get("pera"));
        System.out.println(produtos.get("banana"));
    }
}

package br.com.cursojava;

import br.com.cursojava.enums.TipoCombustivel;
import br.com.cursojava.modelos.Carro;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá");

        Carro carro = new Carro();
        carro.setNumeroDeRodas(4);
        carro.setTipoCombustivel(TipoCombustivel.GASOLINA);
        carro.setAno(2003);
        System.out.println(carro.toString());

        Carro carro2 = new Carro(2);
        carro2.setNumeroDeRodas(4);
        carro2.setTipoCombustivel(TipoCombustivel.GASOLINA);
        carro2.setAno(2003);
        System.out.println(carro2.toString());

        carro.setTipoCombustivel(TipoCombustivel.ELETRICIDADE);

        System.out.println(carro);

    }
}

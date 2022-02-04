package br.com.cursojava.modelos;

public class Carro extends Veiculo {

    private final Integer numeroDePortas;

    public Carro(){
        this.numeroDePortas = 4;
    }

    public Carro(Integer portas) {
        this.numeroDePortas = portas;
    }

    public Integer getNumeroDePortas() {
        return numeroDePortas;
    }

    public static void imprime() {

    }

    public void imprimeCaracteristicas() {
        System.out.println(super.toString());
    }

    @Override
    public String toString() {
        return "Carro{" +
                "numeroDePortas=" + numeroDePortas +
                ", numeroDeRodas=" + getNumeroDeRodas() +
                ", tipoCombustivel=" + getTipoCombustivel() +
                ", ano=" + getAno() +
                '}';
    }
}

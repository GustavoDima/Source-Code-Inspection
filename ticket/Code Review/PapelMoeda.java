package br.calebe.ticketmachine.core;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoeda {

    protected int valor;
    protected int quantidade;

    public PapelMoeda(int valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor;
    }
    //Excesso - getValor nunca é usado

    public int getQuantidade() {
        return quantidade;
    }
    //Excesso - getQauntidade nunca é usado

    //as variaveis valor e quantidade não possuem setters definidos
}

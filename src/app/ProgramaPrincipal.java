package app;

import domain.Pessoa;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa();

        //a linha de baixo acusa erro pois não consegue acessar o atributo nome
        // System.out.println(fulano.nome).


    }
}

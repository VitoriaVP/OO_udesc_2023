package app;

import domain.Pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        // Utilizando o construtor padrão
        Pessoa fulano = new Pessoa();
       fulano.setNome("Fulano da Silva");
       fulano.setEndereco("Rua dos programadores, 42");
       fulano.setNascimento( LocalDate.of(1990, 10, 13));
       fulano.setSalario( new BigDecimal("1000.99"));
       fulano.apresentarse();

       System.out.println();

        //Utilizando o construtor parametrizado
        Pessoa beltrano = new Pessoa("Beltrano da Silva",
                "Rua dos Programadores, 666",
                LocalDate.of(2000,2,15),
                new BigDecimal("1234.56")
                 );
                 beltrano.apresentarse();

       System.out.println();

       System.out.println(fulano);
       System.out.println(beltrano);

    }
}

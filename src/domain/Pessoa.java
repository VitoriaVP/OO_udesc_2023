package domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private String endereco;
    private LocalDate nascimento;
    private BigDecimal salario;

    // Construtor padrão
    public Pessoa() { }

    // Construtor parametrizado
    public Pessoa(String nome, String endereco, LocalDate nascimento, BigDecimal salario){
        this.nome = nome;
        this.endereco = endereco;
        this.nascimento = nascimento;
        this.salario = salario;
    }


    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public LocalDate getNascimento() { return nascimento; }
    public void setNascimento(LocalDate nascimento) { this.nascimento = nascimento; }

    public BigDecimal getSalario() { return salario; }
    public void setSalario(BigDecimal salario)  { this.salario = salario; }


    public void apresentarse() {
        System.out.println("Nome....:" + this.nome);
        System.out.println("Endereco...:" + this.endereco);
        System.out.println("Nascimento.....:" + this.nascimento);
        System.out.println("Salario....:" + this.salario);

    }
            @Override
            public String toString() {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", endereco='" + endereco + '\'' +
                    ", nascimento=" + nascimento +
                    ", salario=" + salario +
                    '}';

    }
}
package domain;


//como a classe pessoa esta dentro do mesmo pacote
// não ha necessidade de importa-la
public class TestaPacote {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        // utilizando metodos get/set
         p.setNome ("Zé da Silva");
        System.out.printf("Nome: " + p.getNome());

    }
}

import edu.debora.conteudo.classes.Cachorro;
import edu.debora.conteudo.javaBeans.JavaBeansExemplo;
import edu.debora.conteudo.metodos.DeclarandoMetodos;
import edu.debora.conteudo.tiposDeDados.primitivos.Int;
import edu.debora.conteudo.tiposDeDados.primitivos.Long;
import edu.debora.conteudo.tiposDeDados.primitivos.Short;

public class Main {
    public static void main(String[] args) {
        // DeclarandoMetodos.java. Para acessar o metodo nomecompleto() da classe
        // DeclarandoMetodos, primeiro chama o nome da classe DeclarandoMetodos para ter
        // acesso ao metodo nomeCompleto()
        String primeiroNome = "Deborass";
        String segundoNome = "Sousa";
        String nomeCompleto = DeclarandoMetodos.nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

        // Cachorro.java
        Cachorro cachorro = new Cachorro();
        cachorro.fazerBarulho();
        cachorro.dormir();

        // JavaBeansExemplo.java
        JavaBeansExemplo javaBeansExemplo = new JavaBeansExemplo();
        javaBeansExemplo.setNome(nomeCompleto);
        javaBeansExemplo.setIdade(36);
        javaBeansExemplo.setGenero('F');// deve passar o valor entre aspas simples

        System.out.println("Nome: " + javaBeansExemplo.getNome());
        System.out.println("Idade: " + javaBeansExemplo.getIdade());
        System.out.println("Genero: " + javaBeansExemplo.getGenero());

        // *## ByteCalculadora.java */
        byte idade1 = 10;
        byte idade2 = 25;

        byte soma = (byte) (idade1 + idade2);
        byte diferenca = (byte) (idade1 - idade2);

        System.out.println("Idade: " + idade1);
        System.out.println("A soma das idades é: " + soma);
        System.out.println("A diferença entre idades é: " + diferenca);

        /* ##Short.java */
        short numero1 = 15000;
        short numero2 = -20000;

        Short calcular = new Short();
        short resultado = calcular.somar(numero1, numero2);

        System.out.println("Resultado da soma " + resultado);// -5000

        /* ##Int.java */
        int num1 = 10;
        int num2 = 20;

        Int somarNum = new Int();
        int resultadoSoma = somarNum.somar(num1, num2);
        System.out.println("A soma de " + num1 + " e " + num2 + " é: " + resultadoSoma);

         /* ##Long.java */
         Long longExemplo = new Long(100000000000L);
         longExemplo.imprimirValorLongo();


        // **VAI DAR ERRO POIS A CLASSE É PRIVADA. ERROR: MinhaClassePrivada cannot be
        // resolved to a type*/
        // MinhaClassePrivada instancia = new MinhaClassePrivada();
        // instancia.metodoPrivado();

        // **gera um erro ao tentar extender a classe final animal*/
        // AnimalFinalClass animal = new AnimalFinalClass();
        // animal.fazerBarulho();

        // **INSTANCIA QUANTOS METODOS PRECISAR DENTRO DE MAIN */
        // Classe2 classe2 = new Classe2();
        // classe2.metodo2();
    }
}

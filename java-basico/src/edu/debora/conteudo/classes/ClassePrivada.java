package edu.debora.conteudo.classes;
//classes privadas só podem ser acessadas dentro do scopo da classe que a contém.É útil para encapsular partes de código que não desejamos que sejam acessados por outras classes.
public class ClassePrivada {

  private static class MinhaClassePrivada {
    public void metodoPrivado(){
      System.out.println("Método privado da classe privada");
    }
  }
}

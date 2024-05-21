package edu.debora.conteudo.classes;
// este tipo de classe pode conter métodos concretos e abstratos. O método abstrato não tem implementação e deve ser implementado pela subclasse que a extende
//Este tipo de classe é usada como classe base e não pode ser instânciada diretamente
abstract class AnimalAbstractClass {
    //método abstrato declarada sem implementação
    public abstract void fazerBarulho();

    //método concreto
    public void dormir(){
      System.out.println("dormindoooo");
    }
}


public class Cachorro extends AnimalAbstractClass{
  //implementação do metodo abstrato fazerBarulho()
  public void fazerBarulho(){
    System.out.println("Au au");
  }
}

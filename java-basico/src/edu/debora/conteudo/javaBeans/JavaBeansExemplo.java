package edu.debora.conteudo.javaBeans;

import java.io.Serializable;
/*JavaBeans é uma convenção usada em java para desenvolver componentes utilizáveis. Um JavaBeans é uma classe Java que segue certas convenções, como ter um construtor público sem argumentos, métodos de acesso (getters) e de modificadores (setters) para suas propriedades e ser reutilizável. O javaBeans é frequentemente utilizado em frameworks e tecnologias java, como Java EE, Spring e Hibernate, para representar dados de forma consistente e facilitar sua manipulação.*/

//*## Serializable:  pode ser implementado para que os objetos possam ser convertidos em bytes e transmitidos oeka rede ou salvos em arquivos.*/
public class JavaBeansExemplo implements Serializable {
  // *##propriedades*/
  private String nome;
  private int idade;
  private char genero;

  // *##construtor padrão*/
 public Pessoa(){
  //Construtor padrão sem argumentos.Não é obrigatório, mas é recomendado, pois prmite a criação de instâncias da classe sem a necessidade de fornecer argumentos, podendo ser util em situações como precisar criar um projeto temporário ou quando quando um framework exige um construtor padrão.
 }

  // *## Métodos getters e setters para acessar e modificar as propriedades*/
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public char getGenero() {
    return genero;
  }

  public void setGenero(char genero) {
    this.genero = genero;
  }

}

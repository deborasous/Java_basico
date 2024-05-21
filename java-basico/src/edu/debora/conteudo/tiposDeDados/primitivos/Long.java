package edu.debora.conteudo.tiposDeDados.primitivos;

/*long: é um inteiro longos com 64 bits com sinal. Pode armazenar valores entre -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807.
Ao usar  o long é necessário adicionar o L no final do valor para indicar que é um valor longo.
 */
public class Long {
  long valorLongo;

  public Long(long valorLongo){
    this.valorLongo=valorLongo;
  }

  public void imprimirValorLongo(){
    System.out.println("Valor longo: "+ valorLongo);
  }
}

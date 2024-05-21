package edu.debora.conteudo.tiposDeDados.primitivos;

/*Short: representa números inteiros curtos de 16 bits com sinal. Pode armazenar valores inteiros na faixa de -32.768 a 32.767. 
O Short é usado para econimiazar memoria, quando se sabe que os valores a serem armazenados estão dentro dessa faixa de valores.
*/
public class Short {
  public short somar(short num1, short num2) {
    return (short) (num1 + num2);
  }
}

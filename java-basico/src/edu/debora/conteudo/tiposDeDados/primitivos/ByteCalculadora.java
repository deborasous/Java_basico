package edu.debora.conteudo.tiposDeDados.primitivos;

/*Tipos primitivos: dados básicos e fundamentais da linguagem.
  1.Byte: repersenta 8 bits e armazena pequenos valores inteiros de -128 a 127
*/
public class ByteCalculadora {
  public static byte somarBytes(byte a, byte b) {
    return (byte) (a + b);
  }

  public static byte subtrairBytes(byte a, byte b) {
    return (byte) (a - b);
  }
}

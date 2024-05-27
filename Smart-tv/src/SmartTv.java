/**
 * <h1>SmartTv</h1>
 * A SmartTv realiza ações de ligar e desligar, aumenta e diminuir volume e mudar de canal
 */

public class SmartTv {
  boolean ligada = false;
  boolean primeiraVezLigada = true;
  int canal = 1;
  int volume = 10;

  public String ligarTv(boolean ligar) {
    if (ligar && !ligada) {
      ligada = true;
      if (primeiraVezLigada) {
        primeiraVezLigada = false;
        return "TV foi ligada";
      }
    } else {
      ligada = false;
      primeiraVezLigada = true;
      return "TV foi desligada";
    }
    return "";
  }

  public String mudarCanal(Integer novoCanal) {
    if (ligada) {
      if (novoCanal != null && novoCanal != canal) {
        canal = novoCanal;
        return "Mudou canal " + canal;
      }
      return "Canal " + canal;
    } else {
      return "";
    }
  }

  public String definirVolume(int novoVolume) {
    if (ligada && novoVolume >= 0 && novoVolume <= 100) {
      volume = novoVolume;
      return "Mudou Volume para " + volume;
    } else {
      return "Volume inválido ou TV desligada";
    }
  }

  public String aumentarVolume(int aumentaVolume) {
    if (ligada && volume <= 100) {
      while (volume < aumentaVolume) {
        volume++;
        System.out.println("Aumentar Volume " + volume);
      }
      return "";
    } else {
      return "Volume maximo atingido";
    }
  }

  public String diminuirVolume(int diminuirVolume) {
    if (ligada && volume >= 0 && volume > diminuirVolume) {
      while (volume > diminuirVolume) {
        volume--;
        System.out.println("Diminuir Volume " + volume);
      }
      return "";
    } else {
      return "Volume mínimo atingido";
    }
  }
}

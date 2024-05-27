public class Smart {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        String mensagemTv = smartTv.ligarTv(true);
        if (!mensagemTv.isEmpty()) {
            System.out.println(mensagemTv);
        }

        String mensagemDoCanal = smartTv.mudarCanal(null);
        if (!mensagemDoCanal.isEmpty()) {
            System.out.println(mensagemDoCanal);
        }

        String mensagemVolume = smartTv.definirVolume(15);
        System.out.println(mensagemVolume);

        String mensagemDiminuirVolume = smartTv.diminuirVolume(0);
        System.out.println(mensagemDiminuirVolume);

        String mensagemAumentarVolume = smartTv.aumentarVolume(20);
        System.out.println(mensagemAumentarVolume);
    }
}

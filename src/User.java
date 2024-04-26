public class User {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(17);

        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Canal mudado para: " + smartTv.canal);

        System.out.println("TV Ligada? " + smartTv.on);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status: TV Ligada? " + smartTv.on);

        smartTv.desligar();
        System.out.println("Novo status: TV Ligada? " + smartTv.on);

    }
}

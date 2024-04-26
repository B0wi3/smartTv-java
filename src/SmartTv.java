public class SmartTv {
    boolean on = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void ligar() {
        on = true;
    }

    public void desligar() {
        on = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }
}

public class MetodosEscopo {
    public static void main(String[] args) throws Exception {
        // Simulando TV
        SmartTV myTV = new SmartTV();
        System.out.println("TV Ligada? " + myTV.ligada);
        System.out.println("Canal: " + myTV.canal);
        System.out.println("Volume: " + myTV.volume);

        // Observar variável no Debug
        myTV.diminuirVolume();
        myTV.diminuirVolume();
        myTV.mudarCanal(50);
        myTV.aumentarVolume();
        myTV.diminuirVolume();
        myTV.mudarCanal(75);

        myTV.ligar();
        System.out.println("Está ligada? " + myTV.ligada);
    }
}

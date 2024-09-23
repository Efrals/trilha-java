package projetos.p1SmartTv;

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println("TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println();

        smartTv.ligar();
        System.out.println("Novo staus -> TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo staus -> TV está ligada? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Novo staus -> TV está ligada? " + smartTv.ligada);


        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Novo volume: " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Novo volume: " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Novo volume: " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Novo volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo volume: " + smartTv.volume);


        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.subirCanal();
        System.out.println("Novo canal: " + smartTv.canal);

        smartTv.subirCanal();
        System.out.println("Novo canal: " + smartTv.canal);

        smartTv.subirCanal();
        System.out.println("Novo canal: " + smartTv.canal);

        smartTv.descerCanal();
        System.out.println("Novo canal: " + smartTv.canal);
    }
}

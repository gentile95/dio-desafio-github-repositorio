public class Usuario{
  public static void main(String[] args) {
    
    SmartTv smartTv = new SmartTv();
  
    System.out.println("TV ligada? " + smartTv.ligada);
    System.out.println("Canal atual: " + smartTv.canal);
    System.out.println("Volume: " + smartTv.volume);

    smartTv.ligar();

    System.out.println(smartTv.ligada);

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();

    System.out.println(smartTv.volume);

    smartTv.mudarCanal(13);

    System.out.println(smartTv.canal);

    smartTv.aumentarVolume();
    smartTv.mudarCanal(24);

    System.out.println("Volume: " + smartTv.volume);
    System.out.println("Canal: " + smartTv.canal);

  }
}

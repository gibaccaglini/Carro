package carro;

public class Main {

    public static void main(String[] args) {

        Carro camaro = new Carro();
        Carro c3 = new Carro();

        camaro.setCor("amarelo");
        c3.setCor("vermelho");

        System.out.println(camaro.getCor());

        System.out.println(camaro.getVelocidade());

        camaro.acelerar(100);
        System.out.println(camaro.getVelocidade());
        camaro.ligar();
        camaro.acelerar(50);
        System.out.println(camaro.getVelocidade());

        camaro.acelerar(-20);
        System.out.println(camaro.getVelocidade());

    }

}

package edu.lucas.aprendendosintaxejava.metodos;

public class exercicioRepresentarUmaTv {
    public static void main(String[] args) {
        Tv smartTv = new Tv();
        smartTv.setStatus();
        smartTv.increaseVolume();
        smartTv.decreaseVolume();
        smartTv.decreaseChannel();
        smartTv.increaseChannel();
        smartTv.changeChannel(40);
    }
}



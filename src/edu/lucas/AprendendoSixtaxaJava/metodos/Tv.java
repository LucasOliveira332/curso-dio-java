package edu.lucas.AprendendoSixtaxaJava.metodos;

public class Tv {
    public boolean isOn = false;
    public int channel;
    public int volume;

    public void setStatus(){
        this.isOn = (this.isOn) ? false : true;
        System.out.println(this.isOn);
    }

    public void increaseVolume(){
        this.volume ++;
        System.out.println(this.volume);
    }

    public void decreaseVolume(){
        this.volume --;
        System.out.println(this.volume);
    }

    public void increaseChannel(){
        this.channel ++;
        System.out.println(this.channel);
    }

    public void decreaseChannel(){
        this.channel --;
        System.out.println(this.channel);
    }

    public void changeChannel(int channel){
        this.channel = channel;
        System.out.println(this.channel);
    }
        
}
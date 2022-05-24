package atividades.CofreDePorquinho;

import atividades.CofreDePorquinho.Coin;
import java.util.Locale;

public class Pig {
    private String itens = "";
    private double value = 0;
    private int volume = 0;
    private int volumeMax;
    private boolean broken = false;
    
    //inicializa o volumeMax
    public Pig(int volumeMax){
      this.volumeMax = volumeMax;
    }
    
    //se nao estiver quebrado e couber, adicione o value e o volume
    public boolean addCoin(Coin moeda){
      if(isBroken() == false && volume < volumeMax){
        this.value += moeda.getValue();
	    this.volume += moeda.getVolume();
	    return true;
      }else{
        System.out.println("fail: porco ja esta quebrado");
    	return false;
      }
    }
    
    //se não estiver quebrado e couber, adicione no volume e na descrição
    public boolean addItem(Item item) {
    	if(isBroken()) {
    		return false;
    	}
    	else if(this.volume + item.getVolume() > this.volumeMax) {
    		System.out.println("nao cabe no porco");
    		return false;
    	}
    	else {
    		if(itens.length() == 0) 
    			itens = item.getDescription(); 
    		else
    			this.itens += ", " + item.getDescription();
	    	this.volume += item.getVolume();
	    	return true;
	    }
    }
    
    //quebre o pig
    public boolean breakPig(){
      if(isBroken() == false){
        this.broken = true;
        return true;
      }else{
        System.out.println("fail: porco ja esta quebrado");
        return false;
      }
    }
    
    //se estiver quebrado, pegue e retorne o value

    public double getCoins(){
      if(isBroken() == true){
        return value;
      }else{
        System.out.println("Voce deve quebrar o cofre primeiro");
    	return 0;
      }
    }
    //se estiver quebrado, pegue e retorno os itens
    public String getItens(){
      if(isBroken() == true){
        return itens;
      }else{
        System.out.println("Voce deve quebrar o cofre primeiro");
    		return "";
      }
    }
    
    public int getVolume(){
      return volume;
    }
    
    public int getVolumeMax(){
      return volumeMax;
    }
    
    public boolean isBroken(){
      return broken;
    }
    
    public double getValue(){
      return value;
    }
    //mostre o conteúdo do pig
    public String toString(){
      Locale.setDefault(Locale.US);
      if(!isBroken()){
        return String.format("I:(%s) M:%.2f V:%d/%d EQ:%b", 
    				itens, value, volume, volumeMax, broken);
      }else{
        return  String.format("\"I:() M:0.00 V:0/%d EQ:%b", 
    				volumeMax, broken);
      }
}
}


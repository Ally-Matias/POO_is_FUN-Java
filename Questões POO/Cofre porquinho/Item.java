package atividades.CofreDePorquinho;

public class Item {
    private String description;
    private int volume;
    
    
    public Item(String description, int volume){
      this.description = description;
      this.volume = volume;
    }
    
    public String getDescription(){
      return "item: " + description;
    }
    
    public void setDescription(String description){
      this.description = description;
    }
    
    public void setVolume(int volume){
      this.volume = volume;
    }
    public int getVolume(){
      return this.volume;
    }
    public String toString(){
      return "item: " + description + " Volume: " + volume;
    }
}

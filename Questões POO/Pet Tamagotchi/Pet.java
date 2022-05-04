package atividades.Tamagotchi;

// clean = limpar
// shower = banho / limpeza
// hungry = com fome / saciedade
// eat = comer 

class Pet{
    private int energyMax, hungryMax, cleanMax;
    private int energy, hungry, shower;
    private int diamonds;
    private int age;
    private boolean alive;
    
    // Atribui o valor de energia
    // Se o valor ficar abaixo de 0, o pet morre de fraqueza
    // Garanta que os valores ficarão no interalo 0 - max
    // Use esse modelo para fazer os outros métodos set

    public void setEnergy(int value){
        if(value <= 0){
           this.energy = 0;
           System.out.println("fail: pet morreu de fraqueza");
           this.alive = false;
        }else if(value > this.energyMax){
          this.energy = this.energyMax;
        }else{
           this.energy = value;
        }
            
    }
    
    public void setHungry(int value){
        if(value <= 0){
            this.hungry = 0;
            System.out.println("fail: pet morreu de fome");
            this.alive = false;
        }else if(value > this.hungryMax){
          this.hungry = this.hungryMax;
        }else{
           this.hungry = value;
        }
    }
    
    public void setClean(int value){
        if(value <= 0){
            this.shower = 0;
            System.out.println("fail: pet morreu de sujeira");
            this.alive = false;
        }else if(value > this.cleanMax){
          this.shower = this.cleanMax;
        }else{
           this.shower = value;
        }
    }
    
    public Pet(int energy, int hungry, int shower){
      this.energy = energy;
      this.hungry = hungry;
      this.shower = shower;
      this.energyMax = energy;
      this.hungryMax = hungry;
      this.cleanMax = shower;
      this.alive = true;
    }
    
    public String toString(){
      return String.format("E:%d/%d, S:%d/%d, L:%d/%d, D:%d, I:%d",
    		  this.energy, this.energyMax, this.hungry, this.hungryMax, this.shower, this.cleanMax, this.diamonds, this.age);
    }
    
    public boolean testAlive(){
      if(this.energy > 0 && this.hungry > 0 && this.shower > 0 && this.alive == true){
        return true;
      }else{
        return false;
      }
    }
    // Invoca o método testAlive para verificar se o pet esta vivo
    // Se estiver vivo, altere os atributos utilizando os métodos set e get
    
    public void play(){
       if(testAlive() == true){
         setEnergy(getEnergy() - 2);
         setHungry(getHungry() - 1);
         setClean(getClean() - 3);
         this.diamonds += 1;
         this.age += 1;
       }else{
        System.out.println("fail: pet esta morto");  
       }   
           
    }
    
    public void shower(){
      if(testAlive() == true){
        setEnergy(getEnergy() - 3);
        setHungry(getHungry() - 1);
        setClean(getCleanMax());
        this.age += 2;
      }else{
        System.out.println("fail: pet esta morto");
      }
      
    }
    
    public void eat(){
      if(testAlive() == true){
        setEnergy(getEnergy() - 1);
        setHungry(getHungry() + 4);
        setClean(getClean() - 2);
        this.age += 1;
      }else{
        System.out.println("fail: pet esta morto");
      }
    }
    
    public void sleep(){
      if(testAlive() == true){
        int turno = getEnergyMax() - getEnergy();
        if(turno >= 5){
          setEnergy(getEnergyMax());
          setHungry(getHungry() - 1);
          setClean(getClean() - 2);
          this.age += turno;
        }else{
          System.out.println("fail: nao esta com sono");
        }
      }else{
        System.out.println("fail: pet esta morto");
      }
    }
    
    //Métodos GET
    public int getClean(){
      return shower;
    }
    
    public int getHungry(){
      return hungry;
    }
    
    public int getEnergy(){
      return energy;
    }
    
    public int getEnergyMax(){
      return energyMax;
    }
    
    public int getCleanMax(){
      return cleanMax;
    }
    
    public int getHungryMax(){
      return hungryMax;
    }
}

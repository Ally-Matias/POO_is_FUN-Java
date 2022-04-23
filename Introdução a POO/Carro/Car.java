package atividades.carro;

//inicializador 

public class  Car {
    private int pass; // Passageiros 
    private int passMax; // limite 
    private int gas; // tanque 
    private int gasMax ; // limite 
    private int km ; // quilometragem


//getter

    public int getPass() { 
      return pass;
    }
 
    public int getPassMax(){
      return passMax;
    }
 
    public int getGas(){
      return gas;
    }

    public int getGasMax(){
      return gasMax;
    }

    public int getKm(){
      return km;
    }

//setter

    public void setPass(int p){
      this.pass = p;
    }

    public void setPassMax(int pm){
      this.passMax = pm; 
    }

    public void setGas(int g){
      this.gas = g;
    }

    public void setGasMax(int gm){
      this.gasMax = gm;
    }

    public void setKm(int km){
      this.km = km;
    }
 


    public Car (){
       this.setPassMax(2);
       this.setGasMax(100);
    }
  
    
    public String toString() {
        return String.format("pass: %d, gas: %d, km: %d", this.getPass(), this.getGas(), this.getKm());
    }
    
   
    public void enter(){
      if (this.getPass() < this.getPassMax()){
          this.setPass(this.getPass() + 1);
      }else{
        System.out.println("fail: limite de pessoas atingido");
      }
    }
    
  
    public void leave(){
      if(this.getPass() != 0){
        this.setPass(this.getPass() - 1);
      }else{
        System.out.println("fail: nao ha ninguem no carro");
      }
    } 
        
    void fuel(int gas){
      if(gas > this.getGasMax()){
        this.setGas(this.getGasMax());
      }else{
        this.setGas(this.getGas() + gas);
      }
    }
     
     // se o carro tiver com pessoas e com gás, roda as condições perguntando se o km que ele quer rodar se é maior q a quantidade de gas no carro ou se não é. após isso roda mais duas condições caso n tenha pessoas no carro ou gás.
     
      
    void drive (int km){
      if(this.getPass() > 0 && this.getGas() > 0){
         if(km > this.getGas()){
          System.out.println("fail: tanque vazio apos andar " + this.getGas() +" km");
        this.setKm(this.getKm() + this.getGas());
        this.setGas(0);
         }else{
          this.setGas(this.getGas() - km);
          this.setKm(this.getKm() + km);
         }   
      }else if(this.getGas() == 0){
        System.out.println("fail: tanque vazio");
      }else if(this.getPass() == 0){
        System.out.println("fail: nao ha ninguem no carro");
      }
        
    }

}



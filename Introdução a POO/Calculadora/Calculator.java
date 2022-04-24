package atividades.Calculadora;

class Calculator {
    private int batteryMax;
    private int battery;
    private float display;
    
    //getter

    public int getBatMax() { 
      return batteryMax;
    }
    
    public int getBat() { 
      return battery;
    }
    
    public float getDisplay() { 
      return display;
    }
    
    //setter

    public void setBatMax(int bm){
      this.batteryMax = bm;
    }

    public void setBat(int b){
      this.battery = b;
    }

    public void setDisplay(float d){
      this.display = d;
    }

    //Inicia os atributos, battery e display começam com o zero.
    public Calculator(int batteryMax){
      this.setBat(0);
      this.setDisplay(0);
      this.setBatMax(batteryMax);
    }
    
    
    //Aumenta a bateria, porém não além do máximo. 
    public void chargeBattery(int value){
      if(value < this.getBatMax()){
        this.setBat(this.getBat() + value);
      }else{
        this.setBat(this.getBatMax());
      }
    }
     
    //Tenta gastar uma unidade da bateria e emite um erro se não conseguir.
    public boolean useBattery(){
      if(this.getBat() > 0){
        this.setBat(this.getBat() - 1);
        return true;
      }else{
        System.out.println("fail: bateria insuficiente");
        return false;
      }
    }
    //Se conseguir gastar bateria, armazene a soma no atributo display.
    public void sum(int a, int b){
      if(useBattery() == true){
        this.setDisplay(a + b);
      }
    }
       
    
    //Se conseguir gastar bateria e não for divisão por 0.
    public void division(int num, int den){
      if(useBattery() == true){
        if(num != 0 && den != 0){
          this.setDisplay(num / den);
        }else{
          System.out.println("fail: divisao por zero");
        }
      }
    }
    
    
    //Retorna o conteúdo do display com duas casas decimais.
    public String toString(){
      return String.format("display = %.2f, battery = %d", this.getDisplay(), this.getBat());
    }
}









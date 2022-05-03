package atividades.tempo;

public class Time {
    private int hour;
    private int minute;
    private int second;

    //utilize os métodos set para atribuir valores aos atributos
    //para garantir que o valor dos atributos sejam válidos

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute= minute;
        this.second = second;

    }
    
    //se for um valor válido, ou seja, de 0 até 23,
    //atribui o valor ao atributo hour, se não, atribua 0
    public void setHour(int hour){
        if(hour >= 0 && hour <= 23){
          this.hour = hour;
        }else{
            this.hour = 0;
        }
    }   
    
    //se for um valor válido, ou seja, de 0 até 59,
    //atribui o valor ao atributo minute, se não, atribua 0 
    public void setMinute(int minute){
        if(minute >= 0 && minute <= 59){
            this.minute = minute;
        }else{
            this.minute = 0;
        }
    }
    //se for um valor válido, ou seja, de 0 até 59,
    //atribui o valor ao atributo second, se não, atribua 0
    public void setSecond(int second){
        if(second >= 0 && second <= 59){
            this.second = second;
        }else{
            this.second = 0;
        }
    }


//possivel erro, passar funil aqui
    public int getHour(){
       if(hour >= 0 && hour <= 23){
            return hour;
        }else{
            this.hour = 0;
            return hour;
        }
    }
    public int getMinute(){
        if(minute >= 0 && minute <= 59){
            return minute;
        }else{
            this.minute = 0;
            return minute;
        }
    }
    public int getSecond(){
        if(second >= 0 && second <= 59){
            return second;
        }else{
            this.second = 0;
            return second;
        }
    }


    //avança o tempo em um segundo
    public void nextSecond(){
        if(this.getSecond() < 59){
            this.setSecond(this.getSecond() + 1);
        }else if(getMinute() < 59){
          setMinute(getMinute() + 1);
          setSecond(0);
        }else if(getHour() < 23){
          setHour(getHour() +1);
          setMinute(0);
          setSecond(0);
        }else{
          setSecond(0);
          setMinute(0);
          setHour(0);
        }

    }
    //você pode imprimir um inteiro forçando zeros a esquerda com o seguinte
    //comando em java String.format("%02d", valor)
    public String toString(){
        return String.format("%02d:%02d:%02d", this.getHour(), this.getMinute(), this.getSecond());
    }
}

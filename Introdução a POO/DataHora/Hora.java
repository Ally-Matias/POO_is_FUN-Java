package atividades.java;

public class Hora {

// Primeiro eu criei a classe Hora e criei um metodo para inicializar recebendo os valores (hora, minutos, segundos).

    public int hora, min, seg;
    
    void inicializaHora(int h, int m, int s) {
        this.hora = h;
        this.min = m;
        this.seg = s;
    }

// Após isso criei os métodos "mostrarHora" e "horaEhValida", um para mostrar a hora caso seja uma data correta e outro para saber se a hora é valida, como? as horas vão de 00(meia noite, meio dia) até 23, os minutos e segundos vão de 00 até 59.

    void mostrarHora(){
      if(horaEhValida() == true){
        System.out.printf("%02d:%02d:%02d\n",hora, min, seg);
      }else{
        System.out.println("Hora inválida");
      }
      
    }

   
    public boolean horaEhValida(){
      if(hora >= 0 && hora <= 23 && min >= 0 && min <= 59 && seg >= 0 && seg <= 59){
        return true;
      }else{
        return false;
      }
    }
}

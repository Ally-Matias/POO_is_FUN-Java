package atividades.java;

public class Data {

// Primeiro eu criei a classe Data e criei um metodo para inicializar recebendo os valores (dia, mes, ano).
    
    public int dia, mes, ano;
    
    void inicializaData(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

// Aqui eu criei o método "mostrarData" já passando pelo método "dataEhValida", para que caso a data seja valida eu já posso mostrar os valores, caso não, printo "data inválida"

    void mostrarData(){
        if(dataEhValida(dia, mes, ano) == true){
          System.out.printf("%02d/%02d/%d\n",dia, mes, ano);
        }else{
           System.out.println("Data inválida");
        }
    }  
    
 
// E por último na classe Data, o metodo "dataEhvalida", que aqui eu consigo saber se a data que o usuário colocou se está correta. Como posso saber se está correta? peguei os meses de 31 dias e os meses de 30 dias e o mes de fevereiro (passando nele uma condição para saber se o ano é bissexto ou não) e coloquei um if em cada uma dessas condições e retornei um resultado true ou false.
      
public boolean dataEhValida(int d, int m, int a){
    if(dia > 0 && dia <= 31 && mes > 0 &&  mes <= 12 && ano > 0){
      if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && dia <= 31){
        return true;
      }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia <= 30){
        return true;
    }else if(mes == 2){
      if(ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0){
        if(dia <= 29){
          return true;
        }else{
          return false;
        }
      }else if(dia <= 28){
        return true;
      }else{
        return false;
      }
    }else{
      return false;
    } 
  }
  return false;
  }
}


package atividades.java;

// Nessa classe DataHora eu apenas instanciei a classe Data e classe Hora e depois chamei os métodos mostrarData e mostrarHora.

public class DataHora {
    
    Data d = new Data();
    Hora h = new Hora();
    
    
    void mostrarDataHora(){
      d.mostrarData();
      h.mostrarHora();     
    }

}

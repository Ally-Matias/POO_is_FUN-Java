package atividades.java;

import java.util.Locale;
import java.util.Scanner;

// Aqui é meu código principal onde primeiro chamei o scanner para receber todos os inputs.
// após isso (linha 24) eu chamei a classe DataHora que está instanciada com a minha classe data e hora e após isso eu incializei ambas. por último na linha 30 eu chamei a funcao mostrarDataHora e que nessa função chama o meu "mostrarData" e "mostrarHora".

public class App{
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        System.out.println("Digite a data: ");
        Scanner teclado = new Scanner(System.in);
        
        int dia = teclado.nextInt();
        int mes = teclado.nextInt();
        int ano = teclado.nextInt();
        
        System.out.println("Digite a hora: ");

        int hora = teclado.nextInt();
        int min = teclado.nextInt();
        int seg = teclado.nextInt();
        
        DataHora x = new DataHora();
        x.d.inicializaData(dia, mes, ano);
        x.h.inicializaHora(hora, min, seg);

        System.out.println("Sua data e hora: ");
        x.mostrarDataHora();   
        
   
    }
}

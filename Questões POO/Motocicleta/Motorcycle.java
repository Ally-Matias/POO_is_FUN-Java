package atividades.Motocicleta;

public class Motorcycle {
    private Person person; //agregacao
    private int power;
    private int time;
    //Inicia o atributo power, time com zero e person com null
    public Motorcycle(int power) {
        this.power = power;
        time = 0;
        person = null;
    }
    //Comprar mais tempo
    public void buy(int time) {
        this.time += time;
    }
    //Se estiver vazio, coloca a pessoa na moto e retorna true
    public boolean enter(Person person) {
        if(this.person == null) {
            this.person = person;
            return true;
        }
        System.out.println("fail: moto ocupada");
        return false;
    }
    //Se houver uma person, retira e retorna
    //Se nao, retorna null
    public Person leave() {
        if(person != null) {
            Person aux = person;
            person = null;
            return aux;
        }
        System.out.println("fail: moto vazia");
        return null;
    }

    public void drive(int time) {
        if(this.time > 0 && person != null) {
            if(person.getAge() > 12) {
                System.out.println("fail: muito grande para andar de moto");
            } else if((this.time - time) < 0) {
                int aux = this.time;
                this.time = 0;
                System.out.println("fail: andou " + aux + " min e acabou o tempo");
            } else {
                this.time -= time;
            }
        } else {
            if(this.time == 0) {
                System.out.println("fail: tempo zerado");
            }
            if(person == null) {
                System.out.println("fail: moto vazia");
            }
        }
    }
    //buzinar
    public void honk() {
        if(person != null) {
            String buzina = "P";
            for(int i = 0; i < power; i++) {
                buzina += "e";
            }
            buzina += "m";
            System.out.println(buzina);
        } else {
            System.out.println("fail: moto vazia");
        }
    }

    public String toString() {
        if(person == null) {
            return "potencia: " + power + ", minutos: " + time + ", pessoa: null";   
        }
        return "potencia: " + power + ", minutos: " + time + ", pessoa: [" + person.toString() + "]";
    }
}

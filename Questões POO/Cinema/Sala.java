import java.util.ArrayList;
import java.util.List;

class Sala{
    private List<Client> cadeiras;

    public Sala(int capacidade) {
        cadeiras = new ArrayList<Client>(capacidade);
        for(int i = 0; i < capacidade; i++)
            cadeiras.add(null);
    }

    public List<Client> getCadeiras() {
        return cadeiras;
    }

    public boolean reservar(String id, String fone, int ind) {
        if(ind < 0 || ind >= cadeiras.size()) {
            System.out.println("fail: indice invalido");
            return false;
        }
        if(cadeiras.get(ind) != null) {
            System.out.println("fail: cadeira ja esta ocupada");
            return false;
        }
        for(int i = 0; i < cadeiras.size(); i++) {
            if(cadeiras.get(i) != null && cadeiras.get(i).getId().equals(id)) {
                System.out.println("fail: cliente ja esta no cinema");
                return false;
            }
        }
        Client novo = new Client(id, fone);
        cadeiras.set(ind, novo);
        return true;
    }

    public void cancelar(String id) {
        for(int i = 0; i < cadeiras.size(); i++) {
            Client p = cadeiras.get(i);
            if(p != null && p.getId().equals(id)) {
                cadeiras.set(i, null);
                return;
            }
        }
        System.out.println("fail: cliente nao esta no cinema");
    }

    public String toString() {
        String str = "[ ";

        for(Client e : cadeiras) 
            str = str + ( (e == null) ? "- " : e + " " );

        str += "]";
        return str;
    }
}

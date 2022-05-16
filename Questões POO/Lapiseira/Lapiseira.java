package lapiseira;

public class Pencil{

    private float calibre;
    private Lead grafite;

    public Pencil(float calibre) {
        this.calibre = calibre;
        this.grafite = null;
    }


    public String toString() {
        return "calibre: " + getCalibre() + " grafite: " + getGrafite();
    }

    public boolean insert(Lead grafite) {
        if (getGrafite() == null) {
            setGrafite(grafite);
            if (!getGrafite().getDureza().equals("HB") && !getGrafite().getDureza().equals("2B") && !getGrafite().getDureza().equals("4B") && !getGrafite().getDureza().equals("6B")) {
                System.out.println("Erro! DUREZA deve ser: \r\n\"HB\"\r\n\"2B\"\r\n\"4B\"\r\n\"6B\"");
                setGrafite(null);
                return false;
            } else if (getGrafite().getTamanho() < 10) {
                System.out.println("Erro! TAMANHO deve ser maior que 10");
            }
            if (getGrafite().getCalibre() == getCalibre()) {
                return true;
            } else {
                System.out.println("fail: calibre incompatível");
                setGrafite(null);
                return false;
            }
        } else {
            System.out.println("fail: ja existe grafite");
            return false;
        }
    }

    public Lead remove() {
        if (getGrafite() != null) {
            setGrafite(null);            
        } else {
            System.out.println("Nao tem grafite");
        }
        return null;
    }

    public void writePage() {
        if (getGrafite() != null) {
            if (getGrafite().getTamanho() > 10) {
                getGrafite().desgastePorFolha();
            } else if ((getGrafite().getTamanho() == 10)) {
                System.out.println("warning: grafite com tamanho insuficiente para escrever");
            } else {
                System.out.println("Remova grafite, tamanho menor que 10");
            }
        } else {
            System.out.println("Sem grafite");
        }
    }

    public float getCalibre() {
        return calibre;
    }

    public void setCalibre(float calibre) {
        this.calibre = calibre;
    }

    public Lead getGrafite() {
        return grafite;
    }

    public void setGrafite(Lead grafite) {
        this.grafite = grafite;
    }
}

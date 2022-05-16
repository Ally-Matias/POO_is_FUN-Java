package lapiseira;

public class Lead {

    private float calibre;
    private String dureza;
    private int tamanho;

    public Lead(float calibre, String dureza, int tamanho) {
        this.calibre = calibre;
        this.dureza = dureza;
        this.tamanho = tamanho;
    }

    public String toString() {
        return "[" + getCalibre() + ":" + getDureza() + ":" + getTamanho() + "]";
    }

    public int desgastePorFolha() {
        switch (getDureza()) {
            case "HB":
                if (getTamanho() > 10) {
                    if (getTamanho() - 1 >= 10) {
                        setTamanho(-1);
                        System.out.println("grafite hb");
                        return getTamanho();
                    } else {
                        while (getTamanho() > 10) {
                            setTamanho(-1);
                        }
                        System.out.println("fail: folha incompleta");
                        return getTamanho();
                    }
                } else {
                    System.out.println("Grafite acabou");
                    return getTamanho();
                }
            case "2B":
                if (getTamanho() > 10) {
                    if (getTamanho() - 2 >= 10) {
                        setTamanho(-2);
                        System.out.println("grafite 2b");
                        return getTamanho();
                    } else {
                        while (getTamanho() > 10) {
                            setTamanho(-1);
                        }
                        System.out.println("fail: folha incompleta");
                        return getTamanho();
                    }
                } else {
                    System.out.println("Grafite acabou");
                    return getTamanho();
                }
            case "4B":
                if (getTamanho() > 10) {
                    if (getTamanho() - 4 >= 10) {
                        setTamanho(-4);
                        System.out.println("grafite 4b");
                        return getTamanho();
                    } else {
                        while (getTamanho() > 10) {
                            setTamanho(-1);
                        }
                        System.out.println("fail: folha incompleta");
                        return getTamanho();
                    }
                } else {
                    System.out.println("Grafite acabou");
                    return getTamanho();
                }
            case "6B":
                if (getTamanho() > 10) {
                    if (getTamanho() - 6 >= 10) {
                        setTamanho(-6);
                        System.out.println("grafite 6b");
                        return getTamanho();
                    } else {
                        while (getTamanho() > 10) {
                            setTamanho(-1);
                        }
                        System.out.println("fail: folha incompleta");
                        return getTamanho();
                    }
                } else {
                    System.out.println("Grafite acabou");
                    return getTamanho();
                }
            default:
                System.out.println("erro: /grafite.java:107");
                return getTamanho();
        }
    }

    public float getCalibre() {
        return calibre;
    }

   
    public void setCalibre(float calibre) {
        this.calibre = calibre;
    }

    
    public String getDureza() {
        return dureza;
    }

    
    public void setDureza(String dureza) {
        this.dureza = dureza.toUpperCase();
    }

    
    public int getTamanho() {
        return tamanho;
    }


    public void setTamanho(int tamanho) {
        this.tamanho = this.tamanho + tamanho;
    }
}

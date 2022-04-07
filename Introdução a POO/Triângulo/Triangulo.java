package atividades;

public class Triangulo {
    public class Triangulo {
    
    private float a, b, c;
    
    void inicializaTriangulo(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void mostrarTriangulo(){
        System.out.println(" a: "+ a+" b: "+ b+" c: "+ c);
    }
    
    public float perimetroTriangulo() {
        float perimetro = a+b+c;
        return perimetro;
    }

    public float areaTriangulo(){
        float p = (a+b+c)/2; 
        float area = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }

    public boolean ehEquilatero(){
        if (a==b&&a==c){ return true;
        }else {
            return false;
        }
    }

}
}

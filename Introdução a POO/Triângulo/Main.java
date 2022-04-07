import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        System.out.println("Enter the measures o triangle X:");
        Scanner teclado = new Scanner(System.in);
        float lado1x = teclado.nextFloat();
        float lado2x = teclado.nextFloat();
        float lado3x = teclado.nextFloat();
        Triangulo x = new Triangulo();
        x.inicializaTriangulo(lado1x, lado2x, lado3x);

        System.out.println("Enter the measures o triangle Y:");
        float lado1y = teclado.nextFloat();
        float lado2y = teclado.nextFloat();
        float lado3y = teclado.nextFloat();
        Triangulo y = new Triangulo();
        y.inicializaTriangulo(lado1y, lado2y, lado3y);

        System.out.println("Triangulo X");
        x.mostrarTriangulo();
        System.out.println("Triangulo Y");
        y.mostrarTriangulo();

        float areax = x.areaTriangulo();
        float areay = y.areaTriangulo();

        System.out.println("Triangle X perimeter:" + x.perimetroTriangulo());
        System.out.println("Triangle Y perimeter:" + y.perimetroTriangulo());

        System.out.println("Triangle X area:" + areax);
        System.out.println("Triangle Y area:" + areay);

        boolean equi = x.ehEquilatero();
        if (equi==true) {
            System.out.println("X É equilatero");
        }else {
            System.out.println("X Não é equilatero");
        }

        equi = y.ehEquilatero();
        if (equi==true) {
            System.out.println("Y É equilatero");
        }else {
            System.out.println("Y Não é equilatero");
        }

        if (areax>areay) {
            System.out.println("Area do X é maior");
        }else if (areay>areax) {
            System.out.println("Area do Y é maior");
        }else {
            System.out.println("Area dos triangulos X e Y são iguais");
        }
    }
}

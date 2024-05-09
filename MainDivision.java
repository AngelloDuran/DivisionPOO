
// se importa la libreria Scanner
import java.util.Scanner;

// se declara la clase
public class MainDivision {
    // se agrega el metodo main
    public static void main(String[] args) {
        // se llama al metodo Scanner
        Scanner n1 = new Scanner(System.in);
        // se ingresa el mensaje que se le dara al usuario
        System.out.println("Ingresa un numero");
        // se almacena el valor del usuario
        int a = n1.nextInt();
        // se almacena el valor del usuario
        System.out.println("Ingrese el segundo numero");
        // se almacena el valor del usuario
        int b = n1.nextInt();
        // se imprime el resultado de la operacion y se muestra en pantalla
        Division d1 = new Division();
        d1.setA(a);
        ;
        d1.setB(b);
        ;
        d1.dividir(a, b);
        d1.getA();
        d1.getB();
        d1.getR();
        System.out.println("el resultado es :" + d1.dividir(a, b));
        System.out.println(d1.toString());
        System.out.println(n1.toString());
        // se cierra el metodo mian
    }
    // se cierra clase
}
// se importa la libreria Scanner
import java.util.Scanner;

// se declara la clase
public class MainDivision {
    // se agrega el metodo main
    public static void main(String[] args) {
        // se llama al metodo Scanner
        Scanner n1 = new Scanner(System.in);
        // se ingresa el mensaje que se le dara al usuario
        Division d1 = new Division();
        System.out.println("Ingresa un numero");
        // se almacena el valor del usuario
        int a = n1.nextInt();
        // se almacena el valor del usuario
        System.out.println("Ingrese el segundo numero");
        // se almacena el valor del usuario
        int b = n1.nextInt();
        // se hace la operacion con los datos ingresados por el usuario
        int r = a / b;
        // se imprime el resultado de la operacion y se muestra en pantalla
        d1.a=a;
        d1.b=b;
        d1.dividir(a, b);
        System.out.println("el resultado es :"+ d1.dividir(a, b));

        // se cierra el metodo mian
    }
    // se cierra clase
}
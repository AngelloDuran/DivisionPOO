// se declara la clase
public class Division {
    // se declaran las variables
    int a, b, r;

    // se declara el metodo
    public int dividir(int a, int b) {
        // se llama al objeto
        r = this.a / this.b;

        return r;
        // se cierra el metodo dividir
    }
    // se cierra la clase

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Division [a=" + a + ", b=" + b + ", r=" + r + "]";
    }

}
package paquete;

public class Operaciones {
    //atributos
    double suma;
    double resta;
    double multiplicacion;
    double division;


    public void sumar(double num1, double num2) {
        suma = num1 + num2;
    }

    public void restar(double num1, double num2) {
        resta = num1 - num2;
    }

    public void multiplicar(double num1, double num2) {
        multiplicacion = num1 * num2;
    }

    public void dividir(double num1, double num2) {
        division = num1 / num2;
    }

    public void resultados() {
        System.out.println("la suma es : \n" + suma);
        System.out.println("la resta es : \n" + resta);
        System.out.println("la multiplicacion es : \n" + multiplicacion);
        System.out.println("la division es : \n" + division);
    }
}
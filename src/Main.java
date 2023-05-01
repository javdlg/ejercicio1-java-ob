public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int num3 = 15;

        int resultado = suma(num1, num2, num3);

        System.out.println("La suma de los tres números es: " + resultado);
    }

    public static int suma(int a, int b, int c) {
        int resultado = a + b + c;
        return resultado;
    }
}


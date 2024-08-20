import java.util.ArrayList;

public class MultiplosDeTres {
    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println("Debe ingresar al menos un dato");
            return;
        }

        ArrayList <Integer> numeros = new ArrayList<>();
        for(int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            numeros.add(num);
        }

        System.out.println("La suma de los múltiplos de tres del arreglo son: " + suma(numeros));
        System.out.println("El promedio de la suma de los múltiplos de tres del arreglo es de : " + promedio(numeros));
    }

    public static int suma(ArrayList <Integer> numeros) {
        int suma = 0;
        for(int i = 0; i < numeros.size(); i++) {
            int num = numeros.get(i);

            if(num % 3 == 0) {
                suma += num;
            }
        }
        return suma;
    }

    public static double promedio(ArrayList <Integer> numeros) {
        int numMultiplos = 0;
        int sumaMultiplos = 0;

        for(int num : numeros) {
            if(num % 3 == 0) {
                numMultiplos++;
                sumaMultiplos += num;
            }
        }
        if(numMultiplos == 0) {
            return 0;
        }

        return (double) sumaMultiplos / numMultiplos;
    }
}

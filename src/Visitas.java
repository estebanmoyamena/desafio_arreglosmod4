import java.text.DecimalFormat;
import java.util.ArrayList;

public class Visitas {
    public static void main(String[] args) {

        if(args.length < 0) {
            System.out.println("Debe ingresar algún dato");
            return;
        }

        ArrayList<Integer> visitas = new ArrayList<>();
        for(int i = 0; i < args.length; i++) {
            int valor = Integer.parseInt(args[i]);
            visitas.add(valor);
//            System.out.println(visitas);
        }

        promedio(visitas);
    }

    public static void promedio(ArrayList<Integer> visitas) {
        int suma = 0;
        for(int i = 0; i < visitas.size(); i++) {
            suma += visitas.get(i);
        }

        double promedio = (double) suma  / visitas.size();
        DecimalFormat df = new DecimalFormat("#.##");


        System.out.println("El promedio de visitas es: " + df.format(promedio));
    }
}



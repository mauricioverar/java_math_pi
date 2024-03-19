import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double decimal = 1.56789;

        System.out.println(Math.round(decimal)); // redondea 2
        System.out.println(Math.floor(decimal)); // redondea abajo 1.0
        System.out.println(Math.ceil(decimal)); // 2.0

        System.out.println("Ingrese longitud de radio de la esfera");
        double radio = leer.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);//pow Devuelve el valor del primer argumento elevado a la potencia del segundo argumento.
        double volumen = (4/3)*Math.PI*Math.pow(radio, 3); // Math.pow(base, exponente); //Math.pow(radio, 3);

        System.out.println("el area es "+area);
        System.out.println("el volumen es "+volumen);

    }
}
import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        int[] a = new int[7];
        int count = a.length;
        Scanner s = new Scanner(System.in);
        int mayor = 0;
        int posicion = 0;

        vuelta:
        for (int i = 0; i < count; i++) {
            System.out.print("Ingrese un número entero (entre 11 y 99): ");
            a[i] = s.nextInt();
            if (a[i] < 11 || a[i] > 99){
                System.out.println("Por favor ingrese un numero entre 11 y 99");
                i--;
                continue vuelta;
            }
        }

        System.out.println("\nLos números ingresados son los siguientes:" );
        for (int i = 0; i < count; i++) {
            System.out.print("[" + a[i] + "];");
        }

        for (int i = 0; i < count; i++) {
            if (mayor <= a[i]) {
                mayor = a[i];
                posicion = i;
            }
        }
        System.out.println("\n\nEl número más alto ingresado es " + mayor + " y lo ingreso en el " + (posicion+1) + "º lugar");

    }
}

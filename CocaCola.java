import java.util.Scanner;

public class CocaCola {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema vacacional de Coca Cola Company");

        Scanner nomEmpleado = new Scanner(System.in);
            String nombre;
                System.out.println("Cual es su nombre? ");
                    nombre = nomEmpleado.nextLine();

        Scanner claveDep = new Scanner(System.in);
            int clave;
                System.out.println("Cual es su clave de departamento? ");
                    clave = claveDep.nextInt();

        Scanner añosServicio = new Scanner(System.in);
            int antiguedad;
                System.out.println("Cuantos años lleva en la empresa? ");
                    antiguedad = añosServicio.nextInt();
        

        if (clave == 1 && antiguedad >= 1 && antiguedad < 2) {
            System.out.println("Al empleado " + nombre + " le pertenecen 6 días");

        }  else if (clave == 1 && antiguedad >= 2 && antiguedad <= 6) {
            System.out.println("Al empleado " + nombre + " le pertenecen 14 días");

        }  else if (clave == 1 && antiguedad >= 7) {
            System.out.println("Al empleado  " + nombre + " le pertenecen 20 días");

        }  else if (clave == 2 && antiguedad >= 1 && antiguedad < 2) {
            System.out.println("Al empleado " + nombre + " le pertenecen 7 días");

        }  else if (clave == 2 && antiguedad >= 2 && antiguedad <= 6) {
            System.out.println("Al empleado " + nombre + " le pertenecen 15 días");

        }  else if (clave == 2 && antiguedad >= 7) {
            System.out.println("Al empleado  " + nombre + " le pertenecen 22 días");

        }  else if (clave == 3 && antiguedad >= 1 && antiguedad < 2) {
            System.out.println("Al empleado " + nombre + " le pertenecen 10 días");

        }  else if (clave == 3 && antiguedad >= 2 && antiguedad <= 6) {
            System.out.println("Al empleado " + nombre + " le pertenecen 20 días");

        }  else if (clave == 3 && antiguedad >= 7) {
            System.out.println("Al empleado  " + nombre + " le pertenecen 30 días");

        }  else {
            System.out.println("Aun no tiene derecho a vacaciones");
        }

    }
}

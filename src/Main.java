import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int figuEleg, operation;
        double resul, rad, diame, lad, alt, base, lad1, lad2, lad3, semiPeri, longi, anch;

        System.out.println("\n\n\t\tCalculadora Geométrica");
        System.out.println("\n\t\tPor favor, elige una figura:");
        System.out.println("\t1. Círculo");
        System.out.println("\t2. Cuadrado");
        System.out.println("\t3. Triángulo");
        System.out.println("\t4. Rectángulo");
        System.out.println("\t5. Pentágono");
        System.out.print("\n\tIngresa el número de tu elección: ");
        figuEleg = scanner.nextInt();

        System.out.println("\n\tElige una operación: ");
        System.out.println("\t1. Área");
        System.out.println("\t2. Perímetro");
        System.out.print("\n\tIngresa el número de tu elección: ");
        operation = scanner.nextInt();

        switch (figuEleg) {
            case 1:
                if (operation == 1) {

                    System.out.print("\n\t\ttIngresa el radio del círculo: ");
                    rad = scanner.nextDouble();
                    resul = 3.1416 * rad * rad;

                    System.out.println("\n\tEl área del círculo es: " + resul);
                } else {
                    System.out.print("\tIngresa el diámetro del círculo: ");
                    diame = scanner.nextDouble();
                    resul = 3.1416 * diame;

                    System.out.println("\tEl perímetro del círculo es: " + resul * 2);
                }
                break;
            case 2:
                if (operation == 1) {

                    System.out.print("\n\t\tIngresa la longitud del lado del cuadrado: ");
                    lad = scanner.nextDouble();
                    resul = lad * lad;

                    System.out.println("\tEl área del cuadrado es: " + resul);
                } else {
                    System.out.print("\tIngresa la longitud de un lado del cuadrado: ");
                    lad = scanner.nextDouble();
                    resul = 4 * lad;

                    System.out.println("\tEl perímetro del cuadrado es: " + resul);
                }
                break;
            case 3:
                if (operation == 1) {

                    System.out.print("\n\t\tIngresa la base y la altura del triángulo (separados por un espacio): ");
                    base = scanner.nextDouble();
                    alt= scanner.nextDouble();
                    resul = 0.5 * base * alt;
                    System.out.println("\tEl área del triángulo es: " + resul);
                } else {
                    System.out.print("\tIngresa la longitud de los tres lados del triángulo (separados por un espacio): ");
                    lad1 = scanner.nextDouble();
                    lad2 = scanner.nextDouble();
                    lad3 = scanner.nextDouble();
                    semiPeri = (lad1 + lad2 + lad3) / 2;
                    resul = lad1 + lad2 + lad3;

                    System.out.println("\tEl perímetro del triángulo es: " + resul);
                }
                break;
            case 4:
                if (operation == 1) {

                    System.out.print("\n\t\tIngresa la longitud y el ancho del rectángulo (separados por un espacio): ");
                    longi= scanner.nextDouble();
                    anch = scanner.nextDouble();
                    resul = longi * anch;
                    System.out.println("\tEl área del rectángulo es: " + resul);

                } else {

                    System.out.print("\tIngresa la longitud y el ancho del rectángulo (separados por un espacio): ");
                    longi= scanner.nextDouble();
                    anch = scanner.nextDouble();
                    resul = 2 * (longi + anch);
                    System.out.println("\tEl perímetro del rectángulo es: " + resul);
                }
                break;
            case 5:

                if (operation == 1) {

                    System.out.print("\n\t\tIngresa la longitud de un lado del pentágono: ");
                    lad = scanner.nextDouble();
                    resul = 0.5 * lad * lad * (2.2361+ 5) * 0.2;
                    System.out.println("\tEl área del pentágono es: " + resul);

                } else {

                    System.out.print("\tIngresa la longitud de un lado del pentágono: ");
                    lad = scanner.nextDouble();
                    resul = 5 * lad;
                    System.out.println("\tEl perímetro del pentágono es: " + resul);
                }
                break;
        }
    }
}
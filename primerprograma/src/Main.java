import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienbenido(a) a Screen Macth!");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPalicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        //Usando bloque de texto
        String sinopsis = """
                Matris es una paradoja
                la mejor pelicula de fin del milenio
                fue lanzada en: 
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        //Usando Casting Explícito
        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);

        /*Desafío: conversión de temperatura
        int celsius = 40;
        double fahrenheitSinCasting = (celsius * 1.8) + 32;
        int fahrenheitConCasting = (int) fahrenheitSinCasting;

        System.out.println("La temperatura conversión de " + celsius + "C° a °F es: " + fahrenheitSinCasting + "°F");
        System.out.println("La temperatura conversión de " + celsius + "C° a °F es: " + fahrenheitConCasting + "°F");
        */

//Desafío: juego de adivinación
        Scanner entradaUsuario = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100) + 1; // Ajustado para estar entre 1 y 100
        int numeroDeIntentos = 0;
        boolean acertado = false;

        System.out.println(numeroAleatorio);
        System.out.print(String.format("""
                **************************************************************************************
                Adivina el número que se generó aleatoriamente,
                este está entre 1 y 100, tendrás 5 intentos.
                **************************************************************************************
                """));

        while (numeroDeIntentos < 5) {
            System.out.print("Ingresa un número: ");
            int numeroUsuario = entradaUsuario.nextInt();
            numeroDeIntentos++;

            if (numeroUsuario == numeroAleatorio) {
                if (numeroDeIntentos == 1) {
                    System.out.println("Felicidades, acertaste el número en tan solo " + numeroDeIntentos + " intento.");
                    acertado = true;
                    break;
                } else {
                    System.out.println("Felicidades, acertaste el número en tan solo " + numeroDeIntentos + " intentos.");
                    acertado = true;
                    break;
                }
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número es mayor");
            } else {
                System.out.println("El número es menor");
            }
        }

        if (!acertado) {
            System.out.println("Es una lástima, no lograste adivinar el número. Tal vez a la próxima.");
        }
    }
}
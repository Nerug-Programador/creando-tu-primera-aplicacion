import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaDeEvaluaciones = 0;

//Evaluando la película
        for (int i = 0; i < 10; i++) {
            System.out.println("Escribe la nota que le darías a la película Matrix");
            nota = teclado.nextDouble();
            mediaDeEvaluaciones = mediaDeEvaluaciones + nota;
        }
        System.out.println("La media de avaluaciones para Matrix es: " + mediaDeEvaluaciones / 3);
    }
}

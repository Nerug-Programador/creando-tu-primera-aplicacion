import java.util.Scanner;

public class Evaluaciones {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaDeEvaluaciones = 0;
        double totalEvaluaciones = 0;
//Otras formas de iterar datos con while
        while (nota != -1){
            System.out.println("Escribe la nota que le darías a la película Matrix");
            nota = teclado.nextDouble();

            if (nota != -1){
                mediaDeEvaluaciones += nota;
                totalEvaluaciones++;
            }
        }
        System.out.println("La media de avaluaciones para Matrix es: " + mediaDeEvaluaciones / totalEvaluaciones);
    }
}
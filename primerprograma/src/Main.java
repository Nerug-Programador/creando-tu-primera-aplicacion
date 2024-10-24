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
    }
}
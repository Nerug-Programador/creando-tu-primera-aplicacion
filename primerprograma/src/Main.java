public class Main {
    public static void main(String[] args) {
        System.out.println("Bienbenido(a) a Screen Macth!");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPalicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsis = """
                Matris es una paradoja
                la mejor pelicula de fin del milenio
                fue lanzada en: 
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);
    }

}
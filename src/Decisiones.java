public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        if(fechaDeLanzamiento >= 2022){
            System.out.println("Pelicula Popular");
        }else{
            System.out.println("Pelicula Retro");
        }

        if(incluidoEnElPlan == true && tipoPlan.equals("plus")){
            System.out.println("Disfrute su pelicula");
        }else{
            System.out.println("El plan " + tipoPlan + " no incluye esta pelicula :(");
        }
    }
}

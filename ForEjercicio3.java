public class ForEjercicio3 {
    public static void main(String[] args) {

        String [] nombres = {"Pepe", "Juan"};
        String [] nombres1 = {"Ale", "Luis"};
        String[] arrNomb = new String[nombres.length + nombres1.length];


        for (int i = 0; i < nombres.length; i++){
            arrNomb[i] = nombres[i];
        }
        for(int j = 0; j < nombres1.length; j++){
            arrNomb[i] = nombres1[j];
            i++;

        }

    }
}

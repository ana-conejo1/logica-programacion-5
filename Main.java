import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
                Utilizar un objeto HashMap para almacenar los pares de palabras.*/
        HashMap<String, String> diccionario=new HashMap<>();
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("libro", "book");
        diccionario.put("agua", "water");
        diccionario.put("fuego", "fire");
        diccionario.put("silla", "chair");
        diccionario.put("ventana", "window");
        diccionario.put("puerta", "door");
        diccionario.put("auto", "car");
        diccionario.put("comida", "food");
        diccionario.put("cielo", "sky");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("mesa", "table");
        diccionario.put("tren", "train");
        diccionario.put("avión", "plane");
        diccionario.put("niño", "child");
        diccionario.put("día", "day");
        diccionario.put("noche", "night");

        /*
        Escoger al azar 5 palabras en español del mini diccionario.
         */
        List<String> palabras = new ArrayList<>(diccionario.keySet()); //el metodo keySet puede hacer una  lista de keys
        Collections.shuffle(palabras); //el metodo shuffle las desordena
        List<String> palabrasSeleccionadas = palabras.subList(0, 5); //sublist toma las primeras 5

        /*
        Pedir al usuario que teclee la traducción al inglés de cada una de las palabras y comprobará si son correctas.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe la traducción de cada palabra, da enter para continuar");

        int correctas=0;
        int incorrectas=0;

        for (String i:palabrasSeleccionadas){
            System.out.println(i);
            String respuesta = scanner.nextLine().trim().toLowerCase();

            if (respuesta.equals(diccionario.get(i))) {
                System.out.println("✅ ¡Correcto!");
                correctas++;
            } else {
                System.out.println("❌ Incorrecto. La respuesta correcta era: " + diccionario.get(i));
                incorrectas++;
            }

        }
        /*
        Al final debe mostrar por consola cuántas respuestas correctas e incorrectas tiene el usuario.
        Al final de tu práctica, tienes que subir el ejercicio a tu repositorio de GitHub.*/

        System.out.println("\nResultados:");
        System.out.println("Correctas: " + correctas);
        System.out.println("Incorrectas: " + incorrectas);


    }
}
